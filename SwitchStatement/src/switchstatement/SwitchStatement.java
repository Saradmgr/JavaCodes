/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchstatement;

/**
 *
 * @author Victus
 */
public class SwitchStatement {

    public static void main(String[] args) {
        // TODO code application logic here
        int z=7;    //The value of z is 7 so only the codes of case 7: will be executed...
        switch(z)
        {
            case 1:
            {
                System.out.println("The value of z is 1.");
                System.out.println("Thank you for choosing 1...");
                break;
            }
            case 2:
            {
                System.out.println("The value of z is 2.");
                System.out.println("You are awesome...");
                break;
            }
            case 3:
            {
                System.out.println("The value of z is 3.");
                System.out.println("Have a great day...");
                break;
            }
            case 4:
            {
                System.out.println("The value of z is 4.");
                System.out.println("May God bless you...");
                break;
            }
            case 5:
            {
                System.out.println("The value of z is 5.");
                System.out.println("Wow!!! What a lovely choice...");
                break;
            }
            case 6:
            {
                System.out.println("The value of z is 6.");
                System.out.println("believe in yourself, you'll surely succeed...");
                break;
            }
            case 7:
            {
                System.out.println("The value of z is 7.");
                System.out.println("Keep on grinding, You're just there...");
                break;
            }
            default :
            {
                System.out.println("Ohh my dear, you've choosed the invalid number...");
            }
        }
        System.out.println("\nOut of the switch statement.");
    }
    
}
