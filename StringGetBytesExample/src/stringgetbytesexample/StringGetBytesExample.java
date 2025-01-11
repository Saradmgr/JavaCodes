/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringgetbytesexample;

public class StringGetBytesExample {

    public static void main(String[] args) {
        // Initializing String.
        String str = "Saraswati Multiple Campus.";
        byte[]bs = str.getBytes();   //extract character from stringobject and then convert the characters in a byte array.
        for(byte b:bs)
        {
            System.out.println(b);
        }
    }
    
}
