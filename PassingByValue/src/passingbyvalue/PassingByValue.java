/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passingbyvalue;

/**
 *
 * @author Victus
 */
public class PassingByValue {
    
    int a,b ;
    void Add(int i, int j)
    {
        a= i+100;
        b =j+100;
        //System.out.println("a="+a+"\tb="+b);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        PassingByValue obj = new PassingByValue();
        int a=200, b=300;
        System.out.println("The value of a and b  before call: ");
        obj.Add(a, b);
        System.out.println("The value of a and b after call: ");
        System.out.println("a="+a+"\tb="+b);
    }
    
}
