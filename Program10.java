
import java.sql.*;
import java.util.Scanner;

public class Main {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/student_details";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
            Statement statement = connection.createStatement();

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Choose operation:");
                System.out.println("1. CREATE");
                System.out.println("2. READ");
                System.out.println("3. UPDATE");
                System.out.println("4. DELETE");
                System.out.println("5. EXIT");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        createRecord(statement, scanner);
                        break;
                    case 2:
                        readRecords(statement);
                        break;
                    case 3:
                        updateRecord(statement, scanner);
                        break;
                    case 4:
                        deleteRecord(statement, scanner);
                        break;
                    case 5:
                        System.out.println("Exiting program.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                        break;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createRecord(Statement statement, Scanner scanner) throws SQLException {
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        System.out.println("Enter department:");
        String department = scanner.next();

        String createQuery = "INSERT INTO students (name, age, department) VALUES ('" + name + "', " + age + ", '" + department + "')";
        statement.executeUpdate(createQuery);
        System.out.println("Record created successfully.");
    }

    private static void readRecords(Statement statement) throws SQLException {
        String readQuery = "SELECT * FROM students";
        ResultSet resultSet = statement.executeQuery(readQuery);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            String department = resultSet.getString("department");
            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Department: " + department);
        }
    }

    private static void updateRecord(Statement statement, Scanner scanner) throws SQLException {
        System.out.println("Enter name to update:");
        String nameToUpdate = scanner.next();
        System.out.println("Enter new age:");
        int newAge = scanner.nextInt();

        String updateQuery = "UPDATE students SET age = " + newAge + " WHERE name = '" + nameToUpdate + "'";
        statement.executeUpdate(updateQuery);
        System.out.println("Record updated successfully.");
    }

    private static void deleteRecord(Statement statement, Scanner scanner) throws SQLException {
        System.out.println("Enter name to delete:");
        String nameToDelete = scanner.next();

        String deleteQuery = "DELETE FROM students WHERE name = '" + nameToDelete + "'";
        statement.executeUpdate(deleteQuery);
        System.out.println("Record deleted successfully.");
    }
}
