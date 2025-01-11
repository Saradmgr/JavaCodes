/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runtimepolymorphism;

        class College
        {
            public void print()
            {
                System.out.println("My campus name is Saraswati Multiple Campus.\n");
            }
        }

            class Student extends College
            {
                    public void print()
                {
                        System.out.println("I'm a student of BCA studying in 3rd semester in SMC.\n");
                }
            }
public class RuntimePolymorphism {

    public static void main(String[] args) {
        // TODO code application logic here
        College a = new College();   //College reference and it's object...
        College b = new Student();   //College reference but Student's object...
        a.print();   // runs the method in College class.
        b.print();   // runs the method in Student class.
    }
    
}
