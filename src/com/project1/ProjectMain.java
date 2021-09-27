package com.project1;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
import java.util.Scanner;

public class ProjectMain {

	public static void main(String[] args){
		//Welcome.printWelcome("Virtual Key Repository", "Pavithra");
		MenuOptions.printWelcome("Virtual Key Repository", "Pavithra");
		handleWelcomeScreenInput();
	}

	private static void handleWelcomeScreenInput() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		
		do {
			//MenuOptions.displayMenu();
			//int input = sc.nextInt();
			try {
				MenuOptions.displayMenu();
				int input = sc.nextInt();

		/*	switch (input) {
			case 1:
			displayAllFiles();
		      break;
			case 2:
				MenuOptions.displayFileMenuOptions();
				break;

			case 3:
		     System.out.println("Program exited successfully.");
				System.exit(0);
				break;
			default:
				System.out.println("Please select a valid option from above.");
			}*/
				switch (input) {
				case 1:
					FileOperations.displayAllFiles("./main");
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

	/*	sc.close();

	}

	private static void displayAllFiles() {
		// All required files and folders inside main folder relative to current folder
		System.out.println("Displaying all files with directory structure in ascending order\n");
		List<String> filesListNames = FileOperations.listFilesInDirectory("./main", 0, new ArrayList<String>());

		System.out.println("Displaying all files in ascending order\n");
		Collections.sort(filesListNames);

		filesListNames.stream()
				.forEach(System.out::println);    */
	}
}