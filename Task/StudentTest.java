package Task;
 class Student {
    private int rollNumber;
    private String name;
    private String course;
    private int marks1;
    private int marks2;
    private int marks3;
    
    // Constructor
    public Student(int rollNumber, String name, String course, int marks1, int marks2, int marks3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    
    // Getter and Setter methods
    public int getRollNumber() {
        return rollNumber;
    }
    
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCourse() {
        return course;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    public int getMarks1() {
        return marks1;
    }
    
    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }
    
    public int getMarks2() {
        return marks2;
    }
    
    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }
    
    public int getMarks3() {
        return marks3;
    }
    
    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }
    
    // Method to calculate total marks
    public int calculateTotal() {
        return marks1 + marks2 + marks3;
    }
    
    // Method to calculate average marks
    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }
    
    // Method to calculate grade based on average marks
    public String calculateGrade() {
        double avg = calculateAverage();
        
        if (avg >= 80) {
            return "A";
        } else if (avg >= 60) {
            return "B";
        } else if (avg >= 40) {
            return "C";
        } else {
            return "Fail";
        }
    }
    
    // toString method to display student details
    public String toString() {
        return "Roll Number: " + rollNumber + "\nName: " + name + "\nCourse: " + course
                + "\nMarks1: " + marks1 + "\nMarks2: " + marks2 + "\nMarks3: " + marks3;
    }
}
public class StudentTest {
    public static void main(String[] args) {
        // Create five student objects
        Student s1 = new Student(101, "Ash", "Mathematics", 80, 70, 90);
        Student s2 = new Student(102, "Tom", "Science", 75, 85, 80);
        Student s3 = new Student(103, "Arun", "English", 65, 60, 70);
        Student s4 = new Student(104, "David", "History", 55, 45, 50);
        Student s5 = new Student(105, "Rahul", "Geography", 90, 95, 80);
        
        // Display details of each student
        System.out.println(s1);
        System.out.println("Total marks: " + s1.calculateTotal());
        System.out.println("Average marks: " + s1.calculateAverage());
        System.out.println("Grade: " + s1.calculateGrade() + "\n");
        
        System.out.println(s2);
        System.out.println("Total marks: " + s2.calculateTotal());
        System.out.println("Average marks: " + s2.calculateAverage());
        System.out.println("Grade: " + s2.calculateGrade() + "\n");
        
        System.out.println(s3);
        System.out.println("Total marks: " + s3.calculateTotal());
        System.out.println("Average marks: " +s3.calculateAverage());
        System.out.println("Grade: " + s3.calculateGrade() + "\n");
        
        System.out.println(s4);
        System.out.println("Total marks: " + s4.calculateTotal());
        System.out.println("Average marks: " + s4.calculateAverage());
        System.out.println("Grade: " + s4.calculateGrade() + "\n");
        
        System.out.println(s5);
        System.out.println("Total marks: " + s5.calculateTotal());
        System.out.println("Average marks: " + s5.calculateAverage());
        System.out.println("Grade: " + s5.calculateGrade() + "\n");
    }
}
