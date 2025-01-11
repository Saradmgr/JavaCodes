/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringappendexample;
import java.io.*;

public class StringAppendExample {

    public static void main(String[] args) {
        // Append() is used to add text at the end of the existence text...
        StringBuffer s = new StringBuffer("My");
        s.append(" name");
        System.out.print(s);  // returns my name
        s.append(" is");
        System.out.print(s);// returns My name is
        s.append(" Sarad");
        System.out.print(s); // returns My name is Sarad
        s.append(" Kunwor");
        System.out.println(s);  //returns My name is Sarad Kunwor. 
    }
    
}
