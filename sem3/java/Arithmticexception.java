/*
    Java program to handle arithmetic exceptions

    An exception is an event that disrupts the normal flow of 
    the program. It is an object which is thrown at runtime. It occurs
    due to runtime errors during the program execution.Exception Handling is a 
    mechanism to handle such errors.
*/

class Arithmticexception {
    public static void main(String[] args) {

        // try a arithmetic operation which throws an exception
        try {
            int y = 5, x = 0;
            System.out.println(y / x);
        }

        // catch the exception thrown by the try block
        catch (ArithmeticException a) {
            System.out.println("Arithmetic exception caught");
        }
    }
}