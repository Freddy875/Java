/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayorymenor;

import java.util.Scanner;

/**
 *
 * @author Freddy875
 */
public class MayorYMenor {

    /**
     * El mayor y el menor
     * de los numeros de un arreglo
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Por favor ingresa el tamaño del arreglo: ");
        
        int n = teclado.nextInt();
        
        int Arreglo [] = new int [n];
        
        for(int i = 0; i < Arreglo.length; i++){
            
            System.out.println("Ingresa el dato " + (i+1) + " : ");
            
            Arreglo [i] = teclado.nextInt();
            
        }//fin for
        
        int mayor,menor; 
        
        mayor = menor = Arreglo[0]; 
        
        for(int j = 0; j < Arreglo.length; j++){
            
            if(Arreglo[j] > mayor ){
                
                mayor = Arreglo[j];
                
            }//fin if
            
            if(Arreglo[j] < menor){
                
                menor = Arreglo[j];
                
            }//fin if
            
        }//fin for
        
        
        System.out.println("El valor mayor es: " + mayor
         + "\nEl valor menor es: " + menor );
        
    }//fin public static void main
    
}//fin public class MayorYMenor
