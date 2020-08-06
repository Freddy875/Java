/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementoydecremento;

/**
 *
 * @author fer87
 */
public class IncrementoYDecremento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        int iNumeroX = 5,
            iNumeroY = 5,
            iNumeroZ = 5,
            iNumeroW,
            iNumeroA = 10,
            iNumeroB;
        
        /***********************************************************/
        
        System.out.println("Incremento");
        
        System.out.println("El valor de iNumeroX es: " + iNumeroX);
        
        iNumeroX ++; //iNumeroX += 1;
        
        System.out.println("Después del incremento el valor del iNumeroX es: "
        + iNumeroX);
        
        /***********************************************************/
        
        System.out.println("Decremento");
        
        System.out.println("El valor de iNumeroY es: " + iNumeroY);
        
        iNumeroY -- ;
        
        System.out.println("Después del decremento el valor del iNumeroY es: "
        + iNumeroY);
        
        /***********************************************************/      
        
        iNumeroW = iNumeroZ++;
        
        //Primero se asigna el valor de 5 y luego se incremento el valor
                
        System.out.println(iNumeroW);
        
        System.out.println(iNumeroZ);
        
        iNumeroB = ++iNumeroA;
        
        /*
        Aqui ambos valores tiene el valor de 11 porque primero se incremento 
        Y después se asigno a iNumeroY
        */
        
        System.out.println(iNumeroA);
        
        System.out.println(iNumeroB);
        
        
    }//fin public static void main
    
}//fin public class IncrementoYDecremento
