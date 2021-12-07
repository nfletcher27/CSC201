import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// Nesta Fletcher
		// 12/5/2021
		// Horstmann Chapter 9, Project P9.1
		// A simple quiz using subclasses to make the main method more visually appealing an understanding to alter the program.
		Question q1 = new Question();
		q1.setText("Who invented Java?");
		q1.setAnswer("James Gosling");
		
		NumericQuestion q2 = new NumericQuestion();
		q2.setText("What's 9 + 10?");
		q2.setAnswer(21);
		
		Question q3 = new Question();
		q3.setText("Who is the best Java coder ever in the whole world?");
		q3.setAnswer("Nesta");
		
		QuestionAnswer(q1);
		QuestionAnswer(q2);
		QuestionAnswer(q3);
		System.out.println("Great job taking the quiz! No grade needed, an A+ is always rewarded for effort! :)");
	}
		public static void QuestionAnswer(Question q) {
			q.display();
			System.out.println("Your answer: ");
			Scanner in = new Scanner(System.in);
			String response = in.nextLine();
			System.out.println(q.checkAnswer(response));
		}
}
