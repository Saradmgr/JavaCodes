/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringbufferdeleteanddeletecharat;

public class StringBufferDeleteAndDeleteCharAt {

    public static void main(String[] args) {
        // The delete() method deletes a sequence of characters from the invoking object.
        // The deleteChatAt() method deletes the character at the index specified by location.
        StringBuffer abc = new StringBuffer("Saraswati Campus");
        abc.deleteCharAt(5);
        System.out.println("After using deleteCharAt() method : " +abc);
        abc.delete(0, 8);
        System.out.println("After using delete() method : "+abc);
    }
    
}
