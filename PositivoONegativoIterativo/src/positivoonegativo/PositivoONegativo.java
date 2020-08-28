/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positivoonegativo;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875+
 */
public class PositivoONegativo {

    /**
     * Leer un número e indicar si es positivo o negativo
     * Este proceso se repetira hasta que se introduzca 
     * un 0
     */
    public static void main(String[] args) {
        
        int iNumero1;
        
        do{
            
            iNumero1 = Integer.parseInt(JOptionPane.showInputDialog(
            "Este programa te dice si el número que ingreses es "
          + "Positivo o Negativo"
          + "\nEste proceso se repite hasta que ingreses 0"
          + "\nIngresa un número cualquiera: "));
            
         if(iNumero1 > 0){
             
             JOptionPane.showMessageDialog(null, "Tu número "
              + iNumero1 + " es positivo");
             
         }else if (iNumero1 < 0){
             
             JOptionPane.showMessageDialog(null, "Tu número "
              + iNumero1 + " es negativo");
             
             
         }else{
         
         
             JOptionPane.showMessageDialog(null, "Tu número "
              + iNumero1 + " es cero");
             
             
         }//fin if-else  
            
        }while(iNumero1 != 0);
        
    }//fin public static void main
    
}//fin public class PositivoONegativo
