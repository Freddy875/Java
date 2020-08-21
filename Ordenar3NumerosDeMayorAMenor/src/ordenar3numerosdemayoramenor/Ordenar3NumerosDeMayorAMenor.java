/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar3numerosdemayoramenor;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class Ordenar3NumerosDeMayorAMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int iNumero1,iNumero2,iNumero3;
        
        iNumero1 = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa el primer número: "));
        iNumero2 = Integer.parseInt(JOptionPane.showInputDialog( 
                "Ingresa el segundo número: "));
        iNumero3 = Integer.parseInt(JOptionPane.showInputDialog( 
                "Ingresa el tercer número: "));
        
        if((iNumero1 > iNumero2) && (iNumero2 > iNumero3)){
            
            JOptionPane.showMessageDialog(null,
                    "Orden: " + iNumero1 + "," + iNumero2 + ","  + iNumero3);
            
        }else if((iNumero1 > iNumero3) && (iNumero3 > iNumero2)){
            
            JOptionPane.showMessageDialog(null,
                    "Orden: " + iNumero1 + "," + iNumero3 + ","  + iNumero2);
            
        }else if((iNumero2 > iNumero1) && (iNumero1 > iNumero3)){
            
            JOptionPane.showMessageDialog(null,
                    "Orden: " + iNumero2 + "," + iNumero1 + ","  + iNumero3);
            
        }else if((iNumero2 > iNumero3) && (iNumero3 >iNumero1)){
            
            JOptionPane.showMessageDialog(null,
                    "Orden: " + iNumero2 + "," + iNumero3 + ","  + iNumero1);
           
        }else if((iNumero3 > iNumero1) && (iNumero1 > iNumero2)){
            
            JOptionPane.showMessageDialog(null,
                    "Orden: " + iNumero3 + "," + iNumero1 + ","  + iNumero2);
            
        }else if((iNumero3 > iNumero2) && (iNumero2 > iNumero1)){
            
            JOptionPane.showMessageDialog(null,
                    "Orden: " + iNumero3 + "," + iNumero2 + ","  + iNumero1);
            
        }else{
            
            JOptionPane.showMessageDialog(null,
                    iNumero1 + "," + iNumero2 + "," + iNumero3 + 
                            " los tres números son iguales");
            
        }
        
    }//fin public static void main
    
}//fin public class Ordenar3NumerosDeMayorAMenor
