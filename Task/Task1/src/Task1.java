import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display login options
        System.out.println("Select Login Type:");
        System.out.println("1. Admin");
        System.out.println("2. Student");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (choice == 1) {
            // Admin Login
            System.out.print("Enter Username: ");
            String username = scanner.nextLine();
            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            if (username.equals("Admin00") && password.equals("Password00")) {
                System.out.println("Admin login successful!");
            } else {
                System.out.println("Login failed! Wrong username or password.");
            }
        } else if (choice == 2) {
            // Student Login
            System.out.print("Enter Your Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Your NIM: ");
            String nim = scanner.nextLine();

            if (name.equals("Rafi Chesta Adabi") && nim.equals("202410370110376")) {
                System.out.println("Student Login Successful!");
                System.out.println("Name : " + name);
                System.out.println("NIM : " + nim);
            } else {
                System.out.println("Login Failed! Wrong name or NIM.");
            }
        } else {
            // Invalid choice
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}