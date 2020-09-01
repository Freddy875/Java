/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumade10numeros;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class SumaDe10Numeros {

    /**
     * Este programa le pide al usuario 
     * 10 números y escribe la suma total
     */
    public static void main(String[] args) {
        
        int iNumero1,iContador,iSuma = 0;
        
        for(iContador = 1; iContador <= 10; iContador++){
            
            iNumero1 = Integer.parseInt(JOptionPane.showInputDialog( 
                "Este porgrama te pide 10 números y luego te muestra la suma "
              + "de los 10"
              + "\nIngresa el " + iContador + " número"));
            
            iSuma = iSuma + iNumero1;
            
        }//fin for
        
        JOptionPane.showMessageDialog(null, "El resultado de sumar los "
                + "10 números es: " + iSuma);
        
    }//fin public static void main
    
}//fin public class SumaDe10Numeros
