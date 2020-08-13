/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horasminutosysegundos;

import java.util.Scanner;

/**
 *
 * @author Freddy875
 */
public class HorasMinutosYSegundos {

    /**
     *Dado un numero de horas devuelve el numero
     * de semanas, días y horas Equivalentes
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int iTotalHoras, iSemanas, iDias, iHoras;
        
        System.out.println("Ingresa el número de horas: ");
        
        iTotalHoras = entrada.nextInt();
        
        iSemanas = iTotalHoras/168;
        
        iDias = iTotalHoras%168/24;
        
        iHoras = iTotalHoras%24;
        
        System.out.println("El equvalente es: \nSemanas: " + iSemanas + 
                "\nDias: " + iDias + "\nHoras: " + iHoras);
         
    }//fin public static void main 
    
}//fin public class HorasMinutosYSegundos
