import java.util.Scanner;

public class Main {

    // First version of userstrcmp() to compare complete strings
    public static void userstrcmp(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }

    // Second version of userstrcmp() to compare specified number of characters
    public static void userstrcmp(String str1, String str2, int num) {
        String substr1 = str1.substring(0, num);
        String substr2 = str2.substring(0, num);
        if (substr1.equals(substr2)) {
            System.out.println("The first " + num + " characters are equal.");
        } else {
            System.out.println("The first " + num + " characters are not equal.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();

        // First version of userstrcmp() to compare complete strings
        userstrcmp(str1, str2);

        // Second version of userstrcmp() to compare specified number of characters
        System.out.println("Enter the number of characters that you want to compare:");
        int num = sc.nextInt();
        userstrcmp(str1, str2, num);

        sc.close();
    }
}
