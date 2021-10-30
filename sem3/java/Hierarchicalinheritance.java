/*
    Java program to display the area of a square, rectangle, and circle using hierarchical inheritance

    Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors 
    of a parent object.When two or more classes inherits a single class, it is known as hierarchical inheritance.

                             class a
                           /    |    \
                    class b  class c  class d
*/

// parent class
class Dimension {
    int squareLength = 10;
    int rectangleLength = 10;
    int rectangleBreadth = 12;
    int circleRadius = 10;
}

// inherits the dimension class
class Square extends Dimension {
    Square() {
        System.out.println("Area of square : " + (squareLength * squareLength));
    }
}

// inherits the dimension class
class Rectangle extends Dimension {
    Rectangle() {
        System.out.println("Area of rectangle : " + (rectangleLength * rectangleBreadth));
    }
}

// inherits the dimension class
class Circle extends Dimension {
    Circle() {
        System.out.println("Area of circle : " + (3.14 * circleRadius * circleRadius));
    }
}

class Hierarchicalinheritance {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
    }
}
