/*
    Java program to Access Property, Method and Constructor using Super Keyword

    The super keyword in Java is a reference variable which is used to refer immediate 
    parent class object.It can be used to refer immediate parent class instance variable,
    invoke immediate parent class method, invoke immediate parent class constructor.
*/

class Cat {
    int value = 5;

    Cat() {
        System.out.println("WITHIN CAT CONSTRUCTOR");
    }

    void fromWhere() {
        System.out.println("WITHIN CAT MEMBER FUNCTION");
    }
}

// the rat class inherits the cat class
class Rat extends Cat {
    int value = 10;

    Rat() {
        System.out.println("WITHIN RAT CONSTRUCTOR");
    }

    void printValue() {

        // accessing the cat class value
        System.out.println("CAT Data Member Value : " + super.value);

        // accessing this class value(rat class)
        System.out.println("RAT Data Member Value : " + value);
    }

    void fromWhere() {

        // calling the cat class method
        super.fromWhere();

        System.out.println("WITHIN RAT MEMBER FUNCTION");
    }

}

public class Ratcat {
    public static void main(String args[]) {

        // creating an instance for the rat class
        Rat r = new Rat();
        r.printValue();
        r.fromWhere();
    }
}
