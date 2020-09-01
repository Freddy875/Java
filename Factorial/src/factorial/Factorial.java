/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class Factorial {

    /**
     * Pedir un número y calcular su factorial 
     */
    public static void main(String[] args) {
        
        int iContador,iNumero1,iFactorial = 1;
        
        iNumero1 = Integer.parseInt(JOptionPane.showInputDialog( 
            "Ingresa un número para hallar el factorial: "));
        
        if(iNumero1 < 0){
            
             JOptionPane.showMessageDialog(null,
                           "El número debe ser positivo",
                           "ERROR",
                           JOptionPane.ERROR_MESSAGE
                   );
            
        }else{
            
            for(iContador = 1; iContador <= iNumero1; iContador++ ){
                
                iFactorial *= iContador;
                
            }//fin for
            
            
            JOptionPane.showMessageDialog(null,
                    "El factorial de tu número " + iNumero1 
                   + " es " + iFactorial);
        }//fin if-else
        
    }//fin public static void main
    
}//fin public class Factorial
