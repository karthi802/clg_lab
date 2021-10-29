/*
    Java program to find GCD of two numbers using parametrized constructor

    Greatest Common Divisor of two integers is the largest integer that can 
    exactly divide both numbers without any remainders. example GCD of 8 and 12 is 4

    A constructor is called Parameterized Constructor when it accepts a specific number of parameters 
    to initialize data members of a class with distinct values.
*/

import java.util.Scanner;

public class Gcd {

    // parametric constructor
    Gcd(int a, int b) {

        // initiallize gcd
        int gcd = 1;

        for (int i = 1; i <= a && i <= b; ++i) {

            // check if i perfectly divides both a and b
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD = " + gcd);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        Gcd g = new Gcd(n1, n2);

        sc.close();
    }
}
