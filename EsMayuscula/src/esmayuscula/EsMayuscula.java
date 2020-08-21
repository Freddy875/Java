/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esmayuscula;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class EsMayuscula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char cLetra;
        
        cLetra = JOptionPane.showInputDialog(
                "Ingresa una letra cualquiera: ").charAt(0);
        
        if(Character.isUpperCase(cLetra)){
            
            JOptionPane.showMessageDialog(null, 
                    "Tu letra: " + cLetra + " es Mayuscula");
            
        }else{
            
            JOptionPane.showMessageDialog(null, 
                    "Tu letra: " + cLetra + " es Minuscula");
            
        }//fin if-else
        
    }//fin public static ovid main
    
}//fin public class EsMayuscula
