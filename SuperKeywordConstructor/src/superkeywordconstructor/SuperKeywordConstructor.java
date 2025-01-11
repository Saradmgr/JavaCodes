/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superkeywordconstructor;

        class ParentClass
        {
            ParentClass()   // Default Constructor
            {
                System.out.println("\nWe are inside constructor of Parent Class.\n");
            }
        }

        class SubClass extends ParentClass
        {
            SubClass()   // Default Constructor
            {
                super(); /* This is optional because compiler automatically call the base class default constructor.
                            "Because it is extended."
                         */ 
                System.out.println("We are inside constructor of Sub Class");
            }
        }

public class SuperKeywordConstructor {

    public static void main(String[] args) {
        // TODO code application logic here
        SubClass s = new SubClass();
    }
    
}
