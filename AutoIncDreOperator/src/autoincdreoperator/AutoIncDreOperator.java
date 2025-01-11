/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autoincdreoperator;

/**
 *
 * @author Victus
 */
public class AutoIncDreOperator {

    public static void main(String[] args) {
        // TODO code application logic here
        int a=4;
        System.out.println("The first declared value of a is: "+a);
        System.out.println("The pre increment ++a value of a is :"+ ++a);
        System.out.println("The post increment a++ value of a is :"+ a++); //only increments but prints the previous value..
        System.out.println("The new post incremented value of a is :"+a); //now prints the post incremented value...
        System.out.println("\n");
        System.out.println("The pre decrement --a value of a is :"+ --a);
        System.out.println("The post decrement a-- value of a is :"+a--); //only decrements but prints the previous value..
        System.out.println("The new post decremented value of a is :"+a); //now prints the post decremented value...
    }
    
}
