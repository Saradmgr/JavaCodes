/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defaultconstructor;

/**
 *
 * @author Victus
 */
public class DefaultConstructor {

    float height;
    float width;
    float depth;
        DefaultConstructor()   //Constructor with no parameters so called Default Constructor.
        {
            System.out.println("We are inside default Constructor.\n");   //Will execute as many times we create new object of the constructor...
            height=100.5f;     //default value, unchangeable !
            width=60.9f;      //default value, unchangeable !
            depth=79.3f;     //default value, unchangeable !
        }
        
        public float volume()   //Volume method for calculations of volume of box.
        {
            return (height*width*depth)/2;
        }
    public static void main(String[] args) {
        // TODO code application logic here
        DefaultConstructor C = new DefaultConstructor();
        DefaultConstructor C2 = new DefaultConstructor();
        System.out.println("The volume of first box is: "+C.volume());
        System.out.println("The volume of Second box is: "+C2.volume());   //Output will be same as the value of parameter is unchanged ...
    }
    
}
