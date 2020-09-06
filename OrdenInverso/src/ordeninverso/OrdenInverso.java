/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordeninverso;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class OrdenInverso {

    /**
     * Leer 5 numeros guardarlos en un arreglo
     * Y mostrarlos en orden inverso al introducido 
     */
    public static void main(String[] args) {
        
        float[] fNumeros = new float[5];

        JOptionPane.showMessageDialog(null,
        "Este programa guarda 5 números en un arreglo y los muestra en el orden inverso");


        //Primero llenamos el arreglo
        //i es un contador
        for(int i = 0; i < 5; i++){

            fNumeros[i] = Float.parseFloat(JOptionPane.showInputDialog(
                "Ingresa el número " + (i+1) + " : ")
                );

        }//fin for

        //Ahora mostramos los elementos del arreglo en orden inverso

        for(int j = 4; j >= 0; j--){

            JOptionPane.showMessageDialog(null,
            "Los números son en orden inverso"
            + "\nNúmero " + (j+1) + " : " + fNumeros[j]);

        }//fin for
        
        
    }//fin public static void main
    
}//fin public class OrdenInverso