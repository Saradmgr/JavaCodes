/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifelseifstatement;

/**
 *
 * @author Victus
 */
public class IfElseifStatement {

    public static void main(String[] args) {
        // TODO code application logic here
        int b=55;
        if(b<40)
        {
            System.out.println("Yes the value of b is less than 40.");
        }
        else if(b>40)
            {
                 System.out.println("Yes the value of b is greater than 40."); 
            }
        else   //If all the above if and else if statement's condition is false then only this lastr else will be executed..
        {
                    System.out.println("Finally, The value of b is 40.");
        }  
        System.out.println("\nwe are outside the ifelseif block after successful execution.");
    }
    
}
