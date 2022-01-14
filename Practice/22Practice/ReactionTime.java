import java.util.Scanner;

public class ReactionTime {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);
		
		System.out.println("Go!");
		long start = System.currentTimeMillis();
		
		Scanner scan = new Scanner(System.in);
		scan.next();
		long stop = System.currentTimeMillis();
		
		long reactionTime = stop - start;
		
		System.out.println(reactionTime + "ms");
		
		scan.close();
	}

}

	
	
