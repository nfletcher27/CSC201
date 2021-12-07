
public class Question  {     
   
   private String text;
   private String answer;
   
   public Question() // The basic question object we can use for our program, and as a framework for our other object
   {
       text = "";
       answer = "";
   }
   public void setText(String questionText) {
       text = questionText;
   }
   public void setAnswer(String correctResponse) {
       answer = correctResponse;
   }
   public boolean checkAnswer(String response)  { 
       return response.replaceAll("\\s+","").toLowerCase().equals(answer.replaceAll("\\s+","").toLowerCase());
   }
  
   public void display() {
       System.out.println(text);
   }
   
}
