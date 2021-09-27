package com.project1;
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
			MenuOptions.displayMenu();
			int input = sc.nextInt();

			switch (input) {
			case 1:
				// All required files and folders inside main folder relative to current folder
				FileOperations.listFilesInDirectory("./main", 0);
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
			}
		} while (running == true);

		sc.close();

	}


	}


