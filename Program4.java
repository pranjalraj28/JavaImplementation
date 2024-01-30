import java.util.Scanner;

class Person {
    String name;
    int age;
    String gender;
    Scanner sc = new Scanner(System.in);

    public void getData() {
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
        sc.nextLine(); // consume the newline character
        System.out.println("Enter gender:");
        gender = sc.nextLine();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class Employee extends Person {
    int employeeId;

    @Override
    public void getData() {
        super.getData();
        System.out.println("Enter employee ID:");
        employeeId = sc.nextInt();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId);
    }
}

class Student extends Person {
    int studentId;

    @Override
    public void getData() {
        super.getData();
        System.out.println("Enter student ID:");
        studentId = sc.nextInt();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Student ID: " + studentId);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        Student[] students = new Student[5];

        System.out.println("Enter details for 5 employees:");
        for (int i = 0; i < 5; i++) {
            employees[i] = new Employee();
            employees[i].getData();
        }

        System.out.println("Enter details for 5 students:");
        for (int i = 0; i < 5; i++) {
            students[i] = new Student();
            students[i].getData();
        }

        System.out.println("\nDetails of Employees:");
        for (Employee employee : employees) {
            employee.display();
            System.out.println();
        }

        System.out.println("\nDetails of Students:");
        for (Student student : students) {
            student.display();
            System.out.println();
        }
    }
}
