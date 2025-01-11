/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trycatchexample;

public class TryCatchExample {

    public static void main(String[] args) {
        // TODO code application logic here
        try{
            //Declaring an array in java...
           // int a[] = new int[10]; // Initializing the array for 10 elements... //(If we don't define all the variables in the array... )  
            int a[] = new int[]{1,2,3,4,5,6,7,8,9,0}; //If we define all the elements present in the array.....
            System.out.println("Accessing the element :" +a[15]);   /* Will execute the statements of try block if we declare the a[] value till a[0] to a[9].
                                                                     as declared in the array...
                                                                    */
        }
            catch(ArrayIndexOutOfBoundsException e)               /*Will execute the statements of catch block if the statements of the try block
                                                                    doesn't meet its condition...
                                                                  */             
                    {
                        System.out.println("Exception thrown:"+e);
                    }
        System.out.println("out of the block...");
    }
    
}
