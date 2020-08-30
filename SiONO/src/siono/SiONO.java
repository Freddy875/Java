/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siono;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class SiONO {

    /**
     * repetir el mensaje hasta que se ingrese un no 
     */
    public static void main(String[] args) {
        
        String sRespuesta;
        
        do{
        
            
            
        sRespuesta = JOptionPane.showInputDialog( 
                "¿Quieres continuar?");
        
            switch(sRespuesta){
            
                case "S" :
                case "s" :
                case "SI":
                case "Si":
                case "si":
                
                    JOptionPane.showMessageDialog(null,
                        "Tu respuesta fue: " + sRespuesta);
                
                break;
            
                case "N" :
                case "n" :
                case "NO":
                case "No":
                case "no":
            
                    JOptionPane.showMessageDialog(null,
                        "Tu respuesta fue: " + sRespuesta
                        + "\nFin del Programa");
                
                break;
            
                default:
                
                    JOptionPane.showMessageDialog(null,
                           "Opción NO Valida",
                           "ERROR",
                           JOptionPane.ERROR_MESSAGE
                    );
            
                
            
            }//fin switch-case
        
        }while(
              (!"N".equals(sRespuesta)) 
             && (!"n".equals(sRespuesta)) 
             && (!"NO".equals(sRespuesta))
             && (!"No".equals(sRespuesta)) 
             && (!"no".equals(sRespuesta)) 
                );
        
    }//fin public static void main 
    
}//fin public class SiONo 
