

                                // Thread Class
// Thread is defined in java.lang (automatically called) consists start(),getName(),setName(),sleep(),join()

class MyThread extends Thread {
    public void run() {
        // Get name of the Thread (Show value)
        System.out.println(getName());
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Child");
                    Thread.sleep(100);
                }
            }
            catch(Exception e) {}
        }
    }
public class ThreadLogic {
    public static void main(Strings[] args) {
        MyThread t = new MyThread();
        // Set name of the Thread
        t.setName("SmrityThread");
        // Run the program (Start) defined in Thread
        t.start();
         //

        for(int i=1;i<=5;i++) {
            System.out.println("Main");
        }
        // Gets the name of Real Thread with setting the value: ---> main
        System.out.println(
                Thread.currentThread().getName()
        );
    }
}



 /*                                 ---  My Notes ---


                                     Thread.yield();
        Chances get to ready Thread
        not Guarantee but, requested

                                       t.join();
        Child completes first then Main executes
        (Main is waiting for completion of child using Join)
        example: -   child,child,child,child,child,main,main,main,main,main

                                     Synchronization
        Ek time pe sirf ek hi thread.
        Thread 1 -> Finish -> Thread 2 -> Finish -> Thread 3

                                  Thread.currentThread()
         Current executing thread return karta hai.     --> main

                        Difference between Why Start() not Run()
             t.run();    ->    No new thread.
             t.start();  ->    Creates new thread.

         */