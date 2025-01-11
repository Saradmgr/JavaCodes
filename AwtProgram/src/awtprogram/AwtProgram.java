/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package awtprogram;
import java.awt.*;

public class AwtProgram extends Frame{
        
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f1 = new Frame();
        Button b1 = new Button("Button");
        Label l1 = new Label("Saraswati Multiple Campus");
        TextField t1 = new TextField();
         f1.setBounds(350,400,500,600);
         b1.setBounds(200,200,400,400);
         l1.setBounds(100,100,100,100);
         f1.setSize(200,150);
         f1.add(b1);
         f1.add(l1);
         f1.add(t1);
         f1.setLayout(null);
         f1.setVisible(true);

    }
    
}
