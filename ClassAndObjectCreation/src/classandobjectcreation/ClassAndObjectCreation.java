/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classandobjectcreation;

/**
 *
 * @author Victus
 */
public class ClassAndObjectCreation {

    int length;    //Variable Declararion;     Alao known as Global Declaration. i.e declared inside class
    int breadth;   //Variable Declararion;
    int height;    //Variable Declararion;
    public void Setdata(int l, int b, int h)
    {
        length=l;
        breadth=b;
        height =h;
    }
    int Area()   //Method declaration that returns value of area after calculations..
    {
        return length*breadth ;
    }
    int Volume()   //Method declaration that returns value of volume after calculations..
    {
        return length * breadth * height;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ClassAndObjectCreation Box1 = new ClassAndObjectCreation();   //Object creation for First Box.
        ClassAndObjectCreation Box2 = new ClassAndObjectCreation();   //Object creation for Second Box.
        Box1.Setdata(2, 5, 8);   //Sending parameters, "l,b,h" for first box i.e Box1.
        System.out.println("The First box has been created. Lets find out its Area and Volume...");
        System.out.println("The Area of first box is :"+Box1.Area());
        System.out.println("The volume of first box is :"+Box1.Volume());
        System.out.println("\n");
        Box2.Setdata(4, 5, 6);   //Sending parameters, "l,b,h" for second box i.e Box2.
        System.out.println("The Second box has been created as well. Lets find out its Area and Volume...");
        System.out.println("The Area of second box is :"+Box2.Area());
        System.out.println("The Volume of second box is :"+Box2.Volume());
        
        System.out.println("\nClass and Object Created successfully.");   //Huuurrrraaaaaaayyyyyyyyy my code run successfullyyy !!!
    }
    
}
