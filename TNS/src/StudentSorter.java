
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int age;
    int score;

    public Student(String name, int rollNo, int age, int score) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.score = score;
    }
}

public class StudentSorter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Score: ");
            int score = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            students.add(new Student(name, rollNo, age, score));
        }

        // Sort the students based on score
        Collections.sort(students, Comparator.comparingInt(s -> s.score));

        // Group the students based on score
        List<Student> group1 = new ArrayList<>();
        List<Student> group2 = new ArrayList<>();
        List<Student> group3 = new ArrayList<>();
        List<Student> group4 = new ArrayList<>();

        for (Student student : students) {
            if (student.score >= 0 && student.score <= 50) {
                group1.add(student);
            } else if (student.score > 50 && student.score <= 65) {
                group2.add(student);
            } else if (student.score > 65 && student.score <= 80) {
                group3.add(student);
            } else if (student.score > 80 && student.score <= 100) {
                group4.add(student);
            }
        }

        // Print the students in each group
        System.out.println("\nStudents in the [0-50] score group:");
        for (Student student : group1) {
            System.out.println(student.name + " (Roll No: " + student.rollNo + ")");
        }
        
        System.out.println("\nStudents in the [50-65] score group:");
        for (Student student : group2) {
            System.out.println(student.name + " (Roll No: " + student.rollNo + ")");
        }
        
        System.out.println("\nStudents in the [65-80] score group:");
        for (Student student : group3) {
            System.out.println(student.name + " (Roll No: " + student.rollNo + ")");
        }
        
        System.out.println("\nStudents in the [80-100] score group:");
        for (Student student : group4) {
            System.out.println(student.name + " (Roll No: " + student.rollNo + ")");
        }
        
       
        
    }
    
}
