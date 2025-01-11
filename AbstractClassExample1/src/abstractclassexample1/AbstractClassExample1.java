/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractclassexample1;

    abstract class Animal  // If the class contains an abstract method(); then the class also must be abstract...
    {
        abstract void makeSound();  // Declaring Abstract method. An abstract method doesn't have body...
        void eat()   // Declaring non-abstract class that is void return type.
        {
            System.out.println("I can eat food.");  /* An abstract class can't be instanciated and can't be created object of the abstract class.
                                                       An abstract class must be inherited by the subclass and can only be accessed by the object of subclass.
                                                       Hence the void eat() method can be accessed only by the sublass Dod's object i.e d1       */
        }
    }

            class Dog extends Animal   // An abstract class must be inherited... inorder to access its properties from object of subclass.
            {
                // Implementing the abstract method. i.e abstract void makeSound();
                public void makeSound()
                {
                    System.out.println("Barrrk  Barrrk.");
                }
            }
                        /*
                            Note: If the Dog class doesn't provide the implementation of the abstract method makeSound(),
                            Dog should also be declared as abstract.
                            This is because the subclass Dog inherits makeSound() from Animal.
                        */
public class AbstractClassExample1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Dog d1 = new Dog();
        d1.makeSound();
        d1.eat();
    }
    
}
