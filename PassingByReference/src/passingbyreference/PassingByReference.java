/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passingbyreference;

/**
 *
 * @author Victus
 */
public class PassingByReference {

        int a,b ;
        void add(PassingByReference  d)
        {
            d.a = d.a+100;
            d.b = d.b+100;
        }
    public static void main(String[] args) {
        // TODO code application logic here
         PassingByReference obj = new  PassingByReference ();
         int a=150, b=200 ;
         System.out.println("The value of a and b before call :");
         System.out.println("a="+obj.a+"\tb="+obj.b);
         obj.add(obj);
         System.out.println("\nThe value of a and b after call :");
         System.out.println("a="+obj.a+"\tb="+obj.b);
    } 
}
