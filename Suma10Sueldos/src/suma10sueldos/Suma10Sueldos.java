/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma10sueldos;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class Suma10Sueldos {

    /**
     *Pedir 10 Sueldos 
     * Mostrar su suma y cuantos hay mayores 
     * de $1000.00
     */
    public static void main(String[] args) {
        
        float fSueldos,
              fSumaSueldosMayores = 0,
              fSumaSueldosMenores = 0,
              fSumaSueldosTotales = 0;
        
        int iContadorSueldosMayores = 0, 
            //Cuenta todos los sueldos mayores a 1000
            iContadorSueldosMenores = 0,    
            //Cuneta todos los sueldo menores de 1000
            iContadorCeros = 0,
            //Cuneta todos los sueldos negativos o que sean cero
            iContadorFinal = 0;
            //Sumamos todos los sueldos al final 
        
              
        for(int iContador = 1; iContador <= 10; iContador ++){
            
            fSueldos = Float.parseFloat(JOptionPane.showInputDialog( 
                "Este programa realiza la suma de 10 sueldos"
               + "\nY te dice cuantos de esos sueldos son mayores de $1000 "
               + "\nIngresa el sueldo número: " + iContador));
            
            if(fSueldos <= 0){//Validamos si los sueldos son negativos o cero 
                
                iContadorCeros++;
                
            }else if(fSueldos >= 1000){
            
                iContadorSueldosMayores++;
                
                fSumaSueldosMayores += fSueldos;
                                           
            }else{
                
                iContadorSueldosMenores++;
                
                fSumaSueldosMenores += fSueldos;
                
            }
                                  
        }//fin for
        
        if(iContadorCeros == 10){
            /*
            Validamos que todos los números no sean negativos o cero
            */
            
            JOptionPane.showMessageDialog(null,
                           "No se puede sacar la media si todos tus números "
                         + "son negativos o cero",
                           "ERROR",
                           JOptionPane.ERROR_MESSAGE
                   );
        }else{
            
            fSumaSueldosTotales = fSumaSueldosMayores + fSumaSueldosMenores;
            
            JOptionPane.showMessageDialog(null, 
                "La suma de todos los sueldos es: " + fSumaSueldosTotales
            + "\nY tienes: " + iContadorSueldosMayores 
            + " sueldos mayores a $1000"
            + "\nY " + iContadorSueldosMenores + " sueldos menores a $1000"
            + "\nY " + iContadorCeros + " sueldos que no se pueden utilizar"
            + "\nPorque son negativo o cero");
            
            
            
        }//fin if-else
        
    }//fin public static void main
    
}//fin public class Suma10Sueldos
