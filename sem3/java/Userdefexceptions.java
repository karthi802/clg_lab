/*
    Java program to create a user defined exception

    An exception is an event that disrupts the normal flow of 
    the program. It is an object which is thrown at runtime. It occurs
    due to runtime errors during the program execution.Exception Handling is a 
    mechanism to handle such errors.A user can define his own exception by extending
    the 'Exception' class and use the 'throws' keyword to throw the exception.
*/

import java.util.Scanner;

// User defined exception
class NegativeNumException extends Exception {
    public NegativeNumException(String str) {
        super(str);
    }
}

// check if the number is negative, if true then throw NegativeNumException
class Negative {
    void negativenum(int num) throws NegativeNumException {
        if (num < 0) {
            throw new NegativeNumException("");
        } 
        else {
            System.out.println("Positive number : " + num);
        }
    }
}

class Userdefexceptions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Negative n = new Negative();

        int a = sc.nextInt();

        try {
            n.negativenum(a);
        } 
        catch (NegativeNumException e) {
            System.out.println("Exception raised : Negative number");
        }
        sc.close();
    }
}