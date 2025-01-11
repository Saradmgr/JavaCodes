/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simple_program;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Simple_program 
{

    public static void main(String[] args) 
    {
        JFrame j1 = new JFrame();
        j1.setResizable(false);
        j1.setLocation(200,70);
        j1.setVisible(true);
        j1.setSize(900,900);
        j1.setTitle("Sarad");
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel l1 = new JLabel();
        j1.add(l1);
        l1.setVisible(true);
        l1.setLayout(null);
        l1.setSize(100,200);
        l1.setBounds(50,50,70,50);
        l1.setText("Name");
        
        JTextField t1 = new JTextField();
        j1.add(t1);
        t1.setSize(200,200);
        t1.setVisible(true);
        t1.setBounds(50,70,90,50);
    }
    
}
