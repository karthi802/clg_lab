/*
    Java program to find whether the given string is palindrome or not

    A string is said to be palindrome if it is the exact same when it is
    reversed. Example: level is a palindrome since it is the exact same 
    when it is reversed.
*/

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get the string from the user
        String s = sc.nextLine();

        int i = 0;
        int j = s.length() - 1;

        String temp = s;
        Boolean palindrome = true;

        // check if the 1st character and the last character are same and move to the
        // next set of characters
        while (i < j) {
            if (temp.charAt(i) != temp.charAt(j)) {

                // if the characters are not same then it is not a palindrome
                palindrome = false;
            }
            i++;
            j--;
        }
        ;

        if (palindrome) {
            System.out.println("Yes, " + s + " is a string palindrome");
        }
        if (!palindrome) {
            System.out.println("No, " + s + " is not a string palindrome");
        }
        sc.close();
    }

}