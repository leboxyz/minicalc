//Check Whether an Alphabet is Vowel or Consonant
import java.util.Scanner;

class Alphabets {
    
    public static void main(String[] args) {
        //prompt user to enter alphabet
        System.out.print("Enter alphabet: ");
        //store alphabet
        String alphabet = new Scanner(System.in).next();

        //check if alphabet is vowel or consonant
        if (alphabet.equals("a") || alphabet.equals("e") || alphabet.equals("i") || alphabet.equals("o") || alphabet.equals("u")) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }

}
