/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superkeyword;
 
     class SuperClass
     {
         int num = 100 ;
     }

     class SubClass extends SuperClass
     {
         int num = 200;   /* Here the variable "num" is already declared above.
                             and compiler may get confuse when we want abc.num to display from main() 
                             about which num,the parent class  num i.e 100 or the child class num i.e 200.
                             In this case we use super keyword. Which tells the compiler that we want to invoke parent class num i.e 100.
                            */
         void  display()
         {
             System.out.println(super.num+"\n");   // use of super keyword to invoke parent class num... i.e num=100...
             System.out.println(num);   // The compiler will know its the num within this child class i.e num=200...
         }
     }
public class SuperKeyword {

    public static void main(String[] args) {
        // TODO code application logic here
        SubClass abc = new SubClass();
       /* System.out.println("The number is :"+abc.num); 
          If we don't use super keyword, it will print the child class variable value i.e num=200.
        */
       abc.display();
    }
    
}
