/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringsearch;


public class StringSearch {
 
    public static void main(String[] args) {
        // Initializing string to search.
        String str = new String("Hello Sarad");
        //int index = str.indexOf('z');   // The output will be -1 because the character 'z' is not found in the given String.
        int index = str.indexOf('a');   // Will be found at the given string and the output will be 7.
        System.out.println("The index of the letter A is : "+index);
    }  
}
/*
    We can search for a particular letter in a string using the indexof() method of the String class.
    This method returns a positive index of a word within the String if found. Otherwise it returns -1.
*/
