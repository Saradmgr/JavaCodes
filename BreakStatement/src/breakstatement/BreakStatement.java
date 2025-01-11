/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package breakstatement;

/**
 *
 * @author Victus
 */
public class BreakStatement {

    public static void main(String[] args) {
        // TODO code application logic here
        for(int j=0;j<5;j++)
        {
            if(j==4)   //If j becomes 4 then the control is send out of the loop immediately...
               break;   //This will not allow 4 to print and control is out of loop immediately !!!
            System.out.println("The value of j is :"+j);   //As long as it won't match break condition and loop condition, it will be executed...
        }
        
        System.out.println("\nAfter loop and break statements..");
    }
    
}
