import java.util.*;
public class cengagePractice
{

     public static void main(String args[])

     {

          Scanner in=new Scanner(System.in);

	  System.out.println("Enter the three first names:");
          System.out.print("Enter the 1st name:");
          String name1=in.next();
          System.out.print("Enter the 2nd name:");
          String name2=in.next();
          System.out.print("Enter the 3rd name:");
          String name3=in.next();


          String c1=name1.concat(" "+name2);
          String c2=name1.concat(" "+name3);
          String c3=name2.concat(" "+name1);
          String c4=name2.concat(" "+name3);
          String c5=name3.concat(" "+name1);
          String c6=name3.concat(" "+name2);

	  System.out.println("Different name combinations are:");
          System.out.println(c1);
          System.out.println(c2);
          System.out.println(c3);
          System.out.println(c4);
          System.out.println(c5);
          System.out.println(c6);
          in.close();

     }

}
