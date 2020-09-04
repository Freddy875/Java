/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimoymaximo;

import java.util.Scanner;

/**
 *
 * @author Freddy875
 */
public class MinimoYMaximo {

    /**
     * Encontrar el maximo y el minimo de un arreglo de números
     */
    public static void main(String[] args) {
        
        int[] myList = {5,4,8,6,3,2,9};
        
        Scanner obtenerNumero = new Scanner(System.in);
        
        int i, max,min,suma;
        
        min = max = myList[0];
                
        for(i = 0; i < myList.length; i++){
            
            //Este if es para encontrar el minimo
            
            if(min > myList[i]){
                
                min = myList[i];
                
            }//fin if
            
            //Este if es para encontrar el maximo 
            
            if(max < myList[i]){
                
                max = myList[i];
                
            }//fin if-else
            
        }//fin for
        
        System.out.println("El máximo es " + max + " y el minimo es " + min);
        
    }//fin public static void main
    
}//fin public class MinimoYMaximo
