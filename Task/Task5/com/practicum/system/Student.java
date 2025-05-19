package com.practicum.system;

import com.practicum.main.LoginSystem;
import com.practicum.data.Item;

import java.util.Scanner;

public class Student extends User {

    public Student(String name, String studentID) {
        super(name, studentID);
    }

    @Override
    public void displayInfo() {
        System.out.println("Welcome, " + getName() + " (NIM: " + getStudentID() + ")");
    }

    public void studentMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n1. Report Item");
            System.out.println("2. View Reported Items");
            System.out.println("0. Logout");
            System.out.print("Choose: ");
            int choice = LoginSystem.getIntInput(scanner);
            scanner.nextLine();

            switch (choice) {
                case 1:
                    reportItem(scanner);
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public void reportItem(Scanner scanner) {
        System.out.print("Item Name: ");
        String name = scanner.nextLine();
        System.out.print("Description: ");
        String desc = scanner.nextLine();
        System.out.print("Location: ");
        String loc = scanner.nextLine();

        Item item = new Item(name, desc, loc, "Reported");
        LoginSystem.reportedItems.add(item);
        System.out.println("Item reported successfully.");
    }

    public void viewReportedItems() {
        boolean found = false;
        for (Item item : LoginSystem.reportedItems) {
            if (item.getStatus().equals("Reported")) {
                item.displayItem();
                found = true;
            }
        }
        if (!found) System.out.println("No item reports yet.");
    }
}