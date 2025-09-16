package OOP.constructor;

import java.util.Scanner;

public class School{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students do you want to enter?: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        Student[] one = new Student[choice];

        for (int i = 0; i < choice; i++) {
            System.out.println("\n--- Enter details for Student " + (i + 1) + " ---");

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter roll number: ");
            int roll_no = scanner.nextInt();

            System.out.print("Enter number of subjects: ");
            int subjects = scanner.nextInt();

            int[] marks = new int[subjects];
            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine(); 

            one[i] = new Student(name, roll_no, marks);
        }

        System.out.println("\n--- Student Report Cards ---");
        for (Student s : one) {
            s.display();
        }

        scanner.close();
    }
}

class Student {
    String name;
    int roll_no;
    int[] marks;

    Student(String name, int roll_no, int[] marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    void calculate_avg() {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        double avg = (double) total / marks.length;
        System.out.println("Average Marks: " + avg);
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.print("Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
        calculate_avg();
    }
}
    
