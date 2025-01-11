/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringcomparetoexample;

public class StringCompareToExample {

    public static void main(String[] args) {
          // Initializing strings to use compareTo() method.
          String a1 = "abc";
          String a2 = "abc";
          String a3 = "def";
          String a4 = "ABC";
          System.out.println(a1.compareTo(a2));
          System.out.println(a2.compareTo(a3));
          System.out.println(a1.compareTo(a4));
          System.out.println(a1.compareToIgnoreCase(a4));
    }
}
