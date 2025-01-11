/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multilevelinheritance;

     class Teacher   // Grandfather class "Teacher" which properties are accessed by other classes...
    {
        void teach()
        {
            System.out.println("Teacher Teaches...\n");
        }
    }

    class Student extends Teacher   // Father class "Student" which extends the properties of Grandfather class "Teacher".
    {
        void learn()
        {
            System.out.println("Student Learns...\n");
        }
    }

        class HomeTution extends Student   // Child class "HomeTution" that extends the properties of both Father "Student" & Grandfather "Teacher" classes above!!!
        {
            void tution()
            {
                System.out.println("Hometution Teaches Student...\n");
            }
            
        }

        /*
            Note that classes should be defined as 'public' in order to be inherited by other classes.
            if we don't specify the class while declaring then it takes it as 'public' automatically ...
            For example: class Teacher as public class Teacher.
        */
public class MultiLevelInheritance {

    public static void main(String[] args) {
        // TODO code application logic here
        HomeTution h = new HomeTution();  //Objects should be created of child class.
        Student s1 = new Student();   // Here class Student is also a child of class Teacher so we can create an object.
        h.learn();   // we can access the properties of class Student since we inherit it.
        h.teach();   // we can access the properties of class Teacher. Since it is inherited by class Student, which we already inherited...
        h.tution();   // prints its own method inside it's class.
        
        System.out.println("After creating another object of class Student..");
        s1.teach();   // Since Student is also a child of Teacher we can also make object of Student to access the parent class Teacher... 
        // s1.tution();   Throws error..
        /* 
           Parent class can be accessed by the child class object if we use 'extends' keyword.
           But But But child class properties can't be accessed by the parent class objects !!! 
        */
    }
    
}
