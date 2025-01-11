/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodoverloading;

/**
 *
 * @author Victus
 */
public class MethodOverloading {

    public int Sum(int x, int y)   //Sum method with (int, int) type.
    {
        return (x+y);
    }
    
    public int Sum(int x, int y, int z)   //Sum method with (int, int, int) type.
    {
        return x + y + z;
    }
    
    public float Sum(float x, float y)   //Sum method with (float, float) type.
    {
        return x+y;
    }
    
    public double Sum(double a, double b)   //Sum method with (double, double) type.
    {
        return a+b ;
    }
    
    public float Sum(float i, int j)   //Sum method with (float, int) type.
    {
        return i+j;
    }
    /*As we can see there are many methods with the same name as 'Sum'.
        But every Sum method has different parameters. For example:
        One Sum method has (int, int). and another Sum method has (float,float).
        In this way compiler understannds the method we wanted to access according to the parameters we pass in main method...
        This is the concept of Method Overloading.
    */
    
    /*public void Sum()
    {
        System.out.println("Lets check a void method with same name i.e Sum.");
    }*/
    public static void main(String[] args) {
        // TODO code application logic here
         MethodOverloading a = new  MethodOverloading();
         System.out.println("Calling First Method :"+a.Sum(2, 5));
         System.out.println("Calling Second Method :"+a.Sum(2, 5, 9));
         System.out.println("Calling Third Method :"+a.Sum(2.7f, 5.9f));
         System.out.println("Calling Fifth Method :"+a.Sum(3.8f, 5));
         System.out.println("Calling Fourth Method :"+a.Sum(7.77d, 5.999d));
         //System.out.println("Does void method works ?"+a.Sum());   //Void method is not acceptable in this, compiler suggests !!!
         System.out.println("\nI learned about the concept of Method Overloading. \nSame method name but different parameters.");
    }
    
}
