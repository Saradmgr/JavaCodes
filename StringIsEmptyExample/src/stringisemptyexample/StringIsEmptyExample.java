/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringisemptyexample;

public class StringIsEmptyExample {
    

    public static void main(String[] args) {
        // Initializing strings to use isEmpty() method.
        
        // Empty String.
        String anish ="";
        // Non-Empty String
        String khatri = "Hello";
        System.out.println("Using isEmpty() method :"+anish.isEmpty());   // will give true as the variable 'anish' contains no string.
        System.out.println("Using isEmpty() method :"+khatri.isEmpty());   //will give false as the variable 'khatri' contains Hello.
    }
    
}/*
       The isEmpty() method is used to check whether a initialized string is empty or not ?
       isEmpty() method gives boolean result, i.e 'true if there is no strings.' and 'false if the some string in the given initialized string.'
*/
