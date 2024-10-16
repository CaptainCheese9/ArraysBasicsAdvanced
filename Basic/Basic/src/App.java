import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

                String[] colors = {"Green", "Blue", "Yellow"};

                System.out.println("Value at index 2: " + colors);
        
                System.out.println("All values in the array:");
                for (int i = 0; i < colors.length; i++) {
                    System.out.println((i + 1) + ". " + colors[i]);
                }
        
    }
}
