/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadradodeun.numero;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class CuadradoDeUnNumero {

    /**
     * Leer un número y mostrar su cuadrado,
     * Repetir el proceso hasta que se introduzca 
     * un numero negativo 
     */
    public static void main(String[] args) {
        
        int iNumero1,iCuadrado;
        
        
      do{
          
          iNumero1 = Integer.parseInt(JOptionPane.showInputDialog(
            "Este programa te dice el cuadrado de un número"
            + "\nEste proceso se repetira hasta que ingreses 0"
            + "\nIngresa el número que quieres elevar al cuadrado"
            ));
        
          
          iCuadrado = (int)Math.pow(iNumero1, 2);
            
          JOptionPane.showMessageDialog(null,"Tu número " + iNumero1 + 
            " elevado al cuadrado es: " + iCuadrado);
      
      }while(iNumero1 != 0);//Mientras que el número sea positivo o 0
        
    }//fin public static void main
    
}//fin public class CuadradoDeUnNumero
