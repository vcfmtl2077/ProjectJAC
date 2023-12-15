package oop.assignment1.projectb;

import java.util.Scanner;

import oop.assignment1.projectb.model.Computer;

public class projectB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to X computer store!");
		System.out.println("Set the maximun computers of this store? Please input: ");
		int maxComputers = (int) sc.nextDouble();

		Computer[] inventory = new Computer[maxComputers];

		while (true) {
			int retry = 0;
			showMenu();
			int choice = (int) sc.nextDouble();
			checkMenuChoice(choice, sc);
			checkQuit(choice);
			switch (choice) {
			case 1:
				if (loginValidation(sc, retry)) {

					showEnterNewComputers(sc, inventory);
					break;
				} else {
					break;
				}

			case 2:
				if (loginValidation(sc, retry)) {
					showChangeInformation(sc, inventory);
					break;
				} else {
					break;
				}
			case 3:
				showDisplayByBrand(sc, inventory);
				break;
			case 4:
				showDisplayUnderPrice(sc, inventory);
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

	private static int actualSize(Computer[] com) {
		int size = 0;
		for (int i = 0; i < com.length; i++) {
			if (com[i] != null) {
				size++;
			}
		}
		return size;

	}

	private static void checkMenuChoice(int choice, Scanner sc) {
		while (choice < 1 || choice > 5) {
			System.out.println("Please reenter your choice (1-5):");
			choice = (int) sc.nextDouble();
		}
	}

	private static boolean loginValidation(Scanner sc, int retry) {
		while (!login(sc)) {
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

	private static void showEnterNewComputers(Scanner sc, Computer[] inventory) {
		while (true) {
			int inStock = inventory.length - actualSize(inventory);
			System.out.println("\nEnter new computers. Please enter your choice (1 or 2)");

			System.out.println("1. Add new computers.");
			System.out.println("2. Return to Home");

			int subMenuChoice = sc.nextInt();

			switch (subMenuChoice) {
			case 1:
				System.out.println("Please input the number of computers you want to add: ");
				int num = (int) sc.nextDouble();

				if (num <= inStock) {
					for (int i = 0; i < num; i++) {
						Computer pc = new Computer();
						System.out.println("Please add index " + i + " computer info:");
						System.out.print("Please input computer brand: ");
						pc.setBrand(sc.next());
						System.out.println();
						System.out.print("Please input computer model: ");
						pc.setModel(sc.next());
						System.out.println();
						System.out.print("Please input computer SN: ");
						pc.setSN(sc.nextLong());
						System.out.println();
						System.out.print("Please input computer price: ");
						pc.setPrice(sc.nextDouble());
						System.out.println();
						inventory[actualSize(inventory) + i] = pc;
					}
					System.out.println("Add " + num + " computers successfully. Returning to the main menu.");
					return;
				} else {
					System.out.println("Sorry, ther is not enough spaces, you can only add " + inStock + " computers.");
				}
				break;
			case 2:
				System.out.println("Returning to the main menu.");
				return;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}

	private static void showChangeInformation(Scanner sc, Computer[] inventory) {
		while (true) {
			System.out.println("\nEnter new computers. Please enter your choice (1 or 2)");
			System.out.println("1. Update information of a computer.");
			System.out.println("2. Return to Home");

			int subMenuChoice = sc.nextInt();

			switch (subMenuChoice) {
			case 1:
				System.out.println(
						"Please input the index of computers you want to update (1-" + inventory.length + "): ");
				int num = (int) sc.nextDouble();

				Computer pc = inventory[num - 1];
				if (pc == null) {
					System.out.println("Sorry, ther is not valid information for No. " + num
							+ " computer. Please enter your choice (1 or 2)");
					System.out.println("1. Update information of a computer.");
					System.out.println("2. Return to Home");
					subMenuChoice = sc.nextInt();
				} else {
					System.out.println("We found your computer. Here is the detail information:");
					System.out.println("Computer  #" + num);
					System.out.println("Brand: " + pc.getBrand());
					System.out.println("computerModel, model of this computer: " + pc.getModel());
					System.out.println("SN, serial number (SN) of this computer: " + pc.getSN());
					System.out.println("Price: $" + pc.getPrice());

					while (true) {
						System.out.println("What information would you like to change?");
						System.out.println("\t1.  Brand");
						System.out.println("\t2.  Model");
						System.out.println("\t3.  SN");
						System.out.println("\t4.  Price");
						System.out.println("\t5.  Quit");
						System.out.println("Please enter your choice:");
						int updateChoice = sc.nextInt();

						switch (updateChoice) {
						case 1:
							System.out.print("Please input your brand:");
							pc.setBrand(sc.next());
							System.out.println();
							break;
						case 2:
							System.out.print("Please input your model:");
							pc.setModel(sc.next());
							System.out.println();
							break;
						case 3:
							System.out.print("Please input your SM:");
							pc.setSN(sc.nextLong());
							System.out.println();
							break;
						case 4:
							System.out.print("Please input your price:");
							pc.setPrice(sc.nextDouble());
							System.out.println();
							break;
						case 5:
							System.out.println("Returning to the main menu.");
							return;
						default:
							System.out.println("Invalid choice. Please enter a valid option.");
						}
					}
				}
				break;
			case 2:
				System.out.println("Returning to the main menu.");
				return;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}

	private static void showDisplayByBrand(Scanner sc, Computer[] inventory) {
		while (true) {
			System.out.println("\nFind computers by brand. Please enter your choice (1 or 2)");
			System.out.println("1. Find all computers by brand.");
			System.out.println("2. Return to Home");

			int subMenuChoice = sc.nextInt();

			switch (subMenuChoice) {
			case 1:
				System.out.print("Please input your brand name: ");
				String brand = sc.next();
				
				Computer[] result = findComputersByBrand(brand,inventory);
				
				if(actualSize(result)!=0) {
					for(int i=0; i<actualSize(result);i++) {
						System.out.println("Find a match computer:");
						System.out.println("\tComputer Brand: "+result[i].getBrand());
						System.out.println("\tComputer Model: "+result[i].getModel());
						System.out.println("\tComputer SN: "+result[i].getSN());
						System.out.println("\tComputer Price: "+result[i].getPrice());
					}
				}else {
					System.out.println("No matched computer was found.");
				}
				break;
			case 2:
				System.out.println("Returning to the main menu.");
				return;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}

	private static void showDisplayUnderPrice(Scanner sc, Computer[] inventory) {
		while (true) {
			System.out.println("\nFind computers cheapter than a cvertain price. Please enter your choice (1 or 2)");
			System.out.println("1. Find all cheaper computers.");
			System.out.println("2. Return to Home");

			int subMenuChoice = sc.nextInt();

			switch (subMenuChoice) {
			case 1:
				System.out.print("Please input your target price: ");
				int price = sc.nextInt();
				
				Computer[] result = findCheaperThan(price,inventory);
				
				if(actualSize(result)!=0) {
					for(int i=0; i<actualSize(result);i++) {
						System.out.println("Find a match computer lower than "+price);
						System.out.println("\tComputer Brand: "+result[i].getBrand());
						System.out.println("\tComputer Model: "+result[i].getModel());
						System.out.println("\tComputer SN: "+result[i].getSN());
						System.out.println("\tComputer Price: "+result[i].getPrice());
					}
				}else {
					System.out.println("No matched computer was found.");
				}
				break;
			case 2:
				System.out.println("Returning to the main menu.");
				return;
			default:
				System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}
	
	private static Computer[] findComputersByBrand(String brand, Computer[] inventory) {
		Computer[] result = new Computer[actualSize(inventory)];
		int index = 0;
		
		for(int i=0;i<inventory.length;i++) {
			if(inventory[i]!=null&&inventory[i].getBrand().equals(brand)) {
				result[index] = inventory[i];
			}
		}
		
		return result;
	}
	
	private static Computer[] findCheaperThan(int price, Computer[] inventory) {
		Computer[] result = new Computer[actualSize(inventory)];
		int index = 0;
		
		for(int i=0;i<inventory.length;i++) {
			if(inventory[i]!=null&&inventory[i].getPrice()<=price) {
				result[index] = inventory[i];
			}
		}
		
		return result;
	}

}
