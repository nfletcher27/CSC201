import package.name.Class; // imports a single class
import package.Name.*; // imports a whole package

// for example, importing our Scanner
import java.util.Scanner;

// example program of Scanner
class myClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");
    
    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}

// to import a package
import java.util.*;

/* To create your own packages, understanding the Java file directory is important

It is similar to folders on a computer:
root -->
  mypack -->
    MyPackageClass.java
    
To create a package, use the package keyword */

package mypack;
class MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}

/*  Save the file as MyPackageClass.java and compile it

C:\Users\Yourname\javac MyPackageClass.java

Then compile the package:
C:\Users\Yourname\javac -d . MyPackageClass.java

This forces the compiler to create the "mypack" package.
The -d keyword specifies the destination for where to save the class file. The package name should be written in lowercase to avoid conflict with class names.

To run the MyPackageClass.java file write the following:
C:\Users\YourName>java mypack.MyPackageClass

The output will look like:
This is my package! */ 
end
