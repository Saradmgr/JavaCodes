/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inetaddressexample;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample 
{

    public static void main(String[] args) {
        try 
        {
            InetAddress address = InetAddress.getByName("www.youtube.com");
            System.out.println("IP Address: " + address.getHostAddress());
        } 
        
        catch (UnknownHostException e) 
        {
            System.out.println("\nIP Address could not be found!");
        }
    }
}
