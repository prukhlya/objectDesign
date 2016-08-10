package objectDesignAssignment;

import java.util.Scanner;

public class Neighborhood {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String userInputInt = null;
		String userInputString = null;
		String userInputString2 = null;
		int homeFeatures = 0;
		boolean inputError = false;
		
		SingleFamilyHouse yourHouse = new SingleFamilyHouse();
		
			System.out.println("Let's input the parameters you are looking for in your Single Family Home!");
			System.out.println(" ");
			
			do {
				System.out.println("How many full bathrooms are you looking for?");
				userInputInt = sc.nextLine();
				
				inputError = numberIsValid(userInputInt);
				
			} while (inputError);
			
			homeFeatures = Integer.parseInt(userInputInt);
			yourHouse.setFullBathrooms(homeFeatures);
			
			do {
				
				inputError = false; 
				
				System.out.println("How many half bathrooms are you looking for?");
				userInputInt = sc.nextLine();
				
				inputError = numberIsValid(userInputInt);
				
			} while (inputError);
			
			homeFeatures = Integer.parseInt(userInputInt);
			yourHouse.setHalfBathrooms(homeFeatures);
			
			do {
				
				inputError = false; 
				
				System.out.println("How many floors are you looking for?");
				userInputInt = sc.nextLine();
				
				inputError = numberIsValid(userInputInt);
				
			} while (inputError);
			
			homeFeatures = Integer.parseInt(userInputInt);
			yourHouse.setFloors(homeFeatures);
			
			do {
				
				inputError = false; 
				
				System.out.println("How many windows are you looking for?");
				userInputInt = sc.nextLine();
				
				inputError = numberIsValid(userInputInt);
				
			} while (inputError);
			
			homeFeatures = Integer.parseInt(userInputInt);
			yourHouse.setWindows(homeFeatures);
			
			do {
				
				inputError = false; 
				
				System.out.println("How many bedrooms are you looking for?");
				userInputInt = sc.nextLine();
				
				inputError = numberIsValid(userInputInt);
				
			} while (inputError);
			
			homeFeatures = Integer.parseInt(userInputInt);
			yourHouse.setBedrooms(homeFeatures);
			
			do {
				
				inputError = false; 
				
				System.out.println("What back yard square footage do your require?");
				userInputInt = sc.nextLine();
				
				inputError = numberIsValid(userInputInt);
				
			} while (inputError);
			
			homeFeatures = Integer.parseInt(userInputInt);
			yourHouse.setBackyardSqFt(homeFeatures);
			
			do {
				
				inputError = false; 
				
				System.out.println("Parking for how many vehicles do you require?");
				userInputInt = sc.nextLine();
				
				inputError = numberIsValid(userInputInt);
				
			} while (inputError);
			
			homeFeatures = Integer.parseInt(userInputInt);
			yourHouse.setParkingSpaces(homeFeatures);
			
			do {
				
				inputError = false; 
				
				System.out.println("What is the oldest build year are you comfortable with?");
				userInputInt = sc.nextLine();
				
				inputError = numberIsValid(userInputInt);
				
			} while (inputError);
			
			homeFeatures = Integer.parseInt(userInputInt);
			yourHouse.setYearBuilt(homeFeatures);
			
			
			do {
				System.out.println("What is your prefered exterior color?");
				userInputString = sc.nextLine();
				
				inputError = exteriorIsValid(userInputString);
			} while (inputError);
			
			do {
				System.out.println("What is your prefered interior color?");
				userInputString2 = sc.nextLine();
				
				inputError = interiorIsValid(userInputString2);
			} while (inputError);
			
			System.out.println(yourHouse.toString());
			System.out.println(" ");
			System.out.println("A home with these features is available! Fortunately, it has a " + userInputString + " exterior color and is " + userInputString2 + " on the inside as requested." );
			
	} //main

	
	public static boolean numberIsValid(String someStringToMakeANumber) {
		
		try {
			int aNumber = Integer.parseInt(someStringToMakeANumber);
			return false;
			
		} catch (NumberFormatException e) {
			return true;
		}
	}
	
	
	public static boolean exteriorIsValid(String someStringToMakeAString) {
		
		try {
			int text = Integer.parseInt(someStringToMakeAString);
			return true;
			
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean interiorIsValid(String someStringToMakeAString) {
		
		try {
			int text = Integer.parseInt(someStringToMakeAString);
			return true;
			
		} catch (NumberFormatException e) {
			return false;
		}
	}
} //class
