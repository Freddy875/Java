/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Entrada de Datos 
package introduccion;

import java.util.Scanner;

/**
 *
 * @author Freddy875
 */
public class Introduccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int iNumero;
        
        float fNumero;
        
        String sCadena1;
        String sCadena2;
        
        System.out.println("Ingresa otra cadena: ");
        
        sCadena2 = entrada.nextLine();
        
        System.out.println("La otra cadena es: " + sCadena2);
        
        System.out.println("Ingresa un numero entero: ");
        
        iNumero = entrada.nextInt();
        
        System.out.println("El numero entero es: " + iNumero);
        
        System.out.println("Ingresa un numero real: ");
        
        fNumero = entrada.nextFloat();
        
        System.out.println("El numero real es: " + fNumero);
        
        double dNumero;
        
        System.out.println("Ingresa otro numero de tipo real: ");
        
        dNumero = entrada.nextDouble();
        
        System.out.println("Ingresa una cadena: ");
        
        sCadena1 = entrada.next();
        
        System.out.println("La cadena es: " + sCadena1);
                
        char cLetra;
        
        System.out.println("Ingresa una letra: ");
        
        cLetra = entrada.next().charAt(0);
        
        System.out.println("El caracter es: " + cLetra);
        
    }//fin public static void main
    
}//fin public class Introduccion
