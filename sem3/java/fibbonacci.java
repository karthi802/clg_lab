/*
    Java program to generate fibbonacci series

    In this series the next digits will be the sum of previous digits
    eg.
    0,1,1,2,3,5,8,13 etc.
*/

import java.util.Scanner;

public class fibbonacci{
    public static void main(String[] args){
        int n;
        int num_1 = 0, num_2 = 1;
        Scanner S = new Scanner(System.in);

        //get the number of digits in fibbonacci series to be printed
        n = S.nextInt();
        
        int i = 1;
        int sum;
        
        while(i <= n){
            System.out.print(num_1 + " ");

            //add the previous two number
            sum = num_1 + num_2;

            //swap the 1st number with the second number
            num_1 = num_2;

            //assign the 2nd number with the sum we've calculated before
            num_2 = sum;
            i = i + 1;
        }   
        S.close();
    } 
}