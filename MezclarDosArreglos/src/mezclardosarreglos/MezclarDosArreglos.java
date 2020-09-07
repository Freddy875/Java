/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mezclardosarreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class MezclarDosArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int iArregloA[],iArregloB[],iArregloC[];

        iArregloA = new int[10];//iArregloA con 10 elementos
        iArregloB = new int[10];//iArregloB con 10 elementos
        iArregloC = new int[20];//iArregloC con 20 elementos
        //iArregloC es la conbinacion de los ArreglosA y B


        //Llenamos el primer arreglo
        //i es un contador
        for(int i = 0; i < 10; i++){

            iArregloA[i] = Integer.parseInt(JOptionPane.showInputDialog(
            "Esto es para llenar el primer arreglo"
            + "\n Ingresa al número: " + (i+1)   
            ));

        }//fin for

        //Lenamos el segundo arreglo
        //j es un contador
        for(int j = 0; j < 10; j++){

            iArregloB[j] = Integer.parseInt(JOptionPane.showInputDialog(
            "Esto es para llenar el segundo arreglo"
            + "\n Ingresa al número: " + (j+1)   
            ));

        }//fin for

        //Ahora vamos a mezclar los dos Arreglos en el arreglo C

        //k es un contador
        //l es un contador
        int k = 0;

        for(int l = 0; l < 10; l++){

            iArregloC[k] = iArregloA[l];

            k++;

            iArregloC[k] = iArregloB[l];

            k++;

        }//fin for

        //m es un contador
        for(int m = 0; m < 20; m++){

            JOptionPane.showMessageDialog(null,
            "La combinación de ambos arreglos es: "
            + "\n" + (m+1) + " : " + iArregloC[m]);

            /*
            System.out.println( 
            "La combinación de ambos arreglos es: "
            + "\n" + (m+1) + " : " + iArregloC[m]);
            */
            
        }//fin for
        
        
    }//fin public static void main
    
}//fin public classMezclarDosArreglos
