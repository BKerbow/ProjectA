package dev.kerbow.unitconverter;

import java.util.Scanner;

public class UnitConverter {
	
	public static void main(String[] args) {
		int menuSelection = 0;
		
		while (menuSelection != 4) {
			Scanner menuScan = new Scanner(System.in);
			System.out.println("Please Select an Option to Convert:");
			System.out.println("1. Volumes");
			System.out.println("2. Distances");
			System.out.println("3. Time");
			System.out.println("4. Mass");
			System.out.println("5. Quit");
			
		menuSelection = menuScan.nextInt();
		
			switch (menuSelection) {
			case 1: {
				System.out.println("Please Select an Option to Convert");
				System.out.println("1. Cups to Teaspoons");
				System.out.println("2. Liter to US Gallons");
				System.out.println("3. US Gallon to Imperial Gallon");
				System.out.println("4. Milimeter to US Fluid Ounce");
				
				menuScan.nextInt();
				switch (menuSelection) {
				case 1:{
					System.out.println("Please enter the number of Cups");
					float cups;
					cups = menuScan.nextInt();
					System.out.println("In your provided amount of Cups, there are " + (cups * 48) + " Teaspoons");
					break;
				}
				case 2:{
					System.out.println("Please enter the number of Liters");
					float liters;
					liters = menuScan.nextInt();
					System.out.println("In your provided amount of Liters, there are " + (liters / 3.785) + " Gallons");
					break;
				}
				case 3:{
					System.out.println("Please enter the number of Gallons");
					float gallons;
					gallons = menuScan.nextInt();
					System.out.println("In your provided amount of Gallons, there are " + (gallons / 1.201) + " Imperial Gallons");
					break;
				}
				case 4:{
					System.out.println("Please enter the number of Milimeters");
					float milimeters;
					milimeters = menuScan.nextInt();
					System.out.println("In your provided amount of Cups, there are " + (milimeters / 29.574) + " US Fluid Ounces");
					break;
				}
			case 2: {
				System.out.println("Please enter the number of miles.");
				float miles;
				miles = menuScan.nextInt();
				System.out.println("In your provided amount of miles, there are " + (miles * 1.609) + "Kilometers");
				break;
			}
			case 3: {
				System.out.println("You have quit the program.");
				menuScan.close();
				break;
			}
			}
		}
	}
}