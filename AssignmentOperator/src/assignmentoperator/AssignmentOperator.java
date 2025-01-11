/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignmentoperator;

/**
 *
 * @author Victus
 */
public class AssignmentOperator {

    public static void main(String[] args) {
        // TODO code application logic here
        int a=10, b=10, c;
        c=a+b ;
        System.out.println("The value of c is : "+c);
        c+=a;   //as c=c+a;
        System.out.println("The value of c is : "+c);
        c-=a;   //as c=c-a; 
        System.out.println("The value of c is : "+c);
        c*=a;   //as c=c*a;
        System.out.println("The vlaue of c is : "+c);
        c/=a;   //as c=c/a;
        System.out.println("The value of c is : "+c);
        c%=a;   //as c=c%a;
        System.out.println("The value of c is : "+c);
        
        System.out.println("\n");
        a=5;     //This is valid declaration..
        c=100;   //The new value of c will be 100.
        c+=a;    //addition of new value of c and a.
        System.out.println("The new value of c is : "+c); //Output will be 105...
        c+=b;
        System.out.println("what will be the value of c : "+c); //new value of c and above b value...
        c&=a;
        System.out.println("The & value of c is : "+c);
        c^=a;
        System.out.println("The ^ value of c is : "+c);
        c|=a;
        System.out.println("the | value of c is : "+c);
        c<<=2;
        System.out.println("The << value of c is : "+c);
        c>>=2;
        System.out.println("The >> value of c is : "+c);
        c>>=2;
        System.out.println("The new >> value of c is : "+c); 
    }
}
