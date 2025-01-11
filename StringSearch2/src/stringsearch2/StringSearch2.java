/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringsearch2;

public class StringSearch2 {

    public static void main(String[] args) {
        // Initializing String to search.
        String Anish = "Hello I'm Sarad Kunwor";   // Hello is at index 0.
        int id = Anish.indexOf("Hello");  // Here, the searching word should be exact as in the declaration above, otherwise it'll find difficulties in searching...
        //int id = Anish.indexOf("Anish");   // will be found at index 10.
        if(id==-1)   // if the searching word is not found then this block will be executed.
        {
            System.out.print("Sorry, the string 'Hello' not found.");
        }
        else   // and if the word is found in the string then this block will be executed and gives the index value.
        {
            System.out.println("Found Hello at index : "+id);
        }
    }
    
}
