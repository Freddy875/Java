/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma3notas;

import java.util.Scanner;

/**
 *
 * @author Freddy875
 */
public class Suma3Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada  = new Scanner(System.in);
        
        float fNumero1, fNumero2, fNumero3, fSuma;
        
        System.out.println("Ingresa el primer número: ");
        
        fNumero1 = entrada.nextFloat();
        
        System.out.println("Ingresa el segundo número: ");
        
        fNumero2 = entrada.nextFloat();
        
        System.out.println("Ingresa el tercer número: ");
        
        fNumero3 = entrada.nextFloat();
        
        fSuma = fNumero1 +fNumero2 + fNumero3;
        
        System.out.println("La suma de los tres números es: " + fSuma);
        
    }//fin public static void main
    
}//fin public class Suma3Notas
