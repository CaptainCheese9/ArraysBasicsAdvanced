import java.util.Scanner;

public class Basic {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Declare the array with a size of 3
        double[] javelinThrows = new double;

        // Ask the user for the lengths of the first three throws
        for (int i = 0; i < javelinThrows.length; i++) {
            System.out.println("Throw length");
            javelinThrows[i] = scanner.nextDouble();
        }

        // Print the whole array with consecutive numbers
        for (int i = 0; i < javelinThrows.length; i++) {
            System.out.println("Throw " + (i + 1) + ": " + javelinThrows[i]);
        }

        scanner.close();
    }
}
