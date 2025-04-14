package Codelab2;

public class Utama {
    public static void main(String[] args){
        // Create two SystemBank account objects with initial balances
        BankAccount account1 = new BankAccount("202410370110506", "opan", 5000);
        BankAccount account2 = new BankAccount("202410370110376", "chesta", 5000);

        // Display initial information for account1
        account1.displayInfo();
        // Deposit into account1
        account1.deposit(4000);
        // Withdraw from account1
        account1.withdraw(300);

        // Display initial information for account2
        account2.displayInfo();
        // Deposit into account2
        account2.deposit(4004);
        // Withdraw from account2
        account2.withdraw(400);
    }
}
