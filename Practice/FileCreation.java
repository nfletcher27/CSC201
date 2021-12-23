public class CreateFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occured.");
      e.printStackTrace();
    }
  }
}

// To create a file in a specific directory, specify the file and use double backslashes
File myObj = new File("C:\\Users\\MyName\\filename.txt");

// To write to a file, we use FileWriter and write() as well as close()
public class Main {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("Files in Java might be tricky, but it's fun!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occured.");
      e.printStackTrace();
    }
  }
}
