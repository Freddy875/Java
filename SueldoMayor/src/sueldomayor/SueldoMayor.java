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
        
        float fSueldos[],
            fSueldoMaximo = 0;

        int iNumeroSueldos;

        iNumeroSueldos = Integer.parseInt(JOptionPane.showInputDialog(
            "Este programa te permite ingresar los sueldos que tu quieras"
            + "\nY despues te muestra cual es el sueldo más grande"
            + "\n¿Cuantos sueldos deseas ingresar?"));

        if (iNumeroSueldos <= 0) {
            
            JOptionPane.showMessageDialog(null,
            "No puedes tener 0 sueldos o sueldos con valores negativos",
            "ERROR",
            JOptionPane.ERROR_MESSAGE
            );


        } else {
            
            //Primero llenamos los alores del arreglo 
            //i es un contador
            for(int i = 1; i <= iNumeroSueldos; i++){

                do{
                    
                    fSueldos[i] = Float.parseFloat(JOptionPane.showInputDialog(
                    "Ingresa al sueldo: " + i));

                    if (fSueldoMaximo < fSueldos[i]) {

                        fSueldoMaximo = fSueldos[i]; 
                        
                    }//fin if 

                }while(fSueldos[i] > 0);
                /*
                Este ciclo es para evitar que se ingrese un sueldo con valor de 
                cero o negativo
                */

            }//fin for

            JOptionPane.showMessageDialog(null,
            "El sueldo máximo es: " + fSueldoMaximo);
            
        }//fin if-else    
        
    }//fin public static void main
    
}//fin public class SueldoMayor
