/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputtaking;
import java.util.Scanner; //#include<stdio.h>


public class InputTaking {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter a number:");
         int n;
        n = abc.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("You have choosed no.1");
                System.out.println("You are the best.\n");
                break;
                
            case 2:
                 System.out.println("you have choosed no.2");
                 System.out.println("Thank you for choosing no.2\n");
                 break;
                 
            case 3:
                System.out.println("You have choosed no.3");
                System.out.println("Have a great day.\n");
                break;
                
            case 4:
                System.out.println("You have choosed no.4");
                System.out.println("You are amazing...\n");
                break;
                
            case 5:
                System.out.println("You have choosed no.5");
                System.out.println("You are the best.\n");
                break;
                
            default:
                System.out.println("Sorry! you have choosed a wrong number.....");
                break;
        }
    }
    
}
// printf("Enter a number:");
// scanf("%d",&n);