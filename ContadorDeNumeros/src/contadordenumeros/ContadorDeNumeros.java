/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadordenumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class ContadorDeNumeros {

    /**
     * Pedir números hasta que se ingresa un cero
     * y mostrar cuantos números se han ingresado
     */
    public static void main(String[] args) {
        
        int iNumero1,iContador1 = 0;
        
        do{
            
            iNumero1 = Integer.parseInt(JOptionPane.showInputDialog( 
                "Este programa te dice cuantos números haz ingresado"
              + "\nEste proceso se repite hasta que ingreses 0"
              + "\nIngresa un número cualquiera: "));
            
            if(iNumero1 != 0){
                
                iContador1++;
                
                JOptionPane.showMessageDialog(null, "Haz ingresado: " 
                 + iContador1 + " números" );
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Fin del programa"
                        + "\nEn total ingresaste: " 
                 + iContador1 + " números");
                
            }//fin if-else
            
        }while(iNumero1 != 0);
        
    }//fin public static void main
    
}//fin public class ContadorDeNumeros
