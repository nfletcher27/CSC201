import java.util.Scanner;

public class Growth {
    public static void main(String[] args) {
    	// y = a(1+r)^x
    	// a = initial value
    	// r = growth time
    	// x = time interval
    	Scanner scan = new Scanner(System.in);
    	System.out.println("This is a growth calculator");
    	System.out.println("What is your starting value?");
    	int a = scan.nextInt();
    	System.out.println("What is your growth time?");
    	double r = scan.nextDouble();
    	System.out.println("What is your time interval?");
    	int x = scan.nextInt();
    	System.out.println(calculate(a, r, x));
    	scan.close();
    }
    public static int calculate(int a, double r, int x) {
    	return (int)(a*Math.pow((1+r), x));
    }
}
