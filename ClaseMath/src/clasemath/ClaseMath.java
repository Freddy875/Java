/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasemath;

/**
 *
 * @author Freddy875
 */
public class ClaseMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Raíz Cuadrada*/
        
        double dRaiz = Math.sqrt(9);
        
        double dBase = 5, dExponente = 2;
        
        //La clase Math solo es para tipos de datos double
        
        System.out.println(dRaiz);
        
        int iRaiz = (int)Math.sqrt(9);
        
        /*Aqui se realizo un casteo de un tipo double a un tipo int*/
        
        /*Potencia*/
        
        System.out.println(iRaiz);
        
        double dResultado = Math.pow(dBase, dExponente);
        
        System.out.println(dResultado);
        
        /*Redondeo*/
        
        double dNumero = 4.56;
        
        long lResultado = Math.round(dNumero);
        
        System.out.println(lResultado);
        
        float fNumero = 8.17f;
        
        int iResultado = Math.round(fNumero);
        
        System.out.println(iResultado);
        
        /*Random*/
        
        double dAleatorio = Math.random();
        
        System.out.println(dAleatorio);
        
        //El metodo max se usa para encontrar el valor más alto de dos números
        
        System.out.println(Math.max(5, 10));
        
        //El metodo min se usa para encontrar el valor más bajo de dos números
        
        System.out.println(Math.min(5,10));
        
        //El metodo abs devuelve el valor absoluto de un número
        
        System.out.println(Math.abs(-4.7));
        
        /*
        Se establece un rango de numeros a obtener de manera aleatoria 
        En este caso es del 0 al 100
        */
        int iNumeroRandom = (int)(Math.random()*101);
        
        System.out.println(iNumeroRandom);
        
    }//fin public static void main
    
}//fin public class ClaseMath
