import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        String input;
        while (true) {
            System.out.print("Add item (x = exit)\n");
            input = scanner.nextLine();

            // Check if the user wants to exit
            if (input.equalsIgnoreCase("x")) {
                break;
            }

            // Add the item to the shopping list
            shoppingList.add(input);
        }

        // Print the entire shopping list
        for (String item : shoppingList) {
            System.out.println(item);
        }

        scanner.close();
    }
}
