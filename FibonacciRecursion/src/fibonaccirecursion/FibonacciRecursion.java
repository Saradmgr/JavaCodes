/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonaccirecursion;
import java.util.Scanner;

/**
 *
 * @author Victus
 */
public class FibonacciRecursion {
        
    static int fib(int n)
    {
            if(n<=1)
       {
            return n;
       }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number you want the Fibonacci Series of: ");
        n= sc.nextInt();
        System.out.println("The fibonacci series is.. :"+fib(n));
    }
}
