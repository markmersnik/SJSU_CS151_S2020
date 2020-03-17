package homework5;

import java.util.Scanner;

public class IntToHex {
	public static void main(String[] args) {
		
		Scanner input = null;
		
		System.out.println("Please enter an integer:");
		while(true) {
			input = new Scanner(System.in);
			if(input.hasNextInt()) {
				int number = input.nextInt();
				System.out.println("The Integer "+ number + " converted to Hex is: 0x" + Integer.toHexString(number).toUpperCase());
				input.close();
				break;
			}
			else {
				System.out.println("Input must be an integer. Please try again.");
			}
		}
	}	
}
