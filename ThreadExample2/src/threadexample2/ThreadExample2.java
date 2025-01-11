/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadexample2;

            // Calling run() directly from main...
public class ThreadExample2 {

       static class A extends Thread 
        {
            public void run()
            {
                for(int i=1; i<=5; i++)
                {
                    System.out.println("\t From Thread A : i = "+i);
                }
                    System.out.println("Exit from A.");
            }
        }
        
       static class B extends Thread
        {
            public void run()
            {
                for(int j=1; j<=5; j++)
                {
                    System.out.println("\t From Thread B : j = "+j);
                }
                System.out.println("Exit From B.");
            }
        }
        
         static class C extends Thread
        {
            public void run()
            {
                for(int k=1; k<=5; k++)
                {
                    System.out.println("\t From Thread B : j = "+k);
                }
                System.out.println("Exit From B.");
            }
        }
    public static void main(String[] args) {
        // TODO code application logic here
        
        new A().run();
        new B().run();
        new C().run();
    }  
}
