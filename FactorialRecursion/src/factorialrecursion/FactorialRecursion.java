/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialrecursion;

public class FactorialRecursion {

        int fact(int n)
        {
            int result ;
            if(n==1 || n==0){   //If the number is 1 or 0 the factorial will be 1.
                return 1;
            }
            result = fact(n-1)*n;   //Calculations to generate Factorial...
            return result ;
        }
    public static void main(String[] args) {
        // TODO code application logic here
        FactorialRecursion f = new FactorialRecursion();
        System.out.println("Factorial of 3 is : "+f.fact(3));
        System.out.println("\nFactorial of 5 is : "+f.fact(5));
        System.out.println("\nFactorial of 0 is : "+f.fact(0));
    }
    
}
