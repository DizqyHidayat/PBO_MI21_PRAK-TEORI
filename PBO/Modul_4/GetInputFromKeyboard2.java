/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_4;

/**
 *
 * @author Abennaya
 */
import javax.swing.JOptionPane; 
public class GetInputFromKeyboard2 
{ 
 public static void main( String[] args ){ 
 String name = ""; 
 name = JOptionPane.showInputDialog("Please enter your name"); 
 
 String msg = "Hello " + name + "!"; 
 
 JOptionPane.showMessageDialog(null, msg); 
 
 } 
} 
