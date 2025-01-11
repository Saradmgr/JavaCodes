/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringtrimexample;

public class StringTrimExample {

    public static void main(String[] args) {
       //Initializing String.
       String s1 = "   Sarad Kunwor    ";
        System.out.println(s1+"how are you");   // without trim()
        System.out.println(s1.trim()+" how are you");   //with trim()
        System.out.println("\n"+"I'm fine, thank you so much for asking...");
    }
    // Trim() removes the extra spaces and search for the coming charcter and display it in format.
}
/*
    The java string trim() method removes the leading and trailing spaces. It checks the unicode value of space character('u0020') 
    before and after the string. If it exists, then removes the space and return the omitting string. 
*/
