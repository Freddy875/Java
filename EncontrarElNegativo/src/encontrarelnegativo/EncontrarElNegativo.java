/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encontrarelnegativo;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class EncontrarElNegativo {

    /**
     * Pedir 10 numero y mostrar al final si se ha introducido algun negativo 
     */
    public static void main(String[] args) {
        
        int iNumero,
            iContadorNegativos = 0;
        
        boolean bHayNegativos = false;
        
        for(int i = 1; i<= 10; i++){
            
            iNumero = Integer.parseInt(JOptionPane.showInputDialog( 
                "Este programa te pide un arreglo de 10 números"
              + "\nDespúes te dice si hay algún numero negativo"
              + "\nIngresa el " + i + "° número"));
            
            if(iNumero < 0){
                
                bHayNegativos = true;
                
                iContadorNegativos++;
                
            }//fin if
                        
        }//fin for
        
        
        if(bHayNegativos == true ){
                
            JOptionPane.showMessageDialog(null, 
                "Hay  " + iContadorNegativos + " números negativos"
                + "\nY " + (10-iContadorNegativos) + " números positivos" );
                
        }else{
              
           JOptionPane.showMessageDialog(null, 
                "Hay  " + iContadorNegativos + " números negativos"
               + "\nY " + (10-iContadorNegativos) + " números positivos" );
                
                
        }//fin if-else
        
        
    }//fin public static void main
    
}//fin public class EncontrarElNegativo
