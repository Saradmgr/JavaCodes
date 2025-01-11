/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringtochararrayexample;


public class StringToCharArrayExample {

    public static void main(String[] args) {
        // Initializing String.
        String str = "Hello World";
        char ch[] = str.toCharArray();
        System.out.println(ch);
    }
}
/*
    It is an alternative of getChars() method. 
    toCharArray() method convert all the characters in a string object into an array of characters.
    It is best to convert string to character array.
    The syntax is : char[] toCharArray().
*/