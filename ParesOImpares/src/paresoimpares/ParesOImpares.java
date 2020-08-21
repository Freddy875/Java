/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paresoimpares;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class ParesOImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int iNumero1,iNumero2;
        
        iNumero1 = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa el primer número: "));
        
        iNumero2 = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa el segundo número: "));
        
        if(iNumero1%2==0 && iNumero2%2==0){
            
            JOptionPane.showMessageDialog(null,
                    iNumero1 + " y " + iNumero2  + " ambos son números pares");
            
        }else if(iNumero1%2==0 && iNumero2%2!=0){
            
            JOptionPane.showMessageDialog(null,
                    iNumero1 + " es par " + iNumero2  + " es impar");
            
        }else if(iNumero1%2!=0 && iNumero2%2==0){
            
            JOptionPane.showMessageDialog(null,
                    iNumero2 + " es par " + iNumero1  + " es impar");
            
        }else{
            
            JOptionPane.showMessageDialog(null,
                iNumero1 + " y " + iNumero2  + " ambos son números impares");
            
        }//fin if-else
        
    }//fin public static void main
    
}//fin public class ParesOImapres
