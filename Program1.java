import java.util.*;

public class Main {

    public static void quadRoots(double a, double b, double c) {
        double disc = b * b - 4 * a * c;
        if (disc > 0) {
            double root1 = (-b + Math.sqrt(disc)) / (2 * a);
            double root2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("Roots are real and different:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (disc == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and same:");
            System.out.println("Root = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-disc) / (2 * a);
            System.out.println("Roots are complex and different:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }

    public static int[] multiplyArrays(int[] array1, int[] array2) {
        int length = array1.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = array1[i] * array2[i];
        }
        return result;
    }

    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coefficients of quadratic equation ax^2+bx+c=0");
        System.out.println("Enter the coefficients of the quadratic equation ax^2 + bx + c = 0:");
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();
        quadRoots(a, b, c);

        System.out.print("Enter the size of the arrays: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        System.out.print("Enter the elements of the array 1: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the elements of the array 2: ");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] result = multiplyArrays(arr1, arr2);
        System.out.println("Multiplication result: " + Arrays.toString(result));

        System.out.println("Enter the size of the array to be sorted: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSortAscending(arr);
        System.out.println("Ascending Order: " + Arrays.toString(arr));
        bubbleSortDescending(arr);
        System.out.println("Descending Order: " + Arrays.toString(arr));
        sc.close();
    }
}
