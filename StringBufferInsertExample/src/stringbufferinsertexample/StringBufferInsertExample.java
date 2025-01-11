/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringbufferinsertexample;

public class StringBufferInsertExample {

    public static void main(String[] args) {
        // StringBuffer insert() method is used to insert text at the specified index position.
        StringBuffer s = new StringBuffer("Sarad Kunwor");
        s.insert(12, " Studies in Saraswati Multiple Campus. ");   // prints Junel Dhakal Studies in Saraswati Multiple Campus. 
        System.out.println(s);
        s.insert(50, " so does Amrit.");   // prints Junel Dhakal Studies in Saraswati Multiple Campus. so does shirish. 
        System.out.println(s);
        s.insert(0, " Roll no.1 :");   // prints  Roll no.1 :Junel Dhakal Studies in Saraswati Multiple Campus. so does shirish. 
        System.out.println(s);
    }
    
}
