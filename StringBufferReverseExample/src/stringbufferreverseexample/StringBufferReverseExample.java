/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringbufferreverseexample;
        
public class StringBufferReverseExample {

    public static void main(String[] args) {
        // It can reverse the characters within a stringBuffer object using reverse().
        StringBuffer s = new StringBuffer("Hello");
        s.reverse();   // it reverses Hello to olleH.
        System.out.println("\nThe string Hello reverses to : "+s);    // it prints Hello to olleH.
        StringBuffer a = new StringBuffer("World");
        a.reverse();   // it reverses Shirish to dlrow.
        System.out.println("\nThe string World reverses to : "+a);
    }
    
}
