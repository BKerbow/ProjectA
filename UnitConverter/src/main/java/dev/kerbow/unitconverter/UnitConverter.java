package dev.kerbow.unitconverter;

import java.util.Scanner;

/*
 * This program converts certain units of measurement into other units.
 * 
 * The conversions are kept within certain sub menu layers, accessed by selecting via
 * user input from the options presented.
 * 
 * It uses nested switch statements to further group and organize the conversions by Volume, Distance,
 * Time, and Mass. The final option allows you to either quit the program, or to go back to previous menus
 * in the menu tree.
 * 
 */

public class UnitConverter {
	
	public static void main(String[] args) {
		int menuSelection = 0;
		
		while (menuSelection != 5) {
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
					System.out.println("4. Mililiter to US Fluid Ounce");
					System.out.println("5. Go Back to Previous Menu");
					
					menuSelection = menuScan.nextInt();
					switch (menuSelection) {
						case 1: {
							System.out.println("Please enter the number of Cups");
							float cups = menuScan.nextInt();
							System.out.println("In your provided amount of Cups, there are " + (cups * 48) + " Teaspoons");
							break;
						}
						case 2:{
							System.out.println("Please enter the number of Liters");
							float liters = menuScan.nextInt();
							System.out.println("In your provided amount of Liters, there are " + (liters / 3.785) + " Gallons");
							break;
						}
						case 3:{
							System.out.println("Please enter the number of Gallons");
							float gallons = menuScan.nextInt();
							System.out.println("In your provided amount of Gallons, there are " + (gallons / 1.201) + " Imperial Gallons");
							break;
						}
						case 4:{
							System.out.println("Please enter the number of Mililiters");
							float mililiters = menuScan.nextInt();
							System.out.println("In your provided amount of Cups, there are " + (mililiters / 29.574) + " US Fluid Ounces");
							break;
						}
						default:{
							menuSelection = 0;
							break;
						}
					}
					break;
				}
				case 2: {
					System.out.println("Please Select an Option to Convert");
					System.out.println("1. Miles to Kilometers");
					System.out.println("2. Inches to Milimeter");
					System.out.println("3. Centimeter to Yard");
					System.out.println("4. Nautical Mile to Mile");
					System.out.println("5. Go Back to Previous Menu");
					menuSelection = menuScan.nextInt();
					
						switch(menuSelection) {
						case 1: {
							System.out.println("Please enter the number of Miles");
							float miles = menuScan.nextInt();
							System.out.println("In your provided amount of Miles, there are " + (miles * 1.609) + " Kilometers");
							break;
						}
						case 2:{
							System.out.println("Please enter the number of Inches");
							float inches = menuScan.nextInt();
							System.out.println("In your provided amount of Inches, there are " + (inches * 25.4) + " Milimeters");
							break;
						}
						case 3:{
							System.out.println("Please enter the number of Centimeters");
							float centimeters = menuScan.nextInt();
							System.out.println("In your provided amount of Centimeters, there are " + (centimeters / 91.44) + " Yards");
							break;
						}
						case 4:{
							System.out.println("Please enter the number of Nautical Miles");
							float nautMiles = menuScan.nextInt();
							System.out.println("In your provided amount of Nautical Miles, there are " + (nautMiles *1.151) + " Miles");
							break;
						}
						default:{
							menuSelection = 0;
							break;
						}
					}
					break;
				}
				case 3: {
					System.out.println("Please Select an Option to Convert");
					System.out.println("1. Minute to Day");
					System.out.println("2. Day to Decade");
					System.out.println("3. Week to Hour");
					System.out.println("4. Hour to Calendar Year");
					System.out.println("5. Go Back to Previous Menu");
					menuSelection = menuScan.nextInt();
					
						switch(menuSelection) {
						case 1: {
							System.out.println("Please enter the number of Minutes");
							float minutes = menuScan.nextInt();
							System.out.println("In your provided amount of Minutes, there are " + (minutes / 1440) + " Days");
							break;
						}
						case 2:{
							System.out.println("Please enter the number of Days");
							float days = menuScan.nextInt();
							System.out.println("In your provided amount of Days, there are " + (days / 3650) + " Decades");
							break;
						}
						case 3:{
							System.out.println("Please enter the number of Weeks");
							float weeks = menuScan.nextInt();
							System.out.println("In your provided amount of Weeks, there are " + (weeks * 168) + " Hours");
							break;
						}
						case 4:{
							System.out.println("Please enter the number of Hours");
							float hours = menuScan.nextInt();
							System.out.println("In your provided amount of Hours, there are " + (hours * 8760) + " Calendar Years");
							break;
						}
						default:{
							menuSelection = 0;
							break;
						}
					}
					break;
				}
				case 4: {
					System.out.println("Please Select an Option to Convert");
					System.out.println("1. Pound to Ounce");
					System.out.println("2. Imperial Ton to Metric Ton");
					System.out.println("3. Pound to Stone");
					System.out.println("4. Ounce to Gram");
					System.out.println("5. Go Back to Previous Menu");
					menuSelection = menuScan.nextInt();
					
						switch(menuSelection) {
						case 1: {
							System.out.println("Please enter the number of Pounds");
							float pounds = menuScan.nextInt();
							System.out.println("In your provided amount of Pounds, there are " + (pounds * 16) + " Ounces");
							break;
						}
						case 2:{
							System.out.println("Please enter the number of Imperial Tons");
							float impTons = menuScan.nextInt();
							System.out.println("In your provided amount of Imperial Tons, there are " + (impTons *1.016) + " Metric Tons");
							break;
						}
						case 3:{
							System.out.println("Please enter the number of Pounds");
							float pndStone = menuScan.nextInt();
							System.out.println("In your provided amount of Pounds, there are " + (pndStone / 14) + " Stones");
							break;
						}
						case 4:{
							System.out.println("Please enter the number of Ounces");
							float ounces = menuScan.nextInt();
							System.out.println("In your provided amount of Ounces, there are " + (ounces * 28.35) + " Grams");
							break;
						}
						default:{
							menuSelection = 0;
							break;
						}
					}
					break;
				}
				case 5: {
					System.out.println("You have quit the program.");
					menuScan.close();
					break;
				}
			}
		}
	}
}