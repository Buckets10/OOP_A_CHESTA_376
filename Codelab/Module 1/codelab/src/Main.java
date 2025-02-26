import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your gender (M/F): ");
        char gender = scanner.next().charAt(0);

        System.out.print("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();

        int age = LocalDate.now().getYear() - yearOfBirth;

        String genderOutput = (gender == 'M' || gender == 'm') ? "Male" : "Female";

        System.out.println("User  Details:");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + genderOutput);
        System.out.println("Age: " + age);

        scanner.close();
    }
}