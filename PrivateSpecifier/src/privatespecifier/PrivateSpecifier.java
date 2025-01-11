/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package privatespecifier;

/**
 *
 * @author Victus
 */
    public class PrivateSpecifier {

    public int data = 70;   //will be executed by class test if declared "public"
    public void Display()   //will be executed by class test if declared "public"
    {
           System.out.println("Hello Java.");
    }    
 }
    class test1{
        
       // public class Test {
    public static void main(String[] args) {
        PrivateSpecifier obj1 = new PrivateSpecifier();
        System.out.println(obj1.data);   //Compile Time Error
        obj1.Display();
        // TODO code application logic here
       /* PrivateSpecifier obj1 = new PrivateSpecifier();
        System.out.println(obj1.data);   //Compile Time Error
        obj1.Display();  */ //Compile Time Error
        
        /*The output will be 
        // 70
        // Hello Java. 
        } */
      }  
    }

