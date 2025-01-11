/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trycatchexample2;

public class TryCatchExample2 {

    public static void main(String[] args) {
       
            try  
            {
//                int answer = 100/0;
//                System.out.println("The answer is : "+answer);
                    int a[] = new int[10];
                    a[0]=10;
                    a[1]=20;
                    a[7]= 70;
                    System.out.println("Accessing element no.7 : "+a[20]);
            }
            catch(ArrayIndexOutOfBoundsException a)  
            {     
//                System.out.println("you should not divide a number by 0. Otherwise you'll be in trouble.");
                    System.out.println("Java describes the exception. "+a);
            }
            
            System.out.println("I study in SMC.\n I study Bca.\n I am studying in 3rd semester.");
    }
    
}
