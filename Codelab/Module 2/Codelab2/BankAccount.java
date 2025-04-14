package Codelab2;

public class BankAccount {
    String norek;
    String nama;
    double saldo;

    // Constructor to initialize the account with account number, name, and initial balance
    public BankAccount(String norek, String nama, double saldo){
        this.norek = norek;
        this.nama = nama;
        this.saldo = saldo;
    }

    // Method to display account information (account number, name, and balance)
    public void displayInfo(){
        System.out.println("Account number: "+ norek);
        System.out.println("Account Name: "+ nama);
        System.out.println("Balance: "+ saldo);
        System.out.println();
    }

    // Method to deposit a specified amount into the account and update the balance
    public void deposit(double depo){
        saldo += depo;
        System.out.println(nama + " just deposit: "+ depo + " your balance: "+ saldo);
    }

    // Method to withdraw a specified amount from the account if the balance is sufficient, otherwise display an error message
    public void withdraw(double depo){
        if (depo > saldo){
            System.out.println(nama + " just withdraw: "+ depo +" insufficient balance, please try again!!");
            return;
        }
        saldo -= depo;
        System.out.println(nama +" just withdraw: "+ depo +" your balance: "+ saldo);
        System.out.println();
    }
}
