/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularpromedio;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class CalcularPromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int iNumero1,
            iElementos = 0,
            iSuma = 0;
        
        float fMedia;
        
        iNumero1 = Integer.parseInt(
                    JOptionPane.showInputDialog("Este programa calcula el promedio "
                + "de todos los números que ingreses"
                + "\nEste proceso se repite hasta que ingreses un 0"
                + "\nIngresa un número: "));
        
               
        //do{
          
        while(iNumero1 != 0){
            
            iSuma += iNumero1;
            
            iElementos++;
                  
            iNumero1 = Integer.parseInt(
                    JOptionPane.showInputDialog("Este programa calcula el promedio "
                + "de todos los números que ingreses"
                + "\nEste proceso se repite hasta que ingreses un 0"
                + "\nIngresa un número: "));
            
            
        }//fin while   
            
        //}while(iNumero1 != 0);
        
        if(iElementos == 0){
            
             JOptionPane.showMessageDialog(null, "La división entre cero"
                            + " NO esta definida",
                            "Division entre cero",
                            JOptionPane.ERROR_MESSAGE);
            
        }else{
            
            fMedia = (float) iSuma/iElementos;
            
            JOptionPane.showMessageDialog(null, 
                    "La media es: " + fMedia);
            
        }//fin if-else
        
    }//fin public static void main
    
}//fin public class CalcularPromedio
