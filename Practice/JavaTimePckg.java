// display the current date using the now() method

import java.time.LocalDate; // gives us the LocalDate class and methods
LocalDate myObj = LocalDate.now(); // create date object
System.out.print(myoBj); // display date

// disaply current time using now() method
public class Main {
  public static void main(String[] args) {
    LocalTime currTime = LocalTime.now();
    System.out.println(currTime);
  }
}

// same process for date and time
LocalDateTime myObj = LocalDateTime.now();
System.out.println(myObj);

// We can use the DateTimeFormatter class and ofPattern() to format or parse time objects
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    
    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}

