package oop.assignment1.projectb;

import java.util.Scanner;

public class projectB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        while (true) {
        	int retry = 0;
    		showMenu();
    		int choice = (int) sc.nextDouble();
    		checkMenuChoice(choice, sc);
    		checkQuit(choice);
            switch (choice) {
                case 1:
                	if(loginValidation(sc,retry)) {
                        showEnterNewComputers(sc);
                        break;
                	}else {
                		break;
                	}

                case 2:
                	if(loginValidation(sc,retry)) {
                		showChangeInformation(sc);
                        break;
                	}else {
                		break;
                	}
                case 3:
                	showDisplayByBrand(sc);
                	break;
                case 4:
                	showDisplayUnderPrice(sc);
                	break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

	}

	private static void showMenu() {
		System.out.println("What do you want to do?");
		System.out.println("\t1.  Enter new computers(password required)");
		System.out.println("\t2.  Change information of a computer(password required)");
		System.out.println("\t3.  Display all computers by a specific brand");
		System.out.println("\t4.  Display all computers under a certain a price.");
		System.out.println("\t5.  Quit");
		System.out.println("Please enter your choice:");
	}

	private static void checkQuit(int choice) {
		while (choice == 5) {
			System.out.println("Exiting the program, goodbye!");
			System.exit(0);
		}
	}

	private static void checkMenuChoice(int choice, Scanner sc) {
		while (choice < 1 || choice > 5) {
			System.out.println("Please reenter your choice (1-5):");
			choice = (int) sc.nextDouble();
		}
	}
	
	private static boolean loginValidation(Scanner sc,int retry) {
        while(!login(sc)) {
         	retry++;
            System.out.println("Login failed. Attempts remaining: " + (3 - retry));
            if (retry >= 3) {
                System.out.println("Too many failed attempts. Returning to the main menu.");
                retry = 0; // Reset attempts after reaching the limit
                return false;
            }
        }
        return true;
	}
	
	private static boolean login(Scanner sc) {
        String password = "password"; 
        System.out.println("Enter the password:");
        String inputPassword = sc.next();
        return password.equals(inputPassword);
	}
	
	private static void showEnterNewComputers(Scanner sc) {
		while (true) {
            System.out.println("\nWelcome to showEnterNewComputers:");
            System.out.println("1. Perform Action");
            System.out.println("2. Return to Home");

            int subMenuChoice = sc.nextInt();

            switch (subMenuChoice) {
                case 1:
                    System.out.println("Performing action in showEnterNewComputers.");
                    break;
                case 2:
                    System.out.println("Returning to the main menu.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
	}
	private static void showChangeInformation(Scanner sc) {
		while (true) {
            System.out.println("\nWelcome to showChangeInformation:");
            System.out.println("1. Perform Action");
            System.out.println("2. Return to Home");

            int subMenuChoice = sc.nextInt();

            switch (subMenuChoice) {
                case 1:
                    System.out.println("Performing action in showChangeInformation.");
                    break;
                case 2:
                    System.out.println("Returning to the main menu.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
	}
	private static void showDisplayByBrand(Scanner sc) {
		while (true) {
            System.out.println("\nWelcome to showDisplayUnderPrice:");
            System.out.println("1. Perform Action");
            System.out.println("2. Return to Home");

            int subMenuChoice = sc.nextInt();

            switch (subMenuChoice) {
                case 1:
                    System.out.println("Performing action in showDisplayUnderPrice.");
                    break;
                case 2:
                    System.out.println("Returning to the main menu.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
	}
	private static void showDisplayUnderPrice(Scanner sc) {
		while (true) {
            System.out.println("\nWelcome to showDisplayUnderPrice:");
            System.out.println("1. Perform Action");
            System.out.println("2. Return to Home");

            int subMenuChoice = sc.nextInt();

            switch (subMenuChoice) {
                case 1:
                    System.out.println("Performing action in showDisplayUnderPrice.");
                    break;
                case 2:
                    System.out.println("Returning to the main menu.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
	}

}
