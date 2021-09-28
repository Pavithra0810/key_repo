package com.project1;

//import java.util.Scanner;

public class ProjectMain {

	public static void main(String[] args){
		// Create "main" folder if not present in current folder structure
				FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcome("Virtual Key Repository", "Pavithra");
		//handleWelcomeScreenInput();
		HandleOptions.handleWelcomeScreenInput();
	}

/*	private static void handleWelcomeScreenInput() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MenuOptions.displayMenu();
				int input = sc.nextInt();

				switch (input) {
				case 1:
					FileOperations.displayAllFiles("main");
					break;
				case 2:
					MenuOptions.handleFileMenuOptions();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput();
			} 
		} while (running == true);
	}   */

}