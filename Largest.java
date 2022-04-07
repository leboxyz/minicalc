//Find the Largest Among Three Numbers
import java.util.Scanner;
class Largest {
    
    public static void main(String[] args) {
        //prompt user to enter first number
        System.out.print("Enter first number: ");
        //store first number
        int first = new Scanner(System.in).nextInt();

        //prompt user to enter second number
        System.out.print("Enter second number: ");
        //store second number
        int second = new Scanner(System.in).nextInt();

        //prompt user to enter third number
        System.out.print("Enter third number: ");
        //store third number
        int third = new Scanner(System.in).nextInt();

        //check if first number is greater than second number
        if (first > second) {
            //check if first number is greater than third number
            if (first > third) {
                System.out.println("First number is the largest");
            } else {
                System.out.println("Third number is the largest");
            }
        } else {
            //check if second number is greater than third number
            if (second > third) {
                System.out.println("Second number is the largest");
            } else {
                System.out.println("Third number is the largest");
            }
        }
    }

}
