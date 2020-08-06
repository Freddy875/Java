/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores2;

/**
 *
 * @author fer87
 */
public class Operadores2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int iNumero1 = 10;
        System.out.println("El primer valor del número es: " + iNumero1);
        
        iNumero1 += 5;
        
        System.out.println("Después de la suma el valor del número es: " 
                           + iNumero1);
                
        iNumero1 -= 5;
        
        System.out.println("Después de la resta el valor del número es: "
                        + iNumero1);
        
        iNumero1 *= 5;
        
        System.out.println("Después de la multiplicación el valor del "
                + "número es: " + iNumero1);
        
        iNumero1 /= 5;
        
        System.out.println("Después de la división el valor del número es: "
                            + iNumero1);
        
        iNumero1 %= 5;
        
        System.out.println("El valor del residuo de la división es: " 
                            + iNumero1);
        
    }//fin public static void main
    
}//fin  public class Operadores2
