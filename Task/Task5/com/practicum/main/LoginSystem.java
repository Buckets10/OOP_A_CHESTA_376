package com.practicum.main;

import com.practicum.system.*;
import com.practicum.data.Item;

import java.util.*;

public class LoginSystem {
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Item> reportedItems = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Seed users
        userList.add(new Admin("Rafi", "202410370110376", "admin", "0000"));
        userList.add(new Student("Ali", "1111"));
        userList.add(new Student("Baba", "2222"));
        userList.add(new Student("Cici", "3333"));

        while (true) {
            System.out.println("\n=== LOGIN MENU ===");
            System.out.println("1. Login as Admin");
            System.out.println("2. Login as Mahasiswa");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            int choice = getIntInput(scanner);

            // Consume leftover newline
            scanner.nextLine();

            switch (choice) {
                case 1:
                    User admin = loginUser(scanner, "Admin");
                    if (admin != null) ((Admin) admin).adminMenu(scanner);
                    break;
                case 2:
                    User student = loginUser(scanner, "Student");
                    if (student != null) ((Student) student).studentMenu(scanner);
                    break;
                case 0:
                    System.out.println("Exiting.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static User loginUser(Scanner scanner, String type) {
        if (type.equals("Admin")) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            for (User user : userList) {
                if (user instanceof Admin admin) {
                    if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                        System.out.println("Login successful.");
                        return admin;
                    }
                }
            }
        } else {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter NIM: ");
            String nim = scanner.nextLine();

            for (User user : userList) {
                if (user instanceof Student s) {
                    if (s.getName().equals(name) && s.getStudentID().equals(nim)) {
                        System.out.println("Login successful.");
                        return s;
                    }
                }
            }
        }

        System.out.println("Login failed.");
        return null;
    }

    public static int getIntInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input must be a number!");
                scanner.nextLine(); // clear buffer
            }
        }
    }
}