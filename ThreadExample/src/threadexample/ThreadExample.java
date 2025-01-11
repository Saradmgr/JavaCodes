/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadexample;

        class RunnableDemo implements Runnable
        {
            private Thread t  ;
            private String ThreadName;
             Runnable Demo(String name)
            {
                ThreadName = name;
                System.out.println("Creating "+ThreadName);
            }
                    public void run()
                    {
                        System.out.println("Running "+ThreadName);
                        try{
                            for(int i = 4;i>0; i--)
                            {
                                System.out.println("Thread :"+ThreadName+","+i);
                                // Let the thread sleep for a while.
                                Thread.sleep(50);
                            }
                        }
                        catch(InterruptedException e)
                        {
                            System.out.println("Thread "+ThreadName+"Interrupted");
                        }
                        System.out.println("Thread "+ThreadName+"Exiting");
                    }
                            public void start()
                            {
                                System.out.println("Starting "+ThreadName);
                                if(t==null)
                                {
                                    t = new Thread(this,ThreadName);
                                }
                            }
        }

public class ThreadExample {

    public static void main(String[] args) {
        RunnableDemo R1 = new RunnableDemo();
        R1.start();
         RunnableDemo R2 = new RunnableDemo();
         R2.start();
    }
    
}
