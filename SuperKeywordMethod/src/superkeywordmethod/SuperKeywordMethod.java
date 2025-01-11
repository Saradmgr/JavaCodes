/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superkeywordmethod;

    class Sarad
    {
        void message()
        {
            System.out.println("This is inside Sarad class."); 
        }
    }

        class Kunwor extends Sarad
        {
            void message()
            {
                System.out.println("This is inside Kunwor class.");
            }
                void display()
                {
                    message();   // This will print class Khatri's  message()...
                    super.message();   // This will print Anish's  message() as super keyword is used...
                }
        }

public class SuperKeywordMethod {

    public static void main(String[] args) {
        // TODO code application logic here
        Kunwor xyz = new Kunwor();
        xyz.display();
    }
    
}
