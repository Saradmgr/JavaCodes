/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplecatchblock;

/**
 *
 * @author Victus
 */
public class MultipleCatchBlock {

    public static void main(String[] args) {
        try{
            int arr[] = new int[]{1,2,3,4,5,6,7};  //Initializing an array of size 7...
            arr[4] = arr[4]/0;                     //Dividing a number by zero will definitely throw an exception..
            System.out.println("Last statement of try block...");
        }
                catch(ArithmeticException e)  //This will be executed if we tend to divide a number by 0. Which is definitely an exception/error !!! 
                {
                    System.out.println("You should not divide a number by 0...");
                }
                    catch(ArrayIndexOutOfBoundsException e) //If we tend to access the elements of an array out of the bound then this will be executed...
                    {
                        System.out.println("Accessing element of array outside of the limit...");
                    }
                        catch(Exception e)  //If the above declared catch blocks will not meet any exception declared within it then the last catch block will be executed...
                                {
                                       System.out.println("Some other exception..");
                                }
        System.out.println("Out of the nested try-catch block... ");
    }
    
}
