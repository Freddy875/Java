
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglocrecienteodecreciente;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class ArregloCrecienteODecreciente {

    /**
     * Leer por teclado una serie de 10 números  
     * La aplicación debe de indicarnos si los 
     * números estan ordenados de forma creciente,
     * decreciente, o si estan desordenados
     */
    
    public static void main(String[] args) {
        
        int iArreglo[] = new int[10];
        boolean bCreciente = false,
                bDecreciente = false;


        //Llenamos el arreglo
        for (int i = 0; i < iArreglo.length; i++) {
            
            iArreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(
                "Este programa llena un arreglo de 10 números" 
                + "\nY te dice si tu arreglo esta en orden"
                + "\nCreciente,Decreciente, desordenado"
                + "\nO si todos los elementos son iguales"  
                + "\nIngresa el caracter " + (i+1) + " : "
            ));

        }//fin for 

        //Validamos si el arreglo esta en formato creciento o decreciente        
        for (int i = 0; i < iArreglo.length-1; i++) {
            
            if(iArreglo[i] < iArreglo[i+1]){//Creciente 1,2,3,...,10

                bCreciente = true;

            }//fin if

            if(iArreglo[i] > iArreglo[i+1]){//Decreciente 10,9,8,...,1

                bDecreciente = true; 

            }//fin if

        }//fin for
        
        if (bCreciente == true && bDecreciente == false) {
            
            JOptionPane.showMessageDialog(null,
            "El arreglo esta en formato creciente");

             //Imprimir el arreglo 
            for (int i = 0; i < iArreglo.length; i++) {
            
                System.out.println(iArreglo[i]);

            }//fin for


        } else if (bCreciente == false && bDecreciente == true){
            
            JOptionPane.showMessageDialog(null, 
            "El arreglo esta en formato decreciente");

             //Imprimir el arreglo 
            for (int i = 0; i < iArreglo.length; i++) {
            
                System.out.println(iArreglo[i]);

            }//fin for

        } else if (bCreciente == true && bDecreciente == true) {

            JOptionPane.showMessageDialog(null, 
            "El arreglo est en formato desordenado");

             //Imprimir el arreglo 
            for (int i = 0; i < iArreglo.length; i++) {
            
                System.out.println(iArreglo[i]);

            }//fin for
            
        } else {//if(bCreciente == false && bDecreciente == false){
            
            JOptionPane.showMessageDialog(null,
            "Todos los elementos del arreglo son iguales");

             //Imprimir el arreglo 
            for (int i = 0; i < iArreglo.length; i++) {
            
                System.out.println(iArreglo[i]);

            }//fin for

        }//fin if-else
                    
    }//fin public static void main
    
}//fin public class ArregloCrecienteODecreciente
