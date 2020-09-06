/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar5numeros;

import java.util.Scanner;

import javax.swing.JOptionPane;


/**
 *
 * @author Freddy875
 */
public class Ordenar5Numeros {

    /**
     * Leer 5 numeros 
     * Guardarlos en un arreglo 
     * Y mostrarlos en orden 
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        float[] fNumeros1 = new float[5];

        /*
        
        System.out.println("Primer Arreglo"
        + "\nEste programa te almacena 5 números que ingreses"
        + "\nen un arreglo y luego te los muestra en orden"
        + "\nGuardando los datos en el arreglo");

        //i es un contador
        //Llenar los elementos de un arreglo con System.out.print
        for(int i=0; i<5; i++){

            System.out.print("Ingresa el número " + (i+1) + " : ");

            fNumeros1[i] = entrada.nextFloat();

        }//fin for

        
        System.out.println("\nMostrar los elementos del arreglo");

        for(float i:fNumeros1){

            System.out.println(i);

        }//fin for

        */

        float[] fNumero2 = new float[5];

        JOptionPane.showMessageDialog(null,
            "Segundo Arreglo"
            + "\nEste programa te almacena 5 números que ingreses"
            + "\nen un arreglo y luego te los muestra en orden"
            + "\nGuardando los datos en el arreglo"
        );

        //j es Contador
        for(int j = 0; j < 5; j++){

            fNumero2[j] = Float.parseFloat(JOptionPane.showInputDialog(
                "Ingresa el número " + (j+1) + " : ")
                );

        }//fin for

        for(float j:fNumero2){

            JOptionPane.showMessageDialog(null,
            "Los número que ingresaste son: " + j);

        }//fin for


    }//fin public static void main
    
}//fin public class Ordenar5Numeros
