/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadcreation;

            //Creating Thread class by extending Thread Class...
public class ThreadCreation {

        static class ThreadDemo extends Thread
        {
            private Thread t;
            private String threadName ;
            ThreadDemo(String name)
            {
                threadName = name;
                System.out.println("Creating"+threadName);
            }
                public void run()
                {
                    System.out.println("Running"+threadName);
                    try{
                        for(int i=4; i>0; i--)
                        {
                            System.out.println("Thread :"+threadName+","+i);
                            // Let the thread sleep for a while.
                            Thread.sleep(50);
                        }
                        
                    }
                        catch(InterruptedException e)
                        {
                            System.out.println("Thread"+threadName+"interrupted");
                        }
                    System.out.println("Thread"+threadName+"Exiting");
                }
                public void start()
                {
                    System.out.println("Starting"+threadName);
                    if(t==null)
                    {
                        t = new Thread(this,threadName);
                    }
                }
        }
    public static void main(String[] args) {
        // TODO code application logic here
        ThreadDemo T1 = new ThreadDemo("Thread-1");
        T1.start();
        ThreadDemo T2 = new ThreadDemo("Thread-2");
        T2.start();
    }
    
}
