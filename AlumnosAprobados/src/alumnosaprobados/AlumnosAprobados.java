/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnosaprobados;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy
 */
public class AlumnosAprobados {

    /**
     *Dadas las notas de los alumnos e
     *Escribir la cantidad de alumnos 
     *aprobados, condicionados (=4) y suspensos      
     **/
    public static void main(String[] args) {

        float fNota;
        int iNumeroAlumnos,
            iAprobados = 0,
            iCondicionados = 0,
            iSuspenso = 0;


        iNumeroAlumnos = Integer.parseInt(JOptionPane.showInputDialog( 
        "Este programa te dice cuantos alumnos aprobaron"
        + "\nCuantos son condicionados y cuantos repobraron"
        + "\n¿Cunatos Alumnos deseas ingresas?")); 
        
        if (iNumeroAlumnos <= 0) {
            
            JOptionPane.showMessageDialog(null,
            "No puedes tener cero alumnos o un número de alumnos negativos",
            "ERROR",
            JOptionPane.ERROR_MESSAGE
            );

        } else {
            
            for(int iContador = 1; iContador <= iNumeroAlumnos; iContador++ ){

                do{

                    fNota = Float.parseFloat(JOptionPane.showInputDialog(
                        "Ingresa la calificación del alumno " + iContador + 
                        "(0 - 10): "));

                }while(fNota < 0 || fNota > 10);
                /*
                fin del do-while 
                Este se utiliza para validar que las calificaciones 
                esten entre el rango del 0 al 10  
                */

                if (fNota == 4) {
                    
                    iCondicionados++;

                } else if (fNota >= 5) {
                    
                    iAprobados++;

                } else {
                    
                    iSuspenso++;

                }//fin if-else
            
            }//fin for
            
        }//fin if-else

        JOptionPane.showMessageDialog(null,
        "Resultados: "
        + "\nTienes: " + iAprobados + " alumnos aprobados"
        + "\n " + iCondicionados + " alumnos condicionados"
        + "\nY " + iSuspenso + " alumnos en suspenso" );

    }//fin public static void main
    
}//fin public class AlumnosAprobados
