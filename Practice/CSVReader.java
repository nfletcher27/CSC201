// Crime statistics being read from CSV file

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
	public static void main(String[] args) {
		
		// This is a file
		// Comma seperated data: 19, Nesta, human, 1/10/2022
		
		String filePath = "C:\\Users\\Nesta\\Downloads\\insurance.csv";
		String line = "";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			
			while((line = reader.readLine()) != null) {
				String[] values = line.split(",");
				System.out.println(values[0] + values[1]);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
