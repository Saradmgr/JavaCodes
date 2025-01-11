/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nestedifstatement;

/**
 *
 * @author Victus
 */
public class NestedIfStatement {

    public static void main(String[] args) {
       
        int a=64;
        if(a>100) //This is nested if block...
        {
            if(a%2==0)  //For even number.
                System.out.println("The value of a is greater than 10 and is even number.");
            else   //For odd number.
                System.out.println("The value of a is greater than 10 and is odd number.");
        }
        else //If the condition of nested if block is false then this else block will be executed...
        {
            System.out.println("The value of a is less than 100, lol !");
        }
        
        System.out.println("\n We are outside the nested if else statement after successful execution...");
    }
    
}
