/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package throwkeywordexample;

public class ThrowKeywordExample {
           public static int validate(int age)   // Declaring a method 'validate()' to take input as an parameter of age.
            {
                  if(age<18)
            {
                throw new ArithmeticException ("not valid");   // use of throw keyword.
            }
            else
            {
                System.out.println("Welcome to Vote.");
            }
                return age;
            }
    public static void main(String[] args) {
        /*
            If the age is less than 18, we are throwing an arithmetic exception.
            Otherwise print a message welcome to vote.
        */
          
            validate(6);   // Passing the value of age.
            System.out.println("Rest of the code...");
    }
    
}
