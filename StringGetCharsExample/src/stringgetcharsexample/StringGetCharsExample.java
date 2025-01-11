/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringgetcharsexample;

public class StringGetCharsExample {

    public static void main(String[] args) {
        // Initializing string.
        String s = "This is a demo of OOPs in Java.";
        int start = 10;
        int end = 14 ;
        char buf[] = new char[end-start];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);
    }
}
/* 
    If you need to extract more than one character at a time, you can use the grtChars() method.
    It has this general form : void getChars(int sourceStart, int sourceEnd, char target[], int targetStart)
*/
