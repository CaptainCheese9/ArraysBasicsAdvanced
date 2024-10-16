import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // String[] colors = {"Green", "Blue", "Yellow"};
        // System.out.println("Blue");
        // for (int i = 0; i < colors.length; i++) {
        //     System.out.println(colors[i]);
        // }
        // Create an array and assign the aphorisms to it
        String[] aphorisms = {
            "Actions speak louder than words.",
            "A barking dog never bites.",
            "A penny saved is a penny earned.",
            "All things come to those who wait."
        };

        // Ask the user to type a number from 1 to 4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick number from 1-4.");
        int choice = scanner.nextInt();

        // Print the corresponding aphorism
        if (choice >= 1 && choice <= 4) {
            System.out.println(aphorisms[choice - 1]);
        } else {
            System.out.println("Invalid choice. Please pick a number from 1 to 4.");
        }

        scanner.close();
    }
}
