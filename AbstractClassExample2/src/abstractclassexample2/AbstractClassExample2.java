/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractclassexample2;

        abstract class Motorbike 
        {
            abstract void brake();  //The brake(); method cannot be implemented inside Moterbike.
        }                           //Because every Moterbike has its own implementation and mechanisms of brakes..
                                    //So, the implementation of brake() in MotorBike is kept hidden.
                class SportsBike extends Motorbike
                {
                    //Implementation of abstract method();
                         void brake()
                    {
                        System.out.println("This is Sportsbike brake. It is awesome...\n");
                    }
                }
                        class MountainBike extends SportsBike
                        {
                             //Implementing of abstract method();
                                  void brake()
                            {
                                System.out.println("\nThis is Mountainbike break. Damn this is tough...\n");
                            }
                        }
public class AbstractClassExample2 {

    public static void main(String[] args) {
                // Making objects of Subclasses.
                MountainBike m = new MountainBike();
                m.brake();
                SportsBike s = new SportsBike();
                s.brake();
    }
}
