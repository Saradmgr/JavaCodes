/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package throwskeywordexample;

public class ThrowsKeywordExample {
            
            int division(int a, int b) throws ArithmeticException   // use of throws keyword.
                                                                    // there might occur an exception so provide the exception handling code by try-catch.
            {
                int t=a/b ;
                return t ;
            }
    public static void main(String[] args) {
                ThrowsKeywordExample obj = new ThrowsKeywordExample();   // creating an object to access division().
                try
                {
                    System.out.println("After division the answer is : "+obj.division(1500, 0));   // providing the value of a and b.
                }
                catch(ArithmeticException e)
                {
                    System.out.println("You should'nt divide a number by 0.");
                }
    }
    
}
