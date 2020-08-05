/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author fer87
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float fNumero1,
              fNumero2,
              fSuma,
              fResta,
              fMult,
              fDiv,
              fResiduo;
        
        System.out.println("Ingresa el primer número: ");
        
        fNumero1 = entrada.nextFloat();
        
        System.out.println("Ingresa el segundo número: ");
        
        fNumero2 = entrada.nextFloat();
        
        fSuma = fNumero1 + fNumero2;
        
        fResta = fNumero1 - fNumero2;
        
        fMult = fNumero1 * fNumero2;
        
        fDiv = fNumero1/fNumero2;
        
        fResiduo = fNumero1%fNumero2;

        System.out.println("El resultado de la suma es: " + fSuma);
        
        System.out.println("El resultado de la resta es: " + fResta);
        
        System.out.println("El resultado de la  multiplicación es: " + fMult);
        
        System.out.println("El resultado de la división es: " + fDiv);
        
        System.out.println("El resultado del residuo es: " + fResiduo);
        
        
    }//public static void main
    
}//fin public class Operadores
