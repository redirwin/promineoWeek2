public class Loops {

    public static void main(String[] args) {

        // Start Assignment Part 5a 
        // A while loop that prints all even numbers from 0 to 100

        int i = 0;
        System.out.println("Part 5a");

        while (i <= 100) {
            System.out.print(i + " ");
            i += 2;
        }

        System.out.println();
        System.out.println();
        
        // Start Part 5b
        // A while loop that prints every 3rd number going backwards 
        // from 100 until we reach 0

        int j = 100;
        System.out.println("Part 5b");

        while (j > 0) {
            System.out.print(j + " ");
            j -= 3;
        }

        System.out.println();
        System.out.println();

        // Start Part 5c
        // A for loop that prints every other number from 1 to 100

        System.out.println("Part 5c");

        for (i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        // Start Part 5d
        // A for loop that prints every number from 0 to 100, but if 
        // the number is divisible by 3, it prints “Hello” instead of 
        // the number, and if the number is divisible by 5, it prints 
        // “World” instead of the number, and if it is divisible by both 
        // 3 and 5, it prints “HelloWorld” instead of the number.

        System.out.println("Part 5d");

        for (int k = 0; k <= 100; k++) {
          if (k %  3 == 0 && k % 5 == 0) {
              System.out.println("HelloWorld");
          } else if (k % 3 == 0) {
              System.out.println("Hello");
          } else if (k % 5 == 0) {
              System.out.println("World");
          } else System.out.println(k);                      
        }

    }
}