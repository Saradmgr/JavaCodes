/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package returnstatement;

/**
 *
 * @author Victus
 */
public class ReturnStatement {

       static int myMethod(int x)
        {
            return x+5;   //This will return a new value of x whenever myMethod is called in main method...
        }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(myMethod(5));   //myMethod call will send back control to above myMethod method..
        System.out.println(myMethod(0));   //Will print 0+5 = 5
        System.out.println(myMethod(1));   //Will print 1+5 = 6
    }
    
}
