/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplode10;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class MultiploDe10 {

    /**
     * 
     */
    public static void main(String[] args) {
       
        int iNumero1;
        
        iNumero1 = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa un número cualquiera: "));
        
        if(iNumero1%10 == 0){
            
            JOptionPane.showMessageDialog(null,
                    "Tu número: " + iNumero1 + " es multiplo de 10");
            
        }else{
            
            JOptionPane.showMessageDialog(null,
                    "Tu número: " + iNumero1 + " NO es multiplo de 10");
            
        }//fin if-else
        
        
    }//fin public static void main
    
}//public class MultiploDe10
