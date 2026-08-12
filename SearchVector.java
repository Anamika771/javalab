package module2;

import java.util.Vector;
import java.util.Scanner;

public class SearchVector {
    public static void main(String[] args) {
        Vector<String> items = new Vector<>();

        items.add("Pen");
        items.add("Notebook");
        items.add("Eraser");
        items.add("Marker");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an item name: ");
        String item = scanner.nextLine();

        if (items.contains(item)) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }

        scanner.close();
    }
}