/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayorde2numeros;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class MayorDe2Numeros {

    /**
     * 
     */
    public static void main(String[] args) {
        
        int iNumero1, iNumero2;
        
        iNumero1 = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa el primer número: "));
        
        iNumero2 = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa el segundo número: "));
        
        if(iNumero1 == iNumero2){
            
            JOptionPane.showMessageDialog(null,
                    iNumero1 + " y " + iNumero2  + " ambos números son iguales");
            
        }else if(iNumero1 > iNumero2){
            
            JOptionPane.showMessageDialog(null, 
                    iNumero1 + " es mayor que " + iNumero2 );
            
        }else{
            
            JOptionPane.showMessageDialog(null, 
                    iNumero2 + " es mayor que " + iNumero1 );
            
        }//fin if-else
        
    }//fin public static void main
    
}//fin public class MayorDe2Numeros
