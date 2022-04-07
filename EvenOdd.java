//check if number is even or odd
import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        //prompt user to enter number
        System.out.print("Enter number: ");
        //store number
        int number = new Scanner(System.in).nextInt();

        //check if number is even or odd
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
    
}
