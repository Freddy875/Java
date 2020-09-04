/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablamultiplicar;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class TablaMultiplicar {

    /**
     * Pedir un número al usuario 
     * Debe estar entre el 0 al 10
     * Mostrar la tabla de multiplicar 
     * de dicho número 
     */
    public static void main(String[] args) {
        
        int iMultiplicando,
            iMultiplicador = 0,
            iProducto;

        iMultiplicando = Integer.parseInt(JOptionPane.showInputDialog(
            "Este programa te muestra la tabla de multiplicar "
            + "\nDe los números del 0 al 10"
            + "\nIngresa el número que quieras conocer su tabla de multiplicar "
                    + "(1 - 10)"));
            
        if (iMultiplicando >=0 && iMultiplicando <=10 ) {
            
            for(iMultiplicador = 0; iMultiplicador <= 10; iMultiplicador++){

                iProducto = iMultiplicando *iMultiplicador;

                System.out.println(iMultiplicando + " x " + iMultiplicador +
                        " = " + iProducto);

            }//fin for
    
        } else {

            JOptionPane.showMessageDialog(null,
            "El número que ingresaste NO esta dentro del rango"
            +" permitido (0 - 10)",
            "ERROR",
            JOptionPane.ERROR_MESSAGE
    );

            
        }//fin if-else    

        
    }//fin public static void main
    
}//fin public class TablaMultiplicar
