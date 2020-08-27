/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclodowhile;

import java.util.Scanner;

/**
 *
 * @author Freddy875
 */
public class CicloDoWhile {

    /**
     * Ciclo Do-While
     * 
     * do{
     * 
     *      Instrucciones;
     * 
     * }while(condiciones);
     */
    public static void main(String[] args) {
        
        /*
        
        Del 0 al 10
        
        int iNumero1=0;
        
        do{
            
            System.out.println(iNumero1);
            
            iNumero1++;
            
        }while(iNumero1 <= 10);

        */
        
        int iNumero2 = 0, iContador;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa cuántos números quieres ver en pantalla: ");
        
        iContador = entrada.nextInt();
        
        do{
            
            System.out.println(iNumero2);
            
            iNumero2++;
            
        }while(iNumero2 <= iContador);
        
        
    }//fin public static void main
    
}//fin public class CicloDoWhile
