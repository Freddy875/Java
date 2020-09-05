/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximoyminimo;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class MaximoYMinimo {

    /**
     * Encontrar el maximo y el minimo de un arreglo
     */
    public static void main(String[] args) {

        int iTamanio;
        
        iTamanio = Integer.parseInt(JOptionPane.showInputDialog( 
            "Este programa te dice cual el número mayor y el número menor "
          + "\nDe un arreglo el el cual tu ingresas su tamaño "
          + "\n¿Por favor ingresa el tamaño del arreglo ?"));
        
        int iArreglo[] = new int [iTamanio];
        
        
        //i es un contador
        //Aqui llenamos los valores del arreglo
        for(int i = 0; i < iArreglo.length; i++){
            
           iArreglo[i] = Integer.parseInt(JOptionPane.showInputDialog( 
                "Ingresa el dato " + (i+1) ));
            
        }//fin for
           
        int iMaximo,iMinimo;
        
        iMaximo = iMinimo = iArreglo[0];
        
        //j es un contador
        //Ahora recorremos los valores del arreglo 
        for(int j = 0; j < iArreglo.length; j++){
            
            if(iArreglo[j] > iMaximo){
                
                iMaximo = iArreglo[j];
                
            }//fin if
            
            if(iArreglo[j] < iMinimo){
                
                iMinimo = iArreglo[j];
                
            }//fin if
            
        }//fin for
        
        JOptionPane.showMessageDialog(null,
                "El valor máximo es: " + iMaximo 
              + "\nY el valor minimo es: " + iMinimo);
        
    }//fin public static void main
    
}//fin public class MaximoYMinimo
