/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averiguarlacantidaddedinero;

import java.util.Scanner;

/**
 *
 * @author Freddy875
 */
public class AveriguarLaCantidadDeDinero {

    /**
     * fNumero1 tiene N dineron
     * fNumero2 tiene la mitad de dinero que fNumero2
     * fNumero3 tiene la mitad de lo que posee 
     * fNumero1 y fNumero2 juntos
     * Cuanto es la cantiad de dinero 
     * que poseen los 3 numeros
     */
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner (System.in);
        
        float fNumero1,fNumero2,fNumero3,fTotal ;
        
        System.out.println("Ingresa una cantidad de dinero: ");
        
        fNumero1 = entrada.nextFloat();
        
        fNumero2 = fNumero1/2;
        
        fNumero3 = (fNumero1 + fNumero2)/2;
        
        fTotal = fNumero1 + fNumero2 + fNumero3;
        
        System.out.println(fNumero1);
        
        System.out.println(fNumero2);
        
        System.out.println(fNumero3);
        
        System.out.println("La cantidad de dinero entre los tres es: " 
                + fTotal);
        
        System.out.println("El primer número es: " + fNumero1 + "\nLa mitad de "
                + " ese número es " + fNumero2 + 
                "\nY la suma de los dos números "
                + fNumero1 + " + " + fNumero2 + " = " + (fNumero1+fNumero2) +
                "\nLa mitad de la suma de ambos número es: " + fNumero3 +
                "\nLa suma de " + fNumero1 + " + " + fNumero2 + " + " + fNumero3
                + " = " + fTotal);
        
        
    }//fin public static void main
    
}//public class AveriguarLaCantidadDeDinero
