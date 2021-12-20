// RegEx is a way to search for things 
// example: searching for the word w3schools
public class Main {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Visit W3Schools!");
    boolean(matchFound) {
      System.out.println("Match found!");
    } else {
      System.out.println("Match not found!");
    }
  }
}
// outputs Match found

