
import java.util.Scanner;

// Base class Person
class Person {
    private String name;
    private int age;
    private String gender;

    // Parameterized constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Display method to be overridden by subclasses
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

// Derived class Employee
class Employee extends Person {
    private String employeeId;

    // Parameterized constructor
    public Employee(String name, int age, String gender, String employeeId) {
        super(name, age, gender);
        this.employeeId = employeeId;
    }

    // Override display method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeId);
    }
}

// Derived class Student
class Student extends Person {
    private String studentId;

    // Parameterized constructor
    public Student(String name, int age, String gender, String studentId) {
        super(name, age, gender);
        this.studentId = studentId;
    }

    // Override display method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an array to store details of 5 employees and 5 students
        Person[] people = new Person[10];

        // Read and store details for 5 employees
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Employee Details for Employee " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            System.out.print("Gender: ");
            String gender = scanner.nextLine();
            System.out.print("Employee ID: ");
            String employeeId = scanner.nextLine();

            // Create an Employee object and store it in the array
            people[i] = new Employee(name, age, gender, employeeId);
        }

        // Read and store details for 5 students
        for (int i = 5; i < 10; i++) {
            System.out.println("Enter Student Details for Student " + (i - 4));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume the newline character
            System.out.print("Gender: ");
            String gender = scanner.nextLine();
            System.out.print("Student ID: ");
            String studentId = scanner.nextLine();

            // Create a Student object and store it in the array
            people[i] = new Student(name, age, gender, studentId);
        }

        // Display details of all people (employees and students)
        for (Person person : people) {
            person.displayDetails();
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}

