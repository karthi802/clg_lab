/*
    Java program to implement the concept of Threading by extending Thread Class

    Multithreading in Java is a process of executing multiple threads simultaneously.A 
    thread is a lightweight sub-process and is the smallest unit of processing. Multithreading
    is used to do multitasking and it saves time as many threads work at the same time.A thread 
    can be created by extending the Thread class or implementing the Runnable interface.
*/

import java.util.Scanner;

// creating a thread by extending the Thread class
class Threadcr extends Thread {

    String name;

    public void run() {

        // gets the reference to the current Thread
        Thread thrd = Thread.currentThread();

        // gets the current thread name
        name = thrd.getName();

        // print the information about the current thread
        System.out.println("New thread: " + thrd.toString());

        for (int i = 3; i != 0; i--) {
            System.out.println(name + ": " + i);
        }
        System.out.println(name + " exiting");
    }
}

class Threading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // creates a new Thread
        Threadcr A = new Threadcr();
        Threadcr B = new Threadcr();

        String a = sc.nextLine();
        String b = sc.nextLine();

        // sets the name of the threads
        A.setName(a);
        B.setName(b);

        // starts the threads
        A.start();
        B.start();

        sc.close();
    }
}
