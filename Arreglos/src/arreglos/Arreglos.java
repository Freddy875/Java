/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] iNumeros1 = new int[3];
        //Asi se crea un arreglo en Java 
        
        iNumeros1[0] = 7;
        iNumeros1[1] = 5;
        iNumeros1[2] = 10;
        //Asi es como se llenan los valores de un arreglo 
        
        System.out.println(iNumeros1[0] 
        + "\n" + iNumeros1[1]
        + "\n" + iNumeros1[2]);
        
        System.out.println("Primer arreglo");
        
        //Imrpimimos el primer arreglo
        for(int iContador = 0; iContador<=2 ; iContador++){
            
            System.out.println(iNumeros1[iContador]);
            
        }//fin for
        
        //Creamos un segundo contador
        
        int[] iNumeros2 = {5,7,9,11};
        
        //Imprimimos el segundo arreglo
        
        System.out.println("Segundo arreglo");
        
        for(int jContador = 0; jContador<4; jContador++){
            
            System.out.println(iNumeros2[jContador]);
            
        }//fin for

        //Llenar un arreglo

        int nElementos;
        //Esta variable es para saber cuantos elementos tiene el arreglo


        nElementos = Integer.parseInt(JOptionPane.showInputDialog(
            "Ingresa la cantidad de elementos que deseas que tenga el arreglo"));

        String[] cLetras = new String [nElementos];
        //Aqui creamos el arreglo
        //Es un arreglo dinamico 

        //Llenamos el arreglo
        for(int iContador = 0; iContador < nElementos ; iContador++){

            cLetras[iContador] = JOptionPane.showInputDialog(
                "Ingresa el dato " + (iContador+1)
            ); 

        }//fin for

        //Mostramos el arreglo

        for(int jContador = 0; jContador < nElementos ; jContador++ ){

            JOptionPane.showMessageDialog(null,
                "Los caracteres de arreglo son: " + cLetras[jContador]);

        }//fin for
        
        
    }//fin public static void main
    
}//fin public class Arreglos
