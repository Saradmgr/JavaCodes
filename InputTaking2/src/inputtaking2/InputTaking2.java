/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputtaking2;
import java.util.Scanner;

public class InputTaking2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a1 = new Scanner(System.in);
        Scanner a2 = new Scanner(System.in);
        Scanner a3 = new Scanner(System.in);
         int a,b,c,d ;
        System.out.print("\nEnter the value of a: ");
        a = a1.nextInt();
        System.out.print("Enter the value of b: ");
        b = a2.nextInt();
        System.out.print("Enter the value of c: ");
        c = a3.nextInt();
        d = a+b+c ;
        System.out.println("The sum of three number is: "+d);
    } 
}
