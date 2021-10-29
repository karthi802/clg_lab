/*
    Java program to find Given number is perfect square or not using copy constructor

    A perfect square is a number that can be expressed as the product of an integer 
    by itself or as the second exponent of an integer. For example, 25 is a perfect square 
    because it is the product of integer 5 by itself, 5 × 5 = 25.

    A copy constructor in a Java class is a constructor that creates an object using another
    object of the same Java class.
*/

import java.util.Scanner;

public class Perfectsquare {

    public int a;

    // constructor to initialize variable
    public Perfectsquare(int a) {
        this.a = a;
    }

    // constructor which copies the given constructor's members and does the job
    public Perfectsquare(Perfectsquare p1) {
        int t = 0;

        // iterate till the given number and check if it is a perfect square
        for (int i = 1; i < p1.a; i++) {
            int x = i * i;
            if (x == p1.a) {
                t = 1;
                break;
            }
        }
        if (t == 1) {
            System.out.println("It is a perfect square");
        }
        if (t == 0) {
            System.out.println("It is not a perfect square");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        // this calls the 1st constructor
        Perfectsquare p = new Perfectsquare(b);

        // this calls the 2nd constructor and passes the 1st constructor's object as
        // argument
        Perfectsquare p2 = new Perfectsquare(p);
        sc.close();
    }
}
