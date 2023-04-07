package Task;
import java.util.ArrayList;
import java.util.Scanner;

public class menudriven {
    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. Display elements");
            System.out.println("4. Exit");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    String elementToAdd = scanner.nextLine();
                    elements.add(elementToAdd);
                    System.out.println("Element added.");
                    break;
                case 2:
                    System.out.print("Enter element to remove: ");
                    String elementToRemove = scanner.nextLine();
                    boolean removed = elements.removeIf(element -> element.equals(elementToRemove));
                    if (removed) {
                        System.out.println("Element removed.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;
                case 3:
                    System.out.println("Elements:");
                    for (String element : elements) {
                        System.out.println("- " + element);
                    }
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

            System.out.println(); 
        }
    }
}