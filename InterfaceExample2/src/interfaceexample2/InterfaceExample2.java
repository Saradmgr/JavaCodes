/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaceexample2;
        //Create an interface
        interface Language
        {
                void getName(String name);
        }
            class ProgrammingLanguage implements Language
            {
                    //Implementation of abstract method i.e getName();
                    public void getName(String name)
                    {
                            System.out.println("The name of Programming Language is : "+name);
                    }
            }
public class InterfaceExample2 {

    public static void main(String[] args) {
        // TODO code application logic here
        ProgrammingLanguage p = new ProgrammingLanguage();
        p.getName("OOP in Java.");
    }
    
}
