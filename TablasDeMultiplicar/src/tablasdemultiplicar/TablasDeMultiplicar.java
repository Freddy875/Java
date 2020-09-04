/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablasdemultiplicar;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class TablasDeMultiplicar {

    /*
     * Pedir un número al usuario 
     * Mostrar la tabla de multiplicar 
     * de dicho número desde el 0
     * hasta el número final 
     * que también idicara el
     * usuario hasta que número 
     * quiere que termine  
     */
     
    public static void main(String[] args) {
    
        int iMultiplicando,
            iMultiplicador,
            iProducto,
            iNumeroFinal;

        iMultiplicando = Integer.parseInt(JOptionPane.showInputDialog(
            "Este programa te muestra la tabla de multiplicar "
            +"\nDesde el número que ingreses"
            +"\nHasta el número quieres"
            +"\nIngresa el número que quieres conocer su tabla de multiplicar"));

        iNumeroFinal = Integer.parseInt(JOptionPane.showInputDialog(
            "Ingresa el número con el que quieres terminar"
        ));   

        for(iMultiplicador = 0; iMultiplicador <= iNumeroFinal; iMultiplicador++){

            iProducto = iMultiplicando * iMultiplicador;

            System.out.println(iMultiplicando + " x " + iMultiplicador 
            + " = " + iProducto);

        }//fin for
            
    }//fin public static void main
    
}//fin public class TablasDeMultiplicar
