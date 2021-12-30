public class BBQ {
  public static void main(String [] args) {
    
    Queue<String> bbqLine = new LinkedList<String>();
    
    bbqLine.add("Jackson");
    bbqLine.add("Tyriq");
    bbqLine.add("Susan");
    
    System.out.println(bbqLine);
    
    bbqLine.poll();  // removes first object in line
    
    bbqLine.peek();  // returns the first person but doesn't effect it
    
    Queue<String> q = new LinkedList<String>();
    
    q.add("A");
    q.add("B");
    q.add("C");
    
    q.poll(); // A is out of the line
    System.out.println(q);  // will print [B, C]
  }
}
    
