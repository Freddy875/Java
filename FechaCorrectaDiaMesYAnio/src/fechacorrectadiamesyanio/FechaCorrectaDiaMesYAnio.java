/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechacorrectadiamesyanio;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class FechaCorrectaDiaMesYAnio {

    /**
     *  Pedir el día, mes y anio de una fecha 
     * E indicar si la fecha es correcta.
     * Suponga que todos los meses son de 30 días
     * 
     */
    public static void main(String[] args) {
        
        int iDia,iMes,iAnio;
        
        iDia = Integer.parseInt(
                JOptionPane.showInputDialog("Ingresa el día: "));
        
        iMes = Integer.parseInt(
                JOptionPane.showInputDialog("Ingresa el mes: "));
        
        iAnio = Integer.parseInt(
                JOptionPane.showInputDialog("Ingresa el año: "));
        
        if((iDia>=1) && (iDia<=30)){
            
            if((iMes>=1) && (iMes<=12)){
                
                if(iAnio > 0){
                    
                    JOptionPane.showMessageDialog(null, 
                            "La fecha es correcta"
                    + "\nLa fecha es: " + iDia + "/" + iMes + "/" + iAnio );
                    
                }else{
                    
                    JOptionPane.showMessageDialog(null, 
                            "La fecha es incorrecta"
                    + "\nEl año debe ser mayor que 0");
                    
                }
                
            }else{
             
                JOptionPane.showMessageDialog(null, 
                        "La fehca es incorrecta"
                + "\nEl mes tiene que estar entre 1 a 12");
                
            }
            
        }else{
            
            JOptionPane.showMessageDialog(null, 
                    "La fecha es incorrecta"
            + "\nEl día debe estar entre 1 a 30");
            
        }
        
    }//public static void main
    
}//public class FechaCorrectaDiaMesYAnio
