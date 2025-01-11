/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringcharatexample;


public class StringCharAtExample {

    public static void main(String[] args) {
        // Initializing strings.
        String str = "Welcome to Saraswati Multiple Campus.";   // Initializing strings. 
        char ch1 = str.charAt(0);  // it locates the character located at index 0. i.e : W
        char ch2 = str.charAt(5);   // it locates the character located at index 5. i.e : o
        char ch3 = str.charAt(11);  // it locates the character located at index 11. i.e : s
        char ch4 = str.charAt(22);   // it locates the character located at index 22. i.e : u
        System.out.println("Character at 0 at index is : "+ch1);
        System.out.println("Character at 5th index is : "+ch2);
        System.out.println("Character at 11th index is : "+ch3);
        System.out.println("Charater at 20th index is : "+ch4);
    }
}
