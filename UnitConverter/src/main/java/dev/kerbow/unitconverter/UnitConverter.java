package dev.kerbow.unitconverter;

import java.util.Scanner;

public class UnitConverter {
	
	public static void main(String[] args) {
		int menuSelection = 0;

		//Scanner scanner = new Scanner(System.in);
		
		while (menuSelection != 4) {
			Scanner firstMenuOption = new Scanner(System.in);
			System.out.println("Please Select an Option:");
			System.out.println("1. Cups to Teaspoons");
			System.out.println("2. Miles to Kilometers");
			System.out.println("3. US Gallons to Imperial Gallons");
			System.out.println("4. Quit");
			firstMenuOption.close();
			
			switch (menuSelection) {
			case 1: {
				System.out.println("Please enter the number of cups.");
				//scanner(System.in);
				System.out.println("There are 48 teaspoons in one cup.");
				break;
			}
			case 2: {
				System.out.println("Please enter the number of miles.");
				//User enters Number of Miles
				System.out.println("There are 0.6 miles in one kilometer");
				break;
			}
			case 3: {
				System.out.println("Please enter the number of US Gallons.");
				//User enters number of US gallons
				System.out.println("There are 0.8 Gallons in one Imperial Gallon");
				break;
			}
			case 4:{
				System.out.println("You have quit the program.");
				break;
			}
			default:{
				System.out.println("You have selected an invalid option.");
			}
			}
		}
		}
		
		

}
