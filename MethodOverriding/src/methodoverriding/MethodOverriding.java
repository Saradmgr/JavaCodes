/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodoverriding;

        class Human
        {
            void eat()
            {
                System.out.println("\nHuman is eating food.");
            }
        }
        
                class Boy extends Human
                {
                    void eat()   //Same method name with same return type is method overriding.
                    {
                        System.out.println("\nBoy is eating food.");
                    }
                }

                    class Baby extends Boy
                    {
                        void eat()
                        {
                            System.out.println("\nBaby is enjoying food.\n\n");
                        }
                    }
public class MethodOverriding {

    public static void main(String[] args) {
        // TODO code application logic here
        Human obj = new Human();
        obj.eat();
        Human obj2 = new Boy();
        obj2.eat();
        Human obj3 = new Baby();
        obj3.eat();
    }
}
