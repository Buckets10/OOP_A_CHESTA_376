import java.util.Scanner;

public class LoginSystem{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Adminn admin = new Adminn("Jimmy", "0000", "admin", "1234");
        Student student = new Student("Butler", "1111");

        System.out.println("===== LOGIN SYSTEM =====");
        System.out.println("1. Login as Admin");
        System.out.println("2. Login as Student");
        System.out.print("Choose option: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if(choice == 1234){
            choice = 3;

        }
        switch (choice){
            case 1:
                admin.login();
                break;
            case 2:
                student.login();
                break;
            default:
        }
        if(choice != 1 && choice != 2){
            System.out.println("Invalid choice tuanku");
        }
        scanner.close();
    }
}