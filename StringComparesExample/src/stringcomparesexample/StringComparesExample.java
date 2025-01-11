/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringcomparesexample;

public class StringComparesExample {

    public static void main(String[] args) {
        
        // equals() and equalsIgnoreCase() method is used to compare the value of string to check if two strings are equal or not.
        // Creating strings to compare between them.
        String s1 = "sarad";
        String s2 = "sarad";
        String s3 = "kunwor";
        String s4 = "Saraswati";
        String s5 = "SMC";
        String s6 = "Kunwor";
        String s7 = "Ram";
        System.out.println("Comparing first and second string : "+s1.equals(s2));  //equals() gives boolean result here it gives true as s1 and s2 are equal/same.
        System.out.println("Comparing second and third string : "+s2.equals(s3));   //equals() gives boolean result here it gives false as s2 and s3 are not equal/same.
        System.out.println("Comparing third and fifth string : "+s3.equals(s5));   //equals() gives boolean result here it gives false as s3 and s5 are equal/same.
        System.out.println("Comparing fourth and fifth string using equalsIgnoreCase : "+s4.equalsIgnoreCase(s5)); // gives false as the content is different.
        System.out.println("Using equalsIgnoreCase..."+s3.equalsIgnoreCase(s6));   //Gives true because the case is ignored and the content is same.
        System.out.println("Using last time : "+s1.equals(s7));  // Gives 'false' because content and case is same but maybe order should also be same.
    }
    
}/*
        The equals() method in java compares two strings and gives a boolean result, i.e true or false.
        To give the equals() method 'true' the Content and Case should be same. For eg: s1= "anish"; and s2= "anish"; will give true output.
        To give the equals() method 'false' any one of the Content or Case shouldn't match. For eg: s1= "Anish" and s2= "anish" will give false output.

        The equalsIgnoreCase() method in java ignores the case while comparing two strings. Meanwhile it also gives a boolean result and
        it gives true output only if the contents are same, eg(anish=ANISH) and ignores the case...
        but gives false output if the content is also different while comparing, eg(anish != mranish) ...
 */
