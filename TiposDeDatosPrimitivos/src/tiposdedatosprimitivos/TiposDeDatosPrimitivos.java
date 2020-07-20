/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdedatosprimitivos;

/**
 *
 * @author Freddy875
 */
public class TiposDeDatosPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tipos de datos enteros
        
        byte bytes;
        
        bytes = 12;
        
        short corto = 12345;
        
        int entero = 123456;
        
        long largo = 123456789;
        
        System.out.println("El valor de byte es: " + bytes);
        
        System.out.println("El valor de short es: " + corto);
        
        System.out.println("El valor del int es: " + entero);
        
        System.out.println("El valor de long es: " + largo);
        
        //Tipos de dato real o float
        
        float decimal = 3.1416f;
        
        double doble = 1.23456789;
        
        System.out.println("El valor de float es: " + decimal );

        System.out.println("El valor del double es: " + doble);
        
        //Tipos de datos caracter
        
        char caracter = 'a';
        
        System.out.println("El valor de char es: " + caracter );
        
        //Tipos de datos booleanos
        
        boolean decision1 = true;
        
        System.out.println("El valor del boolean es: " + decision1);
        
        boolean decision2 = false;
        
        System.out.println("El valor del boolean ahora es: " + decision2);
        
        
    }//fin public static void main
    
}
