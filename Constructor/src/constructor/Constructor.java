/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructor;

/**
 *
 * @author Victus
 */
public class Constructor {

    Constructor()  //Same name as class name. But shouldn't have any return type, not even void...
    {
        System.out.println("We are inside Constructor...");
        System.out.println("We don't have to call from object to execute this.");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Constructor c = new Constructor();   //Automatically executes all the codes inside the constructor we declared..
        /*c.constructor();
            The above line is not needed when we create a constructor.
        */
    }
    
}
