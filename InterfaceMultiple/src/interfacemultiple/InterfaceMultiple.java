/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacemultiple;

        interface A
        {
            void methodA();
        }
            interface B
            {
                void methodB();
            }
                class C implements A,B
                {
                    public void methodA()
                    {
                        System.out.println("We are in class C of abstract method A");
                    }
                        public void methodB()
                        {
                            System.out.println("we are in class C of abstract method B");
                        }
                }
public class InterfaceMultiple {

    public static void main(String[] args) {
        // TODO code application logic here
        C c1 = new C();
        c1.methodA();
        c1.methodB();
    }
    
}
