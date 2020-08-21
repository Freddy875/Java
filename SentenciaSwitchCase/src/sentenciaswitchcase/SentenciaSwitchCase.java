/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaswitchcase;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class SentenciaSwitchCase {

    /**
     * La sentencia Switch-Case:
     * 
     * Switch(){
     * 
     *      case 1:
     *              Instrucciones1;
     *      break;
     *      case 2:
     *              Instrucciones2;
     *      break;
     *      ...
     *      case n:
     *              InstruccionesN;
     *      break;
     *      default:
     *              CasoContrarios
     *      break;
     * 
     * }
     * 
     */
    public static void main(String[] args) {
        
        int iDatos;
        
        iDatos =  Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa un número entre el 1 al 5"));
        
        switch(iDatos){
     
           case 1:
                  
               JOptionPane.showMessageDialog(null, "Opción: " + iDatos);
               
           break;
           case 2:
                JOptionPane.showMessageDialog(null, "Opción: " + iDatos);
           break;
           case 3:
                JOptionPane.showMessageDialog(null, "Opción: " + iDatos);
           break;
           
           case 4:
                JOptionPane.showMessageDialog(null, "Opción: " + iDatos);
           break;
           
           case 5:
                JOptionPane.showMessageDialog(null, "Opción: " + iDatos);
           break;
           
           default:
                JOptionPane.showMessageDialog(null, "Opción NO Valida");
           break;
      
        }
        
        
    }//fin public static void main
    
}//fin public class SentenciaSwitchCase
