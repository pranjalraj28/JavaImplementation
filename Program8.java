//Exception handling
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the numerator:");
            int numerator = sc.nextInt();
            System.out.println("Enter the denominator:");
            int denominator = sc.nextInt();
            if(numerator<0 || denominator<0){
                throw new IllegalArgumentException();
            }
            if(denominator == 0){
                throw new ArithmeticException();
            }
            int result = numerator/denominator;
            System.out.println("Result: "+result);
        }catch(IllegalArgumentException e){
            System.out.println("Both numbers should be non-negative");
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }finally{
            System.out.println("Program execution complete.");
        }
    }
}
