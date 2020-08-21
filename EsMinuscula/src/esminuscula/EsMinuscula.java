/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esminuscula;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class EsMinuscula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char cLetra;
        
        cLetra = JOptionPane.showInputDialog(
                "Ingresa una letra cualquiera: ").charAt(0);
        
        if(Character.isLowerCase(cLetra)){
            
            JOptionPane.showMessageDialog(null, 
                    "Tu letra: " + cLetra + " es Minuscula");
            
        }else{
            
            JOptionPane.showMessageDialog(null, 
                    "Tu letra: " + cLetra + " es Mayuscula");
            
        }
        
        
    }//fin public static void main
    
}//fin public class EsMinuscula
