/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parameterizedconstructor;

/**
 *
 * @author Victus
 */
public class ParameterizedConstructor {

    int height;
    int width;
    int depth;
         ParameterizedConstructor(int a, int b, int c)   //Parameterized Constructor with no return type...
         {
             System.out.println("We are inside Parameterized Constructor.\n");   //Executes as many times new object of constructor are created...
             height = a;     //Assigning for taking parameters from main method.
             width = b;      //Assigning for taking parameters from main method.
             depth = c;      //Assigning for taking parameters from main method.
         }
         
         public int Volume()   //Volume method to calculate volume that returns an integer value.
         {
             return (height*depth*width)/2;
         }
    public static void main(String[] args) {
        // TODO code application logic here
          ParameterizedConstructor Box1 = new  ParameterizedConstructor(4,5,6);   //Parameters for First Box.
          ParameterizedConstructor Box2 = new  ParameterizedConstructor(2,5,7);   //Parameters for Second Box.
          int Vol;
          Vol=Box1.Volume();
          System.out.println("\nFirst Box Created Successfully.");
          System.out.println("The volume of First Box is : "+Vol);
          Vol=Box2.Volume();
          System.out.println("\nSecond Box Created Successfully.");
          System.out.println("The volume of Second Box is : "+Vol);
          System.out.println("\n\nHurray !!! We successfully executed the use of Parameterized Constructors....");
    }
    
}
