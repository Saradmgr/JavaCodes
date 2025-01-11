/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hierarchicalinheritance;

    class Deepak
    {
           void Teach()
           {
               System.out.println("Deepak sir's class inherited successfully...");
               System.out.println("Deepak sir teaches Java.\n");
           }
    } 

    class Anish extends Deepak
    {
        void Learn()
        {
            System.out.println("Displaying this output from Sarad's class.");
            System.out.println("Sarad Kunwor learns java programming from Deepak sir.");
        }
    }

    class Junel extends Deepak
    {
        void Ask()
        {
            System.out.println("Displaying this output from Sujan's class.");
            System.out.println("Sujan Magar asks several java questions to Deepak sir.");
        }
    }
public class HierarchicalInheritance {

    public static void main(String[] args) {
        // TODO code application logic here
        Junel j = new Junel();
        Anish a = new Anish();
        a.Learn();
        a.Teach();
        //j.Learn();  This will produce an error
        j.Ask();
        j.Teach();
    }
    
}
