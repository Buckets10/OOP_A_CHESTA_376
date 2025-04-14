import java.util.Scanner;

public class Admin {
    public static void loginAdmin() {
        Scanner loginMin = new Scanner(System.in);

        String userbenar = "admin506";
        String passbenar = "pass506";
        boolean berhasiltidak = true;

        while (berhasiltidak) {
            System.out.print("Masukan username: ");
            String username = loginMin.nextLine();

            System.out.print("Masukan password: ");
            String password = loginMin.nextLine();

            if (userbenar.equals(username) && passbenar.equals(password)) {
                System.out.println("Login berhasil!!");
                berhasiltidak = false;
            } else {
                System.out.println("Username atau password salah!!");
                System.out.println("Mohon coba lagi");
            }
        }

        loginMin.close();
    }
}