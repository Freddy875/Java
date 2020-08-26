/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class Calificacion {

    /**
     *Pedir al usuario una calificación 
     * entre el 0 al 10 y mostrar de la siguiente forma:
     * Insuficiente,
     * Suficiente,
     * Bien,
     * Notable,
     * Sobresaliente
     */
    public static void main(String[] args) {
       
        int iCalificacion;
        
        iCalificacion = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa una calificación (0 - 10)"));
     
            switch(iCalificacion){
                
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                   
                    JOptionPane.showMessageDialog(null, 
                            "Tu calificación: " 
                            + iCalificacion
                            + " es Insuficiente");
                    
                break;
                //fin case del 1 al 5 lo que significa Insuficiente
                
                case 6:
                case 7:
                   
                    JOptionPane.showMessageDialog(null, 
                            "Tu calificación: " 
                            + iCalificacion
                            + " es Suficiente");
                    
                break;
                //fin case del 6 al 7 lo que significa Suficient
                
                
                case 8:
                    
                    JOptionPane.showMessageDialog(null, 
                            "Tu calificación: " 
                            + iCalificacion
                            + " es Bien");
                    
                   
                break;
                //fin case 8 lo que significa Bien
                
                case 9:
                    
                    JOptionPane.showMessageDialog(null, 
                            "Tu calificación: " 
                            + iCalificacion
                            + " es Notable");
                    
                break;
                //fin case 9 lo que significa Notablee
                
                case 10:
                
                   JOptionPane.showMessageDialog(null, 
                            "Tu calificación: " 
                            + iCalificacion
                            + " es Sobresaliente");
                     
                break;
                //fin case 10 lo que significa Sobresaliete
                
                default:
                    
                   JOptionPane.showMessageDialog(null,
                    "La calificación NO esta dentro del rango valido (0 - 10)"
                    ,"Opcion NO Valida"
                    ,JOptionPane.ERROR_MESSAGE);
            
                
            }//fin switch-case
            
        
    }//fin public static void maid
    
}//fin public class Calificacion
