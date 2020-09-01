/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicar10numerosimpares;

/**
 *
 * @author Freddy875
 */
public class Multiplicar10NumerosImpares {

    /**
     * Diseñar un programa que muestre
     * el producto de los 10 primeros 
     * numeros impares 
     */
    public static void main(String[] args) {
        
        int iContador, iNumeroImpar, iMultImpar = 1;
        
        //Pirmero vamos a mostrar los 10 primeros números impares
        
        System.out.println("Los primeros 10 numeros impares son: ");
        
        for(iContador = 1; iContador <= 1; iContador++){
            
            for(iNumeroImpar = 1; iNumeroImpar <= 20; iNumeroImpar+=2){
                
                System.out.println(iContador++ + "|\t" + iNumeroImpar);
                
                iMultImpar = iMultImpar * iNumeroImpar;
                
            }//fin for
            
        }//fin for
        
        System.out.println("El resultado de multiplicar los 10 primeros "
                + "números impares es: " + iMultImpar);
        
    }//fin public static void main
    
}//fin public class Multiplicar10NumerosImpares
