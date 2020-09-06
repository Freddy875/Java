/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promediodeunarreglo;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class PromedioDeUnArreglo {

    /**
     * Leer 5 numeros desde e teclado
     * Almacenarlos en un arrego 
     * Realizar la media de los numeros
     * positivos
     * La media de los numeros negativos
     * Y contar el numero de ceros
     */
    public static void main(String[] args) {
        
        float fNumeros[] = new float[5],
            fSumaPositivos = 0,
            fConteoPositivos = 0,
            fMediaPositivos = 0,
            fSumaNegativos = 0,
            fConteoNegativos = 0,
            fMediaNegativos = 0,
            fConteoCeros = 0;


        //Pedir los números del arreglo

        JOptionPane.showMessageDialog(null,
        "Este programa te pide 5 números para guardarlos en un arreglo"
        + "\nDespues calcula la media de los 5 números"
        + "\nY te dice cuandtos positivos, negativos y ceros tienes");

        //i es un contador 
        for(int i = 0; i < 5; i++){

            fNumeros[i] = Float.parseFloat(JOptionPane.showInputDialog(
                "Ingresa al número: " + (i+1) 
            ));

            /*
            Validamos cuantos numeros son positivos
            Cuantos son negativos 
            Y cuantos son cero 
            */
            
            if (fNumeros[i] == 0 ) {
                
                fConteoCeros++;

            } else if (fNumeros[i] > 0) {
                
                fSumaPositivos += fNumeros[i];

                fConteoPositivos++;

            } else {
                
                fSumaNegativos += fNumeros[i];

                fConteoNegativos++;

            }//fin if-else

        }//fin for

        //Calculamos la media de los números positivos 

        if (fConteoPositivos == 0) {
            
            JOptionPane.showMessageDialog(null,
                "No se puede obtener la media de los números positivos ",
                "ERROR",
                JOptionPane.ERROR_MESSAGE
                );

        } else {

            fMediaPositivos = fSumaPositivos/fConteoPositivos;
            
        }//fin if-else para los números positivos


        //Calculamos la media de los numeros negativos

        if (fConteoNegativos == 0) {

            JOptionPane.showMessageDialog(null,
                "No se puede obtener la media de los números negativos ",
                "ERROR",
                JOptionPane.ERROR_MESSAGE
                );

            
        } else {

            fMediaNegativos = fSumaNegativos/fConteoNegativos;
            
        }//fin del if-else de los números negativos

        //Mostramos en pantalla los resultados 

        JOptionPane.showMessageDialog(null,
        "En total ingresaste: " 
        + "\n" + fConteoCeros + " ceros"
        + "\n" + fConteoPositivos + " números positivos " 
        + " y su media es: " + fMediaPositivos
        + "\n" + fConteoNegativos + " números negativos " 
        + " y su media es: " + fMediaNegativos
        );

    }//fin public static void main
    
}//fin public class PromedioDeUnArreglo
