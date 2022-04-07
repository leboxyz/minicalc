//Write  Java Program to Compute Quotient and Remainder
import java.util.Scanner;

class QuoRemainder {
    public static void main(String[] args) {
        //promt user to enter first number
        System.out.print("Enter first number: ");
        //store first number
        int first = new Scanner(System.in).nextInt();

        //prompt user to enter second number
        System.out.print("Enter second number: ");
        //store second number
        int second = new Scanner(System.in).nextInt();

        //perform calculation
        int quotient = first / second;
        int remainder = first % second;

        //display result
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        
    }
}
