import java.util.ArrayList;
import java.util.Scanner;

public class FavoriteFoodsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> favoriteFoods = new ArrayList<>();
        boolean running = true;
        int choice;

        System.out.println("🍽️ Welcome to the Favorite Foods Tracker!");
        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a food");
            System.out.println("2. Remove a food");
            System.out.println("3. View favorite foods");
            System.out.println("4. Exit");
            System.out.print("👉 Your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline after int input
            switch (choice) {
                case 1:
                    System.out.print("Enter food to add: ");
                    String newFood = scanner.nextLine();
                    favoriteFoods.add(newFood);
                    System.out.println(newFood + " added to your favorites!");
                    break;
                case 2:
                    System.out.print("Enter food to remove: ");
                    String removedFood = scanner.nextLine();
                    if (favoriteFoods.remove(removedFood)) {
                        System.out.println(removedFood + " removed from your favorites!");
                    }else {
                        System.out.println(removedFood + " not found in your favorites!");
                    }
                    break;
                case 3:
                    if (favoriteFoods.isEmpty()) {
                        System.out.println("You have no favorite foods!");
                    }else {
                        System.out.println("🍕 Your Favorite Foods:");
                        for (int i = 0; i < favoriteFoods.size(); i++) {
                            System.out.println((i + 1) + ". " + favoriteFoods.get(i));
                            
                        }
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("👋 Goodbye! Stay hungry!");
                    break;
                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }

        // close the input stream
        scanner.close();
    }
}
