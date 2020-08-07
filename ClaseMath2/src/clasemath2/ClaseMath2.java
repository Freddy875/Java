/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasemath2;

import java.util.Scanner;

/**
 *
 * @author fer87
 */
public class ClaseMath2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double dNumero1;
        
        System.out.println("Raíz Cuadrado");
        
        System.out.println("Ingresa un número: ");
        
        dNumero1 = entrada.nextFloat();
        
        System.out.println("La Raíz Cuadrada de tu número es: " + 
                Math.sqrt(dNumero1));
        
        System.out.println("Potencia");
        
        double dBase, dExponente, dResultado;
        
        System.out.println("Ingresa el primer número: ");
        
        dBase = entrada.nextFloat();
        
        System.out.println("Ingresa el segundo número: ");
        
        dExponente = entrada.nextFloat();
        
        System.out.println("El resultado de elevar " + dBase + " a la potencia "
        + dExponente + " es: " + Math.pow(dBase, dExponente));
        
        System.out.println("Redondeo");
        
        double dNumero2;
        
        System.out.println("Ingresa un número: ");
        
        dNumero2 = entrada.nextDouble();
        
        System.out.println("Al redondear tu número el resultado es: " + 
                Math.round(dNumero2));
        
        System.out.println("El mayor de dos números ");
        
        double dNumero3,dNumero4;
        
        System.out.println("Ingresa el primer número: ");
        
        dNumero3 = entrada.nextDouble();
        
        System.out.println("Ingresa el segundo numero: ");
        
        dNumero4 = entrada.nextDouble();
        
        System.out.println("El mayor de los dos número es: " 
                + Math.max(dNumero3, dNumero4));
        
        System.out.println("El menor de los dos números es: "
                + Math.min(dNumero3, dNumero4));
        
        
        
        System.out.println("Valor absoluto");
        
        double dNumero5;
        
        System.out.println("Ingresa un número: ");
        
        dNumero5 = entrada.nextDouble();
        
        System.out.println("El valor absoluto de tu número es: "
        + Math.abs(dNumero5));
        
        
        
        System.out.println("Obtendras un número aleatorio del 0 al 100");
        
        int iNumeroRandom = (int)(Math.random()*101);
        
        System.out.println("Tu número aleatorio es: " + iNumeroRandom);

    }//fin public static void main
    
}//fin public class ClaseMath2
