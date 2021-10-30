/*
    Java programe to find the volume of cube and cuboid using constructor overloading

    Constructor overloading in Java is a technique of having more than one constructor with 
    different parameter lists. They are arranged in a way that each constructor performs a 
    different task. They are differentiated by the compiler by the number of parameters in the 
    list and their types.
*/

import java.util.Scanner;

class Volume {

    // this constructor is called when there is one argument
    Volume(int a) {
        System.out.println("cube = " + (a * a * a));
    }

    // this constructor is called when there is 3 arguments
    Volume(int l, int b, int h) {
        System.out.println("cuboid = " + (l * b * h));
    }
}

public class Volumeofcube {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        Volume cube = new Volume(a);
        Volume cuboid = new Volume(l, b, h);

        sc.close();
    }
}
