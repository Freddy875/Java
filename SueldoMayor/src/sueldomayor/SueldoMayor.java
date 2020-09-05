/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldomayor;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class SueldoMayor {

    /**
     * Pedir al usuario un número N de sueldos 
     * Y mostrar el sueldo maximo
     */
    public static void main(final String[] args) {
                      
        int iNumeroSueldos;

        iNumeroSueldos = Integer.parseInt(JOptionPane.showInputDialog(
            "Este programa te permite ingresar los sueldos que tu quieras"
            + "\nY despues te muestra cual es el sueldo más grande"
            + "\n¿Cuantos sueldos deseas ingresar?"));
        
        
        float fSueldos[] = new float [iNumeroSueldos],
             fSueldoMaximo;
            
            
        do{
            
            if (iNumeroSueldos <= 0) {
            
                JOptionPane.showMessageDialog(null,
                "No puedes tener un arreglo de tamaño negativo o cero",
                "ERROR",
                JOptionPane.ERROR_MESSAGE
                );


            } else {
            
                //Primero llenamos los valores del arreglo 
                //i es un contador
                for(int i = 0; i < fSueldos.length; i++){

                    do{
                    
                        fSueldos[i] = Float.parseFloat(
                                JOptionPane.showInputDialog(
                                    "Ingresa al sueldo: " + (i+1) ));

                        
                    }while(fSueldos[i] <= 0);
                     /*
                    Este ciclo es para evitar que se ingrese un sueldo con valor de 
                    cero o negativo
                    */

                }//fin for
                               
                fSueldoMaximo= fSueldos[0];
                
                //j es un contador
                //Ahora recorremos los valores del arreglo 
                for(int j = 0; j <  fSueldos.length; j++){
                    
                    if (fSueldoMaximo < fSueldos[j]) {

                            fSueldoMaximo = fSueldos[j]; 
                        
                        }//fin if 
                    
                }//fin for

                
                JOptionPane.showMessageDialog(null,
                "El sueldo máximo es: " + fSueldoMaximo);
            
            }//fin if-else    
        
        }while(iNumeroSueldos < 0);
        
    }//fin public static void main
    
}//fin public class SueldoMayor