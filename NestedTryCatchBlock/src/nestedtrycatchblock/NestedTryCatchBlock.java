/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nestedtrycatchblock;


public class NestedTryCatchBlock {

    public static void main(String[] args) {
        // Main try-block
        try{ // "This is the main try block.....
             // try-block2
                try {   // try-catch block inside another try block... 
                    // try-block3
                        try{   // try-catch block inside nested try block...
                           int arr[] ={1,2,3,4};
                           System.out.println(arr[10]);
                           }
                        catch(ArithmeticException e)   // catch of try-block3.
                           {
                        System.out.println("It is an Arithmetic Exception...");
                        System.out.println("Handled in try-block3.");
                           }
                    }
                    catch(ArithmeticException anish)   // catch of main try-block.
                    {
                        System.out.println("Arithmetic exception.");
                        System.out.println("Handled in main try-block...");
                    }
        
                    catch(ArrayIndexOutOfBoundsException khatri)   //catch of main try-block.
                    {
                        System.out.println("Array index out of bound exception.\t"+khatri);  // Here +khatri also prints the exception type...
                        System.out.println("Handled in main try-block...");
                    }
            }
                    catch(Exception e)   // If the catches of main try block is not suitable or related then the default catch exception is being executed.....
                    {
                            System.out.println("Exception.");
                            System.out.println("Handled in main try-block...");
                    }       
           }   
}
    
