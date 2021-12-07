import java.util.Scanner;
public class Test {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		Question q1 = new Question();
		q1.setText("Who invented Java?");
		q1.setAnswer("James Gosling");
		
		NumericQuestion q2 = new NumericQuestion();
		q2.setText("What's 9 + 10?");
		q2.setAnswer(21);
		
		Question q3 = new Question();
		q3.setText("Who is the best Java coder ever in the whole world?");
		q3.setAnswer("Nesta");
		
		QuestionPrint(q1);   // Our methods being called clean and concisely taking advantage of subclasses to hide the rest
		QuestionPrint(q2);
		QuestionPrint(q3);
		System.out.println("Great job taking the quiz! No grade needed, an A+ is always rewarded for effort! :)");
	}
		public static void QuestionPrint(Question q) { // Our method to print all our information
			q.display();
			System.out.println("Your answer: ");
			String response = in.nextLine();
			System.out.println(q.checkAnswer(response));
		}
}
