import java.util.*;
public class DistanceFromAverage {
    public static void main (String[] args) {
      
      double[] values = new double[20];
      int userEntry;
      int x = 1;
      int y = 0;
      int total = 0;
      double average;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a number");
      userEntry = in.nextInt();
      if (userEntry == 99999)
        System.out.println("Enter a number");
      while (userEntry != 99999 && x < values.length)
      {
          values[x] = userEntry;
          total = total + userEntry;
          System.out.println("Enter a number");
          userEntry = in.nextInt();
          if (userEntry == 99999)
            break;
          x++;
      }
        
    average = total/x;
    System.out.println("The average is " + average);
    for (y = 1; y <= x; ++y)
    {
        System.out.println(values[y] + " is " + (values[y] - average) + " away from average");
    }
 }
}
