/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trinomiocuadradoperfecto;

import java.util.Scanner;

/**
 *
 * @author Freddy875
 */
public class TrinomioCuadradoPerfecto {

    /**
     * Hacer un programa que calcule el trinomio cuadrado perfecto
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float fNumero1, fNumero2, fTotal ; 
        
        System.out.println("Ingresa el primer número: ");
        
        fNumero1 = entrada.nextFloat();
        
        System.out.println("Ingresa el segundo número: ");
        
        fNumero2 = entrada.nextFloat();
        
        System.out.println("El cuadrado del primer número: " + fNumero1 
                + " es igual a: " + Math.pow(fNumero1, 2));
        
        System.out.println("El cuadrado del segundo número: " + fNumero2
                + " es igual a: " + Math.pow(fNumero2, 2));
        
        System.out.println("El doble de " + fNumero1  + " + " + fNumero2
        + " es igual a: "  + (2)*(fNumero1)*(fNumero2) );
        
        fTotal = fNumero1 + fNumero2;
        
        
        System.out.println("El resultado del trinomio es: " + 
                Math.pow(fTotal, 2));
        
    }//fin public static void main
    
}//fin public class TrinomioCuadradoPerfecto
