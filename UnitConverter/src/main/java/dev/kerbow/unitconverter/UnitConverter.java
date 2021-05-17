package dev.kerbow.unitconverter;

import java.util.Scanner;

public class UnitConverter {
	
	public static void main(String[] args) {
		int menuSelection = 0;
		
		while (menuSelection != 4) {
			Scanner menuSelection = new Scanner(System.in);
			System.out.println("Please Select an Option:");
			System.out.println("1. Cups to Teaspoons");
			System.out.println("2. Miles to Kilometers");
			System.out.println("3. US Gallons to Imperial Gallons");
			System.out.println("4. Quit");
			break;
		}
		
		Scanner scanner = new Scanner(System.in);
		menuSelection = scanner.nextInt();
		
			switch (menuSelection) {
			case 1: {
				System.out.println("Please enter the number of cups.");
				double cups;
				cups = scanner.nextInt();
				System.out.println("In your provided amount of cups, there are " + (cups / 48) + " Teaspoons");
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