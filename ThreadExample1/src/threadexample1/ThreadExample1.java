/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadexample1;
import java.lang.Thread;

        //Creating Thread using Thread Class......
public class ThreadExample1 
{

        static class A extends Thread
 {
     public void run()
     {
         for(int i=1; i<=5; i++)
         {
             System.out.println("\t From Thread A : i = "+i);
         }
     }
 }
 
            static class B extends Thread
     {
         public void run()
         {
             for(int j=1; j<=5; j++)
             {
                   System.out.println("\t from Thread B : j = "+j);
             }
             System.out.println("Exit from Thread B.");
         }
     }
            static class C extends Thread
     {
         public void run()
         {
             for(int k=1; k<=5; k++)
             {
                 System.out.println("\t From Thread C : k = "+k);
             }
             System.out.println("exit from thread C.");
         }
     }
 
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}
    

