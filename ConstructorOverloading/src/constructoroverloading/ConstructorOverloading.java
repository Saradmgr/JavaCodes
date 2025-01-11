/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructoroverloading;

/**
 *
 * @author Victus
 */
public class ConstructorOverloading {

        String name;  //variable declarations.
        int rollno;
        int year;
    ConstructorOverloading()   //Method name and Class name is same with no return type...
    {
        name=null;
        rollno=0;
        year=0;
    }
    
    ConstructorOverloading(String a, int b)   //Constructor Overloading with parameter (String, int)
    {
        name=a;
        rollno=b;
    }
    
    ConstructorOverloading(int x, int y)    //Constructor Overloading with parameter (int, int)
    {
        rollno=x ;
        year=y ;
    }
    
    ConstructorOverloading(int i, String l)    //Constructor Overloading with parameter (int, String)
    {
        rollno = i;
        name = l;
    }
    
    ConstructorOverloading(String a, int b, int c)    //Constructor Overloading with parameter (String, int, int)
    {
        name = a ;
        rollno = b ;
        year = c ;
    }
    
    void display()
    {
        System.out.println("Name is :"+name+"\t\tRoll no. is :"+rollno+"\t\tAdmission Year is :"+year);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ConstructorOverloading Abc = new ConstructorOverloading();
        ConstructorOverloading xyz = new ConstructorOverloading("Sarad",29);
        ConstructorOverloading mno = new ConstructorOverloading(21,2021);
        ConstructorOverloading pqr = new ConstructorOverloading(14,"Amrit");
        ConstructorOverloading A = new ConstructorOverloading("Raman",4,2021);
        Abc.display();
        xyz.display();
        mno.display();
        pqr.display();
        A.display();
        // Same Concept as method overloading...
        System.out.println("\nWe successfully learned about Constructor Overloading.\n");
    }
    
}
