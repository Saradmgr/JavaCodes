/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodoverriding2;

        class Ram
        {
                public int sum(int x, int y)
                {
                   
                     return  x+y;
                }
              
        }

            class Hari extends Ram
            {
                    public int sum(int x, int y)
                    {
                        
                        return x + y;
                    }
            }
public class MethodOverriding2 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ram abc = new Ram(); 
        int add;
        add = abc.sum(2,10);
        System.out.println("\tThe sum of first method is :"+add);
        Ram xyz = new Hari();
        add = xyz.sum(10, 100);
        System.out.println("\tThe sum of second method is :"+add);
        System.out.println("\n\nHence we learned about the concept of method overriding...");
    }
    
}
