/**
 * Loops
 */
public class Loops {

    public static void main(String[] args) {

        // Start Assignment Part 5a 
        // A while loop that prints all even numbers from 0 to 100

        int i = 0;

        while (i <= 100) {
            System.out.print(i + " ");
            i += 2;
        }

        System.out.println();
        System.out.println();
        
        // Start Part 5b
        // A while loop that prints every 3rd number going backwards from 100 until we reach 0

        int j = 100;

        while (j > 0) {
            System.out.print(j + " ");
            j -= 3;
        }

    }
}