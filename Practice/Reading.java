import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		
	
	File file = new File("/Users/Nesta/OneDrive/Desktop/Desktop/Records/Notes/CSC201.txt");
	Scanner scan = new Scanner(file);
	
	String fileContents = "";
	while(scan.hasNextLine()) {
		System.out.println();
		fileContents = fileContents.concat(scan.nextLine() + "\n");
	}
	
	FileWriter writer = new FileWriter("/Users/Nesta/OneDrive/Desktop/Desktop/Records/Notes/CSC202.txt");
	writer.write(fileContents);
	writer.close();
	scan.close();
	}
}
