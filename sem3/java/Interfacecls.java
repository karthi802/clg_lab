/*
    Java Program to find area of a Rectangle, Triangle and Circle implementing an Interface method Area

    An interface in Java is a blueprint of a class. It has static constants and abstract methods.
    It is used to achieve abstraction and multiple inheritance in Java. It cannot have a method body.
    It is declared using the keyword 'interface' and is inherited using the keyword 'implements'.
*/

import java.util.Scanner;

//interface class
interface Polygon {

    // abstract method
    void area();

    Scanner sc = new Scanner(System.in);
}

// class inheriting the interface class
class Rectangle implements Polygon {

    // implementing the abstract method
    public void area() {
        int l, w;

        l = sc.nextInt();
        w = sc.nextInt();

        System.out.println("Area of Rectangle");
        System.out.println("Length = " + l);
        System.out.println("Width = " + w);
        System.out.println("Area = " + (l * w));
    }
}

// class inheriting the interface class
class Triangle implements Polygon {

    // implementing abstract method
    public void area() {
        int b, h;

        b = sc.nextInt();
        h = sc.nextInt();

        System.out.println("Area of Triangle");
        System.out.println("Base = " + b);
        System.out.println("Height = " + h);
        System.out.println("Area = " + (b * h) / 2);
    }
}

class Circle implements Polygon {

    // implementing abstract method
    public void area() {
        int rad;

        rad = sc.nextInt();

        System.out.println("Area of Circle");
        System.out.println("Radius = " + rad);
        System.out.println("Area = " + 3.14 * Math.pow(rad, 2));
    }
}

public class Interfacecls {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Circle c = new Circle();

        r.area();
        t.area();
        c.area();
    }
}
