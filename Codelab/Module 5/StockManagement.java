import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StockManagement {
    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Initial sample data
        itemList.add(new Item("Shirt", 35));
        itemList.add(new Item("Jacket", 30));
        itemList.add(new Item("Bracelet", 25));

        boolean running = true;

        while (running) {
            System.out.println("\n=== Stock Management Menu ===");
            System.out.println("1. Add New Item");
            System.out.println("2. Display All Items");
            System.out.println("3. Reduce Item Stock");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice;

            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter item name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter initial stock: ");
                        try {
                            int stock = scanner.nextInt();
                            scanner.nextLine(); // consume newline
                            itemList.add(new Item(name, stock));
                            System.out.println("Item added successfully!");
                        } catch (InputMismatchException e) {
                            System.out.println("Stock input must be a number!");
                            scanner.nextLine(); // clear invalid input
                        }
                        break;

                    case 2:
                        if (itemList.isEmpty()) {
                            System.out.println("Item stock is empty.");
                        } else {
                            System.out.println("\n=== Item List ===");
                            for (Item item : itemList) {
                                System.out.println("Item: " + item.getName() + " | Stock: " + item.getStock());
                            }
                        }
                        break;

                    case 3:
                        if (itemList.isEmpty()) {
                            System.out.println("No items available to reduce stock.");
                            break;
                        }

                        System.out.println("\nAvailable Items:");
                        for (int i = 0; i < itemList.size(); i++) {
                            System.out.println(i + ". " + itemList.get(i).getName() + " (Stock: " + itemList.get(i).getStock() + ")");
                        }

                        try {
                            System.out.print("Enter item index to reduce stock: ");
                            int index = scanner.nextInt();

                            System.out.print("Enter amount to reduce: ");
                            int amount = scanner.nextInt();

                            Item selectedItem = itemList.get(index);

                            if (amount > selectedItem.getStock()) {
                                throw new InsufficientStockException("Stock for " + selectedItem.getName() + " is only " + selectedItem.getStock() + " left.");
                            }

                            selectedItem.setStock(selectedItem.getStock() - amount);
                            System.out.println("Stock reduced successfully!");

                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input! Please enter numbers only.");
                            scanner.nextLine(); // clear invalid input
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Invalid index! Please select a valid item index.");
                        } catch (InsufficientStockException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 0:
                        running = false;
                        System.out.println("Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please select from the menu.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); // clear invalid input
            }
        }

        scanner.close();
    }
}
