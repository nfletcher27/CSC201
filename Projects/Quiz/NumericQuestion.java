
public class NumericQuestion extends Question {
	
	private double answer;
	
	public void setAnswer(double correctResponse) {
		
		answer = correctResponse;
	}
	public boolean checkAnswer(String response) { // We're altering this method so that it checks our answer in a new way
		
		double dubresponse = Double.parseDouble(response);
		return Math.abs(dubresponse-answer) <= 0.01;
	}

}
