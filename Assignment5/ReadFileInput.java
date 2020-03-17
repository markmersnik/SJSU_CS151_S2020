package homework5;

import java.io.*;

public class ReadFileInput {
	public static void main(String[] args) {
		File input = null;
		FileReader myReader = null;
		
		try {
			input = new File("quote.txt");
			
			myReader = new FileReader(input);
			
			int letter = myReader.read();
			
			while(letter != -1) {
				System.out.print((char)letter);
				letter = myReader.read();
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
