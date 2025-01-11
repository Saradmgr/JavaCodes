/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whileloop;

/**
 *
 * @author Victus
 */
public class WhileLoop {

    public static void main(String[] args) {
        // TODO code application logic here
        int x=1;
        while(x<=10)   //Condition of while loop.
        {
            System.out.println("\nThe value of j is :"+x);
            x=x+2;   //Increments the value of x by 2 and returns to while condition as long as it is true...
        }
        System.out.println("\nOut of while loop. Code executed successfully...");   //If while condition becomes false then this will be executed...
    }
}
