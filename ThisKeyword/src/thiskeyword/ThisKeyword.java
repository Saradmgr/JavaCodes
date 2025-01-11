/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thiskeyword;

/**
 *
 * @author Victus
 */
public class ThisKeyword {

    void method1()
    {
        System.out.println("Hello, this is method 1.\n");
    }
    void method2()
    {
        System.out.println("Hiii, this is method 2.\n");
        //we can call method1 also using 'this' keyword as this.method1();
        this.method1();   //Tells the compiler to also execute method1() while executing method2...
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ThisKeyword A123 = new ThisKeyword();
        A123.method2();   //also does the job of A123.method1();
       // A123.method1();  'already executed'
        
    }
    
}
