/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputtakingfloat;
import java.util.Scanner;


public class InputTakingFloat {

    public static void main(String[] args) {
        Scanner anish = new Scanner(System.in);
        System.out.println("Enter the amount of Salary in float type, (Should be mimimum 10,000.00) : ");
        float sal;
        sal = anish.nextFloat();
        if(sal>=10000 && sal<=20000)
        {
            System.out.println("Your salary is good. You need to work hard...");
        }
        else if(sal>20000 && sal<=40000)
        {
            System.out.println("Your salary is nice. Keep doing the great work...");
        }
        else if(sal>40000 && sal<=80000)
        {
            System.out.println("Your salary is awesome. Keep Grinding...");
        }
        
        else
        {
            System.out.println("You have an excellent Salary. All the best for the future...");
        }
    }
    
}
