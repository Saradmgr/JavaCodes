/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inetaddress;
import java.net.InetAdress;
import java.net.UnknownHostException;


public class InetAddressExample
{
 
    public static void main(String[] args) {
       try 
       {
           InetAddress address = InetAddress.getByName("www.facebook.com");
           System.out.println(address);
       }
       
       catch(UnknownHostException e)
       {
           System.out.println("\nIP Address could not be found !!!!!"); 
       }
    
    }
}
