/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exampleoffinallyblock;


public class ExampleOfFinallyBlock {

  
    public static void main(String[] args) {
       
        try
        {
            // int num = 5000/1000;  (will be executed in try block as it can be calculated, and also finally block will be executed as well.)
            int num = 5000/0;   // Will throw an arithmetic exception. 
            System.out.println("The number after division is : "+num+"\n");   // Executes this line only if we give valid data and calculations.
        }
        catch(ArithmeticException e)   
        {
            System.out.println("A number should not be divided by 0. Otherwise you'll be in trouble, lol !\n"+e+"\n");
        }
        finally
        {
            System.out.println("This is finally block.\n");   // This finally block codes will be executed Anyway ...
        }
        /*
            The statements present is the finally block will always be executed irrespected to whether exception occurs in try block or not.
            The finally block always executes when the try block exits .....
        */
        
        System.out.println("Hurrayyy ! Out of try, catch and finally after successful execution.....");
    }
}
