/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionfinal;

import java.util.Scanner;

/**
 *
 * @author Freddy875
 */
public class CalificacionFinal {

    /**
     * Participacion          10%
     * Primer Examen Parcial  25%
     * Segundo Examen Parcial 25%
     * Examen Final           40%  
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float fParticipacion,
              fPrimerExamen,
              fSegundoExamen,
              fExamenFinal = 0,
              fCalificacionFinal;
        
        System.out.println("Ingresa la calificación de participaciones: ");
        
        fParticipacion = entrada.nextFloat();
        
        System.out.println("Ingresa la calificación del Primer Examen: ");
        
        fPrimerExamen = entrada.nextFloat();
        
        System.out.println("Ingresa la calificación del Segundo Examen: ");
        
        fSegundoExamen = entrada.nextFloat();
        
        System.out.println("Ingresa la calificación del Examen Final: ");
        
        fExamenFinal = entrada.nextFloat();
        
        fParticipacion = fParticipacion*0.10f;
        
        fPrimerExamen = fPrimerExamen*0.25f;
        
        fSegundoExamen = fSegundoExamen*0.25f;
        
        fExamenFinal = fExamenFinal*0.40f;
        
        fCalificacionFinal = fParticipacion + fPrimerExamen + fSegundoExamen + 
                fExamenFinal;
        
        System.out.println("El porcentaje de pariticipaciones es: " 
                + fParticipacion);
        
        System.out.println("El porcentaje del Primer Examen: " 
                + fPrimerExamen);
        
        System.out.println("El porcentaje del Segundo Examen: " 
                + fSegundoExamen);
        
        System.out.println("El porcentaje del Examen Final: "
                + fExamenFinal);
        
        System.out.println("La calificacion final es: " + fCalificacionFinal);
        
        
    }//fin public static void main
    
}//fin public class CalificacionFinal
