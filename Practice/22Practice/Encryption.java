public class Encryption {
    public static void main(String[] args) {
    int key = 5;
    String text = "This is a test for encryption";
    char[] chars = text.toCharArray();
    for(char c : chars) {
    	c += key;
    	System.out.print(c);
    }
    // Short encryption program
    // In short, to reverse this logic you would simply input the encrypted message and use the key (5) and do the opposite
    }
}
