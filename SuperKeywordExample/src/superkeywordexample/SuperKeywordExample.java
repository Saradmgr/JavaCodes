/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superkeywordexample;

    class Person
    {
        int id;
        String name;
              Person(int id, String name)
        {
            this.id = id;
            this.name = name;
        }
    }

        class Employee extends Person
        {
            float salary;
                Employee(int id, String name, float salary)
                {
                    super(id,name);   // reusing parent constructor.
                    this.salary= salary;
                }
                    void Display()
                    {
                        System.out.println("The id is :"+id+"\tThe name is :"+name+"\tThe salary is :"+salary);
                    }
        }
public class SuperKeywordExample {

    public static void main(String[] args) {
        // TODO code application logic here
        Employee e = new Employee(17,"Anish",100000.98f);
        e.Display();
    }
    
}
