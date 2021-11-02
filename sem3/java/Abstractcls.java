/*
    Java program to demonstrate abstract class

    A class which is declared as abstract is known as an abstract class. 
    It can have abstract and non-abstract methods. It needs to be extended and 
    its method implemented. It cannot be instantiated. It is declared with the abstract keyword.    

*/

import java.util.Scanner;

// abstract class
abstract class Design {
    int a;
    int b;

    void input(int x) {
        a = x;
    }

    void input(int x, int y) {
        a = x;
        b = y;
    }

    // abstract method and it needs to bo implememted in its child class
    abstract void Area();
}

// a class named Square which inherits the abstract class 'Design'
class Square extends Design {
    int area;

    //implements the abstract method
    void Area() {
        area = a * a;
        System.out.println("Area of Square   :" + area);
    }
}

class Rectangle extends Design {
    int area;

    void Area() {
        area = a * b;
        System.out.println("Area of Rectangle:" + area);
    }
}

class Circle extends Design {
    double area;

    void Area() {
        area = 3.14 * a * a;
        System.out.println("Area of Circle   :" + area);
    }
}

class Abstractcls {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int l = sc.nextInt();
        int b = sc.nextInt();
        int rad = sc.nextInt();

        Square s = new Square();
        s.input(a);
        s.Area();

        Rectangle r = new Rectangle();
        r.input(l, b);
        r.Area();

        Circle c = new Circle();
        c.input(rad);
        c.Area();
        
        sc.close();
    }
}
