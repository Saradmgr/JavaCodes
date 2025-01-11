/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaceexample3;

    //Create an Interface...
        interface A
        {
            void display();
        }
            class B implements A
            {
                    //Implementation of abstract method i.e display();
                        public void display()
                    {
                        System.out.println("we are inside class B.");
                    }
            }
                    class C implements A
                    {
                            public void display()
                            {
                                System.out.println("we are inside class C.");
                            }
                    }
public class InterfaceExample3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B b1 = new B();
        C c1 = new C();
        b1.display();
        c1.display();
    }
    
}
