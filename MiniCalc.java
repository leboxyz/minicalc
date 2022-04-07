//import scanner
import java.util.Scanner;

class MiniCalc {
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        //prompt user to enter first number
        System.out.print("Enter first number: ");
        //store first number
        int first = input.nextInt();

        //prompt user to enter second number
        System.out.print("Enter second number: ");
        //store second number
        int second = input.nextInt();

        //prompt user to enter operator
        System.out.print("Enter operator: ");
        //store operator
        String operator = input.next();

        //perform calculation
        if (operator.equals("+")) {
            System.out.println(first + second);
        } else if (operator.equals("-")) {
            System.out.println(first - second);
        } else if (operator.equals("*")) {
            System.out.println(first * second);
        } else if (operator.equals("/")) {
            System.out.println(first / second);
        } else {
            System.out.println("Invalid operator");
        }
    }
}
