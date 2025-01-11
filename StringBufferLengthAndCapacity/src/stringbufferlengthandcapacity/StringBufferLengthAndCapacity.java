/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringbufferlengthandcapacity;

/*
        # Methods used in String Buffer class are:
        1. length() and capacity()
        2. append()
        3. insert()
        4. reverse()
        5. delete() and deleteCharAt()
        6. replace()
*/

public class StringBufferLengthAndCapacity {

    public static void main(String[] args) {
        // Initializing a string.
        StringBuffer s = new StringBuffer("Saraswati Multiple Campus.");
        int p = s.length();
        int q = s.capacity();
        System.out.println("Length of Saraswati Multiple Campus : "+p);
        System.out.println("Capacity of Saraswati Multiple Campus : "+q);
        
    }
    
}
