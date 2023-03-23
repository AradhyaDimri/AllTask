package Task;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class pro {
    
    private static final String EMPLOYEES_DIRECTORY = "employees";
    private static final String FILE_EXTENSION = ".txt";
    private static final String DELIMITER = ",";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Add employee");
            System.out.println("2. View employee details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    viewEmployeeDetails(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    
    private static void addEmployee(Scanner scanner) {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        // create employee file
        File employeeFile = new File(EMPLOYEES_DIRECTORY, name + FILE_EXTENSION);
        try {
            if (!employeeFile.getParentFile().exists()) {
                employeeFile.getParentFile().mkdirs();
            }
            employeeFile.createNewFile();
        } catch (Exception e) {
            System.out.println("Error creating employee file: " + e.getMessage());
            return;
        }
        
        // write employee data to file
        try (PrintWriter writer = new PrintWriter(employeeFile)) {
            writer.println(name + DELIMITER + age);
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to employee file: " + e.getMessage());
        }
        
        System.out.println("Employee added successfully");
    }
    
    private static void viewEmployeeDetails(Scanner scanner) {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        
        // read employee data from file
        File employeeFile = new File(EMPLOYEES_DIRECTORY, name + FILE_EXTENSION);
        try (Scanner fileScanner = new Scanner(employeeFile)) {
            String line = fileScanner.nextLine();
            String[] parts = line.split(DELIMITER);
            String employeeName = parts[0];
            int employeeAge = Integer.parseInt(parts[1]);
            System.out.println("Name: " + employeeName);
            System.out.println("Age: " + employeeAge);
        } catch (Exception e) {
            System.out.println("Error reading employee file: " + e.getMessage());
        }
    }
}