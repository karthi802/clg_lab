/*
    Java Program to find whether the given number is prime or not using default constructor

    A prime number is a number which can be divided only by itself and 1 and not by any other number.

    A constructor is called automatically when the class is instantiated. It initilizes the variables
    and other things. A default constructor does not take any arguments.
*/

import java.util.Scanner;

public class Primenumber {

    // Default constructor
    Primenumber() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("It is not a prime number");
        } else {

            // iterate from 2 to n/2 and check if the number divides the given number
            for (int i = 2; i <= n / 2; i++) {
                if ((n % i) == 0) {
                    System.out.println("It is not a prime number");
                    break;
                } else {
                    System.out.println("It is a prime number");
                }
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        Primenumber p = new Primenumber();
    }
}
