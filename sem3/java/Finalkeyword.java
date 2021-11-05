/*
    Java program to use Final Keyword for the variables in Java

    The final keyword can be used in variables, methods and classes. If the 
    final keyword is used with a variable then the variable cannot be modified.
*/

import java.util.Scanner;

class Stock {

    // final variable
    final String name = ("Pencil");
    float price;
    int qty;
    Scanner sc = new Scanner(System.in);

    void get() {
        price = sc.nextFloat();
        qty = sc.nextInt();
    }

    void get1() {
        price = price + 2;
        qty = qty - 1;
    }

    void show() {
        System.out.println(name);
        System.out.println(price);
        System.out.println(qty);
    }
}

public class Finalkeyword extends Stock {
    public static void main(String[] args) {
        Stock s = new Stock();
        s.get();
        s.show();
        s.get1();
        s.show();
    }
}
