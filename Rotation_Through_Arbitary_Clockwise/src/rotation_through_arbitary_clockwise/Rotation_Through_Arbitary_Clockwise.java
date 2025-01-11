/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rotation_through_arbitary_clockwise;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

public class Rotation_Through_Arbitary_Clockwise {
    public static class RotationThroughArbitaryClockwise extends Frame{
	int x1,y1,x2,y2;
	int w,xx,yy,z;
	double angle;
 public RotationThroughArbitaryClockwise() {
     System.out.println("\nRotationThroughArbitaryClockwise ");
	 	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the x position in arbitary point ");
		int x=sc.nextInt();
		System.out.println("Enter the y position in arbitary point ");
		int y=sc.nextInt();
		System.out.println("Enter the coordinates of line");
		System.out.println("Enter the x1 coordinate");
		 x1=sc.nextInt();
		System.out.println("Enter the y1 coordinate");
		 y1=sc.nextInt();
		System.out.println("Enter the x2 coordinate");
		 x2=sc.nextInt();
		System.out.println("Enter the y2 coordinate");
		 y2=sc.nextInt();
		 System.out.println("Enter the angle");
		 int m=sc.nextInt();
		 angle=m * Math.PI/180;
		 double cos=Math.cos(angle);
		 double sin= Math.sin(angle);
		 
		    w = (int)((x1*cos)+(y1*sin)+((-x * cos)+(-y * sin)+x ));
		    xx = (int)((x1*-sin)+(y1*cos)+((x * sin)+(-y * cos)+y ));
		    yy = (int)((x2*cos)+(y2*sin)+((-x * cos)+(-y * sin)+x ));
		    z = (int)((x2*-sin)+(y2*cos)+((x * sin)+(-y * cos)+y ));
		
		setSize(300,300);
		setTitle("Rotation through arbitary point in clockwise rotation");
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		setVisible(true);
	}
	public void paint(Graphics g) {
		g.drawRect(x1,y1,x2,y2);
		g.drawString("Before rotation",x1+10,y1+10);
		g.drawRect(w,xx,yy,z);
		g.drawString("After rotation",w+10,xx+10);
}

}
    
public static void main(String[] args) {
		new RotationThroughArbitaryClockwise();
}}

