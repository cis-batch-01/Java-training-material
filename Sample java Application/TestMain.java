package com.technocis.pf;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char registerChoice = 'n';
		do {
			System.out.println("Enter the name");
			String name = scan.nextLine();
			User user = new User(name);
			if (!(UserService.register(user))) {
				System.out.println("Try again later...");
			} else {
				System.out.println("Registered Successfullly");
				char redoChoice = 'n';
				do {
					System.out.println("1.About Me\n2.UserList\n3.Logout");
					int choice = Integer.parseInt(scan.nextLine());
					switch (choice) {
					case 1:
						System.out.println(user);
						break;
					case 2:
						System.out.println("Registered Users");
						User[] userList = UserService.getUsers();
						for (int i = 0; i < UserService.getIndex(); i++) {
							System.out.println(userList[i]);
						}
						break;
					case 3:
						System.out.println("Log out Successfully");
						break;
					default:
						System.out.println("Invalid choice");
					}
					if (choice != 3) {
						System.out.println("Do you want to continue(y/n)");
						redoChoice = scan.nextLine().charAt(0);
					} else {
						System.out.println("Register more...(y/n)");
						registerChoice = scan.nextLine().charAt(0);
					}

				} while (redoChoice == 'y' || redoChoice == 'Y');
			}
		} while (registerChoice == 'y' || registerChoice == 'Y');
		System.out.println("Program Terminated");

	}

}
