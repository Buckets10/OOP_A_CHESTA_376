package com.practicum.system;

import com.practicum.main.LoginSystem;
import com.practicum.data.Item;

import java.util.Scanner;

public class Admin extends User {
    private final String username;
    private final String password;

    public Admin(String name, String studentID, String username, String password) {
        super(name, studentID);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {

        return username; }
    public String getPassword() {
        return password; }

    @Override
    public void displayInfo() {
        System.out.println("Admin: " + getName());
    }

    public void adminMenu(Scanner scanner) {
        while (true) {
            System.out.println("\n1. Manage Items");
            System.out.println("2. Manage Users");
            System.out.println("0. Logout");
            System.out.print("Choose: ");
            int choice = LoginSystem.getIntInput(scanner);
            scanner.nextLine();

            switch (choice) {
                case 1:
                    manageItems(scanner);
                    break;
                case 2:
                    manageUsers(scanner);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public void manageItems(Scanner scanner) {
        System.out.println("\n1. View All Reports");
        System.out.println("2. Mark Item as Claimed");
        System.out.print("Choose: ");
        int choice = LoginSystem.getIntInput(scanner);
        scanner.nextLine();

        switch (choice) {
            case 1:
                for (Item item : LoginSystem.reportedItems) item.displayItem();
                break;
            case 2:
                for (int i = 0; i < LoginSystem.reportedItems.size(); i++) {
                    Item item = LoginSystem.reportedItems.get(i);
                    if ("Reported".equals(item.getStatus())) {
                        System.out.println((i + 1) + ": " + item.getItemName());
                    }
                }

                System.out.print("Enter index to mark as claimed: ");
                int idxInput = LoginSystem.getIntInput(scanner);  // the number the admin typed
                int idxArray = idxInput - 1;                      // 2️⃣ convert to 0‑based
                scanner.nextLine();                               // consume newline

                try {
                    Item target = LoginSystem.reportedItems.get(idxArray);
                    if ("Reported".equals(target.getStatus())) {
                        target.setStatus("Claimed");
                        System.out.println("Item marked as claimed.");
                    } else {
                        System.out.println("Item already claimed.");
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Invalid index. Please choose a listed number.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public void manageUsers(Scanner scanner) {
        System.out.println("\n1. Add Mahasiswa");
        System.out.println("2. Delete Mahasiswa");
        System.out.print("Choose: ");
        int choice = LoginSystem.getIntInput(scanner);
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter NIM: ");
                String nim = scanner.nextLine();
                LoginSystem.userList.add(new Student(name, nim));
                System.out.println("Mahasiswa added.");
                break;
            case 2:
                System.out.print("Enter NIM to delete: ");
                String deleteNim = scanner.nextLine();
                boolean removed = false;
                for (int i = 0; i < LoginSystem.userList.size(); i++) {
                    User user = LoginSystem.userList.get(i);
                    if (user instanceof Student && user.getStudentID().equals(deleteNim)) {
                        String studentName = user.getName(); // get name before deleting
                        LoginSystem.userList.remove(i);
                        removed = true;
                        System.out.println("Mahasiswa " + studentName + " (" + deleteNim + ") deleted.");
                        break;
                    }
                }
                if (!removed) System.out.println("Mahasiswa with NIM " + deleteNim + " not found.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}