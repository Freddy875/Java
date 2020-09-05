/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximoyminimopositivos;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class MaximoYMinimoPositivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int iTamanio,
            iMayor;
        
        iTamanio = Integer.parseInt(JOptionPane.showInputDialog( 
            "Este programa te dice cual el número mayor y el número menor "
          + "\nDe un arreglo el el cual tu ingresas su tamaño "
          + "\n¿Por favor ingresa el tamaño del arreglo ?"));
        
        int iArreglo[] = new int [iTamanio];
        
        do{
            
            if(iTamanio <=  0){
                
                JOptionPane.showMessageDialog(null,
                    "No puedes tener un arreglo de tamaño negativo o cero",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE
                );
                
            }else{
                
                //i es un contador
                //Primero llenamos los valores del arreglo 
                
                for(int i=0; i < iArreglo.length; i++){
                
                    do{
                    
                        iArreglo[i] = Integer.parseInt(
                                JOptionPane.showInputDialog(
                                    "Ingresa el valor " + (i+1) ));
                   
                    
                    }while(iArreglo[i] <= 0);
                    /*
                    Este ciclo es solo para validar que el arreglo se llene 
                    Con valores validos, solo números positivos
                    */
                
                }//fin for
                
            }//fin if-else
            
            iMayor = iArreglo[0];
            
            //j es un contador
            //Ahora recorremos los valores del arreglo 
            for(int j = 0; j < iArreglo.length; j++){
                
                if(iArreglo[j] > iMayor){
                    
                    iMayor = iArreglo[j];
                    
                }//fin if
                
            }//fin for
            
            JOptionPane.showMessageDialog(null, "El número mayor es: " + iMayor);
            
        }while(iTamanio < 0);
        /*
        Este ciclo es para evitar tener un arreglo con valores negativos o cero
        */
        
        
        
    }//fin public static void main
    
}//fin public class MaximoYMinimoPositivos
