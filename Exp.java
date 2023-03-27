package Task;

import java.io.*;
import java.util.Scanner;

public class Exp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the operation you want to perform:");
            System.out.println("0. Add new employee record.");
            System.out.println("2. View an existing employee record.");
            System.out.println("3. Update an existing employee record.");
            System.out.println("4. Delete an existing employee record.");
            System.out.println("5. Exit the program.");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 0:
                    addEmployee();
                    break;
                case 2:
                    viewEmployee();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid choice (1-5).");
            }
        }
    }

    public static void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        System.out.print("Enter employee salary: ");
        double employeeSalary = scanner.nextDouble();

        String fileName = employeeId + ".txt";
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                FileWriter fileWriter = new FileWriter(fileName);
                fileWriter.write("Name: " + employeeName + "\n");
                fileWriter.write("ID: " + employeeId + "\n");
                fileWriter.write("Salary: " + employeeSalary + "\n");
                fileWriter.close();
                System.out.println("Employee added successfully.");
            } else {
                System.out.println("An employee with this name already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the employee file.");
            e.printStackTrace();
        }
    }

    public static void viewEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee ID:");
        int id = scanner.nextInt();
        String fileName = id + ".txt";
        File file = new File(fileName);

        if (file.exists()) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("An error occurred while reading the employee file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void deleteEmployee() {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();

        String fileName = employeeId + ".txt";
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void updateEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        String fileName = id + ".txt";
        File file = new File(fileName);

        if (file.exists()) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line;
                String currentName = "";
                int currentId = 0;
                double currentSalary = 0.0;
                while ((line = reader.readLine()) != null) {
                    if (line.startsWith("Name:")) {
                        currentName = line.split(":")[1].trim();
                    } else if (line.startsWith("ID:")) {
                        currentId = Integer.parseInt(line.split(":")[1].trim());
                    } else if (line.startsWith("Salary:")) {
                        currentSalary = Double.parseDouble(line.split(":")[1].trim());
                    }
                }
                reader.close();

                System.out.println("Enter new employee name :");
                String newName = scanner.nextLine().trim();
                if (!newName.isEmpty()) {
                    File newFile = new File(newName + ".txt");
                    if (newFile.exists()) {
                        System.out.println("An employee with that name already exists.");
                        return;
                    }
                }
                System.out.println("Enter new employee ID (or enter 0 to keep the same):");
                int newId = scanner.nextInt();
                scanner.nextLine(); // consume the remaining newline character
                if (newId != 0) {
                    currentId = newId;
                    File newFile = new File(currentId + ".txt");
                    if (newFile.exists()) {
                        System.out.println("An employee with that ID already exists.");
                        return;
                    }
                    file.renameTo(newFile);
                    fileName = currentId + ".txt";
                }

                System.out.println("Enter new employee salary (or enter 0.0 to keep the same):");
                double newSalary = scanner.nextDouble();
                scanner.nextLine(); // consume the remaining newline character
                if (newSalary != 0.0) {
                    currentSalary = newSalary;
                }

                FileWriter fileWriter = new FileWriter(fileName);
                fileWriter.write("Name: " + newName + "\n");
                fileWriter.write("ID: " + currentId + "\n");
                fileWriter.write("Salary: " + currentSalary + "\n");
                fileWriter.close();

                System.out.println("Employee updated successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred while reading or writing the employee file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("Employee not found.");
        }
    }
}