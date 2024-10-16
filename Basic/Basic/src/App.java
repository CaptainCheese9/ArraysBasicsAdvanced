import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String[] furniture = {"Table", "Sofa", "Shelf", "Painting"};

        // Loop through the array
        for (int i = 0; i < furniture.length; i++) {
            // Check if the value of the array item is "Sofa"
            if (furniture[i].equals("Sofa")) {
                System.out.println("Sofa found");
            }
        }
    }
}
