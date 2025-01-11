/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simpleinheritance;

         class Teacher   //Class to be inherited. Also known as parent class.
        {
        void teach()
        {
            System.out.println("Teaching Subjects.");
            System.out.println("Class Student Successfully extended the properties of class Teacher.\n");
        }
       
         }
        class Student extends Teacher   //Class that inherits the properties. Also known as child class.
        {
            void listen()
            {
                System.out.println("listening to teacher.\n");
            }  
        }
        public class SimpleInheritance {   // This is our Main Class
             public static void main(String[] args) {   // Main method should always start within the main Class... 
        // TODO code application logic here
        Student s1 = new Student();   //object should be made of child class...
        //s1.teach();
        s1.listen();   //calls its own method i.e listen()
        s1.teach();    //calls the inherited method from parent class i.e teach()
    } 
}
