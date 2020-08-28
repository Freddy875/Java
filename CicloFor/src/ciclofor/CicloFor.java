/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclofor;

import java.util.Scanner;

/**
 *
 * @author Freddy875
 */
public class CicloFor {

    /**
     * Ciclo for 
     * 
     * for (Inicialización; Condicion; Aumento o Decremento){
     * 
     *  Instrucciones;
     * 
     * }
     */
    public static void main(String[] args) {
        
        /*
        
        Incremento del 0 al 10

        for (int iNumero1 = 0; iNumero1 <=10 ; iNumero1++){
      
           System.out.println(iNumero1);
       
        }//fin for
      
        */
        
        /*
        
        //Decremento de 10 al 0
               
        for (int iNumero2 = 10; iNumero2 >=0 ; iNumero2--){
      
           System.out.println(iNumero2);
       
        }//fin for
      
        */
        
        /*
<<<<<<< HEAD
        
        En este ciclo el usuario ingresa un cuantos números quiere ver en la 
        pantalla y se incrementan de uno en uno desde el 0 hasta el número
        que ingreso
        
=======
>>>>>>> 48703ac260839ce6064da160761e6e6078e5d4b0
        int iNumero3, iContador;
        
        Scanner entrada = new Scanner(System.in);
               
        System.out.println("Ingresa cuántos números quieres ver en pantalla: ");
        
        iContador = entrada.nextInt();
        
        for (iNumero3 = 0; iNumero3 <= iContador ; iNumero3++){
      
           System.out.println(iNumero3);
       
        }//fin for
      
        */
        
        /*
        En este ciclo el usuario ingresa un cuantos números quiere ver en la 
        pantalla y se incrementan de dos en dos desde el 0 hasta el número
        que ingreso
        */
        
        int iNumero4, iContador;
        
        Scanner entrada = new Scanner(System.in);
               
        System.out.println("Ingresa cuántos números quieres ver en pantalla: ");
        
        iContador = entrada.nextInt();
        
        for (iNumero4 = 0; iNumero4 <= iContador ; iNumero4+=2){
      
           System.out.println(iNumero4);
       
        }//fin for
        
    }//fin public static void main
    
}//fin public class CicloFor
