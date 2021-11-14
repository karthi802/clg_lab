/*
    Java program for Thread Synchronization

    Synchronization in Java is the capability to control the access of multiple threads 
    to any shared resource. This can be achieved different methods. One of the method is 
    to declare the shared method as synchronized. This method is used to lock any shared
    resources, so that When a thread invokes a synchronized method, it automatically acquires 
    the lock for that object and releases it when the thread completes its task, so that the 
    next thread can access the shared resource.
*/


class Table {

    // declare the synchronized method
    synchronized void printTable(int n) {

        // prints the multiple of the given number
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {

                //puts the thread to sleep for 0.4 sec
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

// creating a thread by extending the Thread class
class MyThread1 extends Thread {
    Table t;

    // initialize the table class
    MyThread1(Table t) {
        this.t = t;
    }

    // prints the multiple of 5
    public void run() {
        t.printTable(5);
    }

}

// creating a thread by extending the Thread class
class MyThread2 extends Thread {
    Table t;

    MyThread2(Table t) {
        this.t = t;
    }

    // prints the multiple of 100
    public void run() {
        t.printTable(100);
    }
}

class Threadsync {
    public static void main(String args[]) {
        Table obj = new Table();

        // creating thread objects
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        // starting the threads
        t1.start();
        t2.start();
    }
}