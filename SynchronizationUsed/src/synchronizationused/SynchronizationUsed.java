/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package synchronizationused;

        // Program using Synchronization...
public class SynchronizationUsed {

            static class First
            {
                public void display(String msg)
                {
                    System.out.print("["+msg);
                    try{
                            Thread.sleep(1000);
                    }
                        catch(InterruptedException e)
                        {
                            e.printStackTrace();
                        }
                    System.out.println("]");
                }
            }
            
                    static class Second extends Thread
                    {
                        String msg;
                        First fobj ;
                        Second(First fp, String str)
                        {
                            fobj = fp ;
                            msg = str ;
                            start();
                        }
                                public void run()
                    {
                            synchronized(fobj)
                            {
                                fobj.display(msg);
                            }
                    }
           }
    public static void main(String[] args) {
                First fnew = new First();
                Second ss = new Second(fnew,"welcome");
                Second ss1 = new Second(fnew,"new");
                Second ss2 = new Second(fnew,"programmer");
    }
}
