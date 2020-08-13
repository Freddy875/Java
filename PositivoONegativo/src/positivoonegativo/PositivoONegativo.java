/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positivoonegativo;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class PositivoONegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int iNumero;
        
        iNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un "
        
                + "número"));
                
        if(iNumero == 0){
            
            JOptionPane.showMessageDialog(null, "Tu número es " + iNumero);
            
        }else if(iNumero > 0){
            
            JOptionPane.showMessageDialog(null, "Tu número " + iNumero + 
                    " es  Positivo");
            
        }else{

            JOptionPane.showMessageDialog(null, "Tu número " + iNumero + 
                    " es Negativo");
            
        }//fin if else 
 
        
    }//fin public static void main   
    
}//fin public class PositivoONegativo
