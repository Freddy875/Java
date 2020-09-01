/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeron;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class NumeroN {

    /**
     *Pedir un número al usuario 
     * Si el número es positivo 
     * recorrer todos los números
     * desde el 1 hasta el N
     * Si el número es negativo
     * recorrer todos los números
     * desde el N hasta el 1 
     * 
     */
    public static void main(String[] args) {
        
        int iNumero1,
            iContador;
        
                
        iNumero1 = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa un número cualquiera"));
        
        if(iNumero1 == 0 ){
            
            for(iContador = 0 ; iContador <= 1; iContador++){
                                
                System.out.println(iContador);
                
            }//fin for
            
        }else if(iNumero1 > 0){
            
            for(iContador = 0 ; iContador <= iNumero1; iContador++){
                                
                System.out.println(iContador);
                
            }//fin for
            
            
        }else{
            
           for(iContador = iNumero1 ; iContador <= 1; iContador++){
                
                System.out.println(iContador);
                
            }//fin for 
            
        }
        
    }//fin public static void main
    
}//fin public class NumeroN
