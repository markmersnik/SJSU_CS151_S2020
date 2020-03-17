package homework5;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class CreateFile {
	public static void main(String[] args) throws IOException{
		FileOutputStream output = null;
		Scanner input = null;
		
		try {
			output = new FileOutputStream("command_line_input.txt");
			System.out.println("Enter '@q' to quit");
			while(true) {
				input = new Scanner(System.in);
					
				String userInput = input.nextLine();
				
				if(userInput.equals("@q")) {
					break;
				}
				else if(userInput != null) {
					userInput += "\n";
					output.write(userInput.getBytes(Charset.forName("UTF-8")));
				}	
			}
			
		} finally{
			if(output != null) {
				output.close();
			}
			input.close();
			System.out.println("Done.");
		}
	}
}
