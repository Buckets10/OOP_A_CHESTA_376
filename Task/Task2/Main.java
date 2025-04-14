import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner pilih = new Scanner(System.in);

        System.out.println("Pilih login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");

        int pilihan = pilih.nextInt();

        switch (pilihan) {
            case 1:
                Admin.loginAdmin();
                break;
            case 2:
                Mahasiswa.loginMhs();
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        pilih.close();
        System.out.println("Process finished with exit code 0");
    }
}