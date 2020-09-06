/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordendearreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class OrdenDeArreglos {

    /**
     * Mostrar un arreglo que el usuario define el tamanio
     * En el orden en que ingreso los valores
     * y luego en el orden inverso
     */
    public static void main(String[] args) {
        
        int iTamanio;
        //Esta variable es para que el usuario indique el tamanio del arreglo
        
        iTamanio = Integer.parseInt(JOptionPane.showInputDialog(
            "Este programa muestra un arreglo el tu defines el tamaño"
            + "\nPrimero te los muestra en el orden en el que los ingresaste"
            + "\nY luego en el orden inverso en el que lo ingresaste"
            + "\nIngresa el tamaño del que quieres tu arreglo")
        );

        int[] iNumeros = new int [iTamanio];
        
        do {

            if (iTamanio <= 0 ) {
                
                JOptionPane.showMessageDialog(null,
                "No puedes tener un arreglo de tamaño negativo o cero",
                "ERROR",
                JOptionPane.ERROR_MESSAGE
                ); 
                
            } else {

                //Llenado del arreglo
                //i es un contador
                for(int i = 0; i<iNumeros.length; i++){

                    iNumeros[i] = Integer.parseInt(JOptionPane.showInputDialog(
                        "Ingresa el valor " + (i+1) + " : " )
                        );

                }//fin for
                
                //Mostramos el arreglo en el orden original

                //j es un contado

                System.out.println("El orden original del arreglo es: ");

                //j es un contador
                for(int j = 0; j < iNumeros.length; j++){

                    System.out.println("Número " + (j+1) + " : " + iNumeros[j]);

                }//fin for

                //Ahora mostramos el orden inverso del arreglo

                System.out.println("El orden inverso del arreglo es: ");

                //k es un contador
                for(int k = iNumeros.length-1; k >= 0; k-- ){

                    System.out.println("Número " + (k+1) + " : " + iNumeros[k]);

                }//fin for
                           
            }//fin if-else
                        
        } while (iTamanio < 0 );//fin do-while
        /*
        Este ciclo es para evitar que se ingrese un valor
        que el usuario ingrese un valor que no este dentro 
        del rango es decir que sea negativo o cero
        */

    }//fin public static void main
    
}//fin public class OrdenDeArreglos
