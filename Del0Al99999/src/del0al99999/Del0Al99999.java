/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package del0al99999;

import javax.swing.JOptionPane;

/**
 *
 * @author fer87
 */
public class Del0Al99999 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int iNumero1;
        
        iNumero1 = Integer.parseInt(JOptionPane.showInputDialog(
                "Dame un número entre 0 al 99,999"));
        
        if(iNumero1 <= 0 || iNumero1 <= 9){
         
            JOptionPane.showMessageDialog(null,
                    "Tu número " + iNumero1 + " tiene una cifra");
            
        }else if(iNumero1 <= 10 || iNumero1 <= 99){
            
            JOptionPane.showMessageDialog(null,
                    "Tu número " + iNumero1 + " tiene dos cifras");
            
            
        }else if(iNumero1 <= 100 || iNumero1 <= 999){
            
            JOptionPane.showMessageDialog(null,
                    "Tu número " + iNumero1 + " tiene tres cifras");
            
            
        }else if(iNumero1 <= 1000 || iNumero1 <= 9999){
            
            JOptionPane.showMessageDialog(null,
                    "Tu número " + iNumero1 + " tiene cuatro cifras");
            
        }else if (iNumero1 <= 10000 || iNumero1 <= 99999){
            
            JOptionPane.showMessageDialog(null,
                    "Tu número " + iNumero1 + " tiene cinco cifras");
        }else{
            
            JOptionPane.showMessageDialog(null,
                    "Opción NO Valida");
            
        }//fin if-else
        
    }//fin public static void main
    
}//fin public class Del0Al99999
