/*
    Java program to display the student details using multilevel inheritance

    Inheritance in Java is a mechanism in which one object acquires all the 
    properties and behaviors of a parent object.When there is a chain of inheritance, 
    it is known as multilevel inheritance.

                        class a
                           |
                           v
                        class b
                           |
                           v
                        class c   
*/

// parent class
class Student {
    int regNo = 111;
    String name = "John";
}

// inherits the student class
class Marks extends Student {
    int m1 = 78;
    int m2 = 89;
}

// inherits the marks class
class Compute extends Marks {
    int total = m1 + m2;
    double average = (m1 + m2) / 2f;

    Compute() {
        super.regNo = regNo;
        System.out.println("Student No : " + regNo);
        System.out.println("Student Name : " + name);
        System.out.println("Mark1 : " + m1);
        System.out.println("Mark2 : " + m2);
        System.out.println("Total : " + total);
        System.out.println("Average : " + average);

    }
}

public class Multilvlinheritance {
    public static void main(String args[]) {
        Compute c = new Compute();
    }
}