/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatotal;

import javax.swing.JOptionPane;

/**
 *
 * @author fer87
 */
public class SumaTotal {

    /**
     *Pedir número hasta que se ingrese un 0 
     * Mostrar la suma de todos los números 
     * introduccidos
     */
    public static void main(String[] args) {
        
        int iNumero1, iSumaTotal = 0 ;
        
        do{
        
        iNumero1 = Integer.parseInt(JOptionPane.showInputDialog(
                "Este programa suma todos los números que ingreses"
              + "\nEste proceso continuara hasta que ingreses un cero"
              + "\nIngresa un número cualquiera"));
        
        iSumaTotal =  iSumaTotal + iNumero1;
        
        
        }while(iNumero1 != 0);
        
        JOptionPane.showMessageDialog(null, 
                "El total de la suma de los números que ingresaste es: " 
                + iSumaTotal);
        
    }//fin public static void main
    
}//fin public class SumaTotal
