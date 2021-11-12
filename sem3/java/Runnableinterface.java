/*
    Java program to implement the concept of Threading by implementing Runnable Interface

    Multithreading in Java is a process of executing multiple threads simultaneously.A 
    thread is a lightweight sub-process and is the smallest unit of processing. Multithreading
    is used to do multitasking and it saves time as many threads work at the same time.A thread 
    can be created by extending the Thread class or implementing the Runnable interface.
*/

import java.util.Scanner;

// creating a thread by implementing the Runnable interface
class Threadcreation implements Runnable {
    Threadcreation(String s, int num) {
        System.out.println(s + ": " + num);
    }

    Threadcreation() {
        ;
    }

    // implementing the run method
    public void run() {

        // gets the reference to the current Thread
        Thread thrd = Thread.currentThread();

        // gets the current thread name
        String a = thrd.getName();
        System.out.println("New thread: " + thrd.toString());
        int i = 4;
        while (i >= 0) {
            try {
                if (i == 4) {
                    ;
                } else if (i <= 3 && i > 0) {
                    Threadcreation t = new Threadcreation(a, i);
                }

                // sleeps for 1 milliseconds
                Thread.sleep(1);
            }

            // catch the error if the thread is intrupted
            catch (InterruptedException e) {
                ;
            }
            i--;
        }
        System.out.println(a + " exiting");
    }
}

class Runnableinterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();
        Threadcreation r = new Threadcreation();

        // creating a thread
        Thread A = new Thread(r, a);
        Thread B = new Thread(r, b);

        // starting the thread
        A.start();
        B.start();
        try {

            // waits for a thread to die
            A.join();
        } catch (InterruptedException e) {
            ;
        }
        try {
            B.join();
        } catch (InterruptedException e) {
            ;
        }
        sc.close();
    }
}