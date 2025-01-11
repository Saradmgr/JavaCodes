/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copyconstructor;

/**
 *
 * @author Victus
 */
public class CopyConstructor {

   int length;
   int breadth;
        CopyConstructor(int x, int y)   //Parameterized Constructor to pass value in main method.
        {
            length=x;
            breadth=y;
        }
        
        CopyConstructor(CopyConstructor a)   //Copying constructor inside constructor.
        {
            length = a.length;
            breadth = a.breadth;
        }
        
        void display()
        {
            System.out.println("\tThe length is :"+length+"\t\tThe breadth is :"+breadth);
        }
    public static void main(String[] args) {
        // TODO code application logic here
        CopyConstructor a1 = new CopyConstructor(12,48);
        CopyConstructor a2 = new CopyConstructor(a1);
        a1.display();
        System.out.println("\n\tThe contents of constructor copied successfully.");
        a2.display();
    }
    
}
