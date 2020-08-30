/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroaleatorio;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class NumeroAleatorio {

    /**
     * Hacer que el usuario adivine un numero.
     * Para ello generar un número aleatorio 
     * entre el 0 y el 100 y luego ir pidiendo números 
     * indicando si el número es mayor o menor 
     * con respecto al número N.
     * El proceso termina cuando el usuario acierta 
     * al número
     * Al final indicar cual era el número 
     * y el número total de intentos 
     */
    public static void main(String[] args) {
        
        int iNumero1,iAleatorio1,iContador = 0;
        
        iAleatorio1 = (int)(Math.random()*101);//0 al 100
        
        //System.out.println(iAleatorio);1
        
        do{
            
            iNumero1 = Integer.parseInt(JOptionPane.showInputDialog( 
                    "Intenta de adivinar el número"
                  + "\nIngresa un número entre el 0 al 100 "));
            
            if(iAleatorio1 > iNumero1 ){
                
                System.out.println("Ingresa un número mayor");
                
            }else{
                
                System.out.println("Ingresa un número menor");
                
            }//fin if-else
            
            iContador++;
            
        }while(iNumero1 != iAleatorio1);
        
        JOptionPane.showMessageDialog(null, 
                "Felicidades adivinaste el número: " 
        + iAleatorio1 + " con un total de: " 
        + iContador + " intentos");
        
    }//fin public static void main
    
}//fin public class NumeroAleatorio
