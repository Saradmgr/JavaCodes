/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nestedtrycatchblock2;

public class NestedTryCatchBlock2 {

    public static void main(String[] args) {
       try{   // Nested try block...
           try{   // Let's say this is try-block 1.
                    System.out.println("Going to Divide.");
                    int b=39/0;
              }
           catch(ArithmeticException e)   // This will be the catch of try-block 1 if exception occurs.
                 {
                     System.out.println("No, you tried to divide a number by zero which is invalid!!!\t"+e);
                 }
                        try{   //Let's say this is try-block 2.
                                int a[] = new int[5];
                                a[5] = 4;   // Initialized to a[4] but tried to access a[5] which will be an exception !
                           }
                        catch(ArrayIndexOutOfBoundsException e)   //This will be the catch of try-block 2 if exception occurs.
                        {
                            System.out.println("No, you tried to access an array out of the bound !!!\t"+e);
                        }
                        System.out.println("Other Statement.");
       }
        catch(Exception e)
        {
            System.out.println("Hurray !!! Exception Handled.");
        }
                    System.out.println("Normal Flow.");
    }
    
}
