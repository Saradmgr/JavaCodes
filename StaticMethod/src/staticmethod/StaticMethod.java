/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticmethod;

/**
 *
 * @author Victus
 */
public class StaticMethod {

    int rollno;   //instance variable declaration.
    String name;  //instance variable declaration.
    static String college = "Saraswati Multiple Campus";   //static variable
    
    static void change()  //Static method declaration.
    {
        college="Herald International College";   //Changes the static variable declared earlier...
    }
    
    StaticMethod(String n, int r)
    {
        name = n;
        rollno = r;
    }
    
    public void display()
    {
        System.out.println("The name is: "+name+"\t\tThe roll no. is: "+rollno+"\t\tSaraswati Multiple Campus changed to : "+college);              
    }
    public static void main(String[] args) {
        // TODO code application logic here
       // StaticMethod.change();   //calling change method without use of object. Only changes the static variable when this is called; 
        StaticMethod s1 = new StaticMethod("Sarad Kunwor",4);
        StaticMethod s2 = new StaticMethod("Raman Shrestha",33);
        StaticMethod s3 = new StaticMethod("Amrit Shreesh",28);
        StaticMethod s4 = new StaticMethod("Bitisha Thapa",31);
        StaticMethod s5 = new StaticMethod("Archana Thapa",25);
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
    }
    
}
