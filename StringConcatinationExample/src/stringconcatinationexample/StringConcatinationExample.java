/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringconcatinationexample;

public class StringConcatinationExample {

    public static void main(String[] args) {
        // Initializing Strings to use concat() method.
        String s1 = "Hello";
        String s2 = "World";
        String s3= s1 + s2 ;   // Using + operator to concat(jodhnu) two strings.
        System.out.println("Concatinating two strings using + operator.");
        System.out.println(s3+"\n\n");
        System.out.println("Concatinating two strings using concat() method.");
        System.out.println(s1.concat(s2));   //Using concat() method to concatinate two strings together.
        
    }
    
}
