package net.davisware.fizzbuzz;

/**
 * FizzBuzz implementation
 *
 */
public class FizzBuzz {

    private final int MAXNUM = 100;

    public FizzBuzz() {
        System.out.println("\nFizzBuzz implementation...\n");

        for (int x = 1; x <= 100; x++) {
            if ( x % 3 == 0 && x % 5 == 0 )
                System.out.println("FizzBuzz");
            else if ( x % 3 == 0)
                System.out.println("Fizz");
            else if (x % 5 == 0 )
                System.out.println("Buzz");
            else
                System.out.println(x);
        }

        System.out.println("\n==============\n");
    }
}
