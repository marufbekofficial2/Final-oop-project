package org.example;

import java.util.Scanner;

public class AdministratorInterface {
    private Administrator administrator;
    private Scanner scanner;

    public AdministratorInterface() {
        administrator = new Administrator();
        scanner = new Scanner(System.in);
    }

    public void start() {
        administrator.login();
        boolean exit = false;

        while (!exit) {
            System.out.println("Administrator Interface:");
            System.out.println("1. Add a record");
            System.out.println("2. Delete a record");
            System.out.println("3. Add a category");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the record: ");
                    String record = scanner.nextLine();
                    administrator.addRecord(record);
                    break;
                case 2:
                    System.out.print("Enter the record to delete: ");
                    record = scanner.nextLine();
                    administrator.deleteRecord(record);
                    break;
                case 3:
                    System.out.print("Enter the category: ");
                    String category = scanner.nextLine();
                    administrator.addCategory(category);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }
}
