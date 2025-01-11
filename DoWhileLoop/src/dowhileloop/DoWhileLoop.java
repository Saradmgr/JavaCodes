/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhileloop;

/**
 *
 * @author Victus
 */
public class DoWhileLoop {

    public static void main(String[] args) {
        // TODO code application logic here
        int j=10;
        do{
            System.out.println("\nThe value of j is :"+j);   //This prints "10" without seeing the condition...
            j++;   //The value of j becomes 11 now.
        }while(j<=10);   //As j becomes 11 the control is out of loop...
        System.out.println("\nOut of Do while loop after successful execution...");
    }
}
