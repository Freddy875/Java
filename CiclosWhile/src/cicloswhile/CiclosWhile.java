/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicloswhile;

import java.util.Scanner;

/**
 *
 * @author Freddy875
 */
public class CiclosWhile {

    /**
     * Ciclo While
     * 
     * while(condicion){
     * 
     *  Instrucciones;
     * 
     * }
     */
    public static void main(String[] args) {
       
        /*
        
        Del 1 al 10
        
        int iNumero1 = 1;
        
        while(iNumero1 <= 10){
            
            System.out.println(iNumero1);
            
            iNumero1++;
            
        }//fin while

        */
        
        /*Del 0 al 100
        
        
        int iNumero2 = 0;
        
        while(iNumero2 <= 100){
            
            System.out.println(iNumero2);
            
            iNumero2++;
            
        }//fin while
        
        */
        
        /*
        
        Del 10 al 1 
        
        int iNumero3 =  10;
        
        while(iNumero3 >= 1){
            
            System.out.println(iNumero3);
            
            iNumero3--;
            
        }//fin while

        */
        
        /*
        
        int iNumero4 = 0, iContador;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa cuántos números quieres ver en pantalla: ");
        
        iContador = entrada.nextInt();
        
        while(iNumero4 <= iContador){
            
            System.out.println(iNumero4);
            
            iNumero4++;
            
        }//fin while
        
        */
        
        //En esta caso va de dos en dos 
        
        int iNumero5 = 0, iContador;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa cuántos números quieres ver en pantalla: ");
        
        iContador = entrada.nextInt();
        
        while(iNumero5 <= iContador){
            
            System.out.println(iNumero5);
            
            iNumero5+=2;
            
        }//fin while
        

    }//fin public static void main
    
}//fin public class CiclosWhile
