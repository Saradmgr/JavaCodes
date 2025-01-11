/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaceexample;

        interface Polygon   //Interface provides 100% data hiding facility.
        {
                void getArea(int length, int breadth);
        }
            //Implement the Polygon interface...
            class Rectangle implements Polygon   // Using implements keyword to access interface class Polygon.
            {
                    public void getArea(int length, int breadth)   //Implementing the interface method.
                    {
                        System.out.println("The area of the rectangle is : "+(length * breadth)+" meter square");
                    }
            }
public class InterfaceExample {

    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rec = new Rectangle();
        rec.getArea(72, 89);
    }
    
}
