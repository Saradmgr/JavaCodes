/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package continuestatement;

/**
 *
 * @author Victus
 */
public class ContinueStatement {

    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0;i<10;i++)
        {
            if(i%2!=0)   //If the remainder becomes 0 then continue the loop again. If not then execute the rest of the code...
                continue;
            System.out.println("\nThe required value is: "+i);   //Will execute if it is even number below 10(including).
        }
        System.out.println("\nOut of loop and continue statements after successful execution...");   //After loop and continue statements.
    }
}
