/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descuentodel20porciento;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class DescuentoDel20PorCiento {

    /**
     * En MegaPalza se hace un descuento
     * del 20% a los clientes cuyas compras
     * superen los $300
     * 
     * Hicimos unos ejercicios con la sentencia if-else
     */
    public static void main(String[] args) {
       
        int iTotalCompras;
        float fPrecioFinal;
        
        iTotalCompras = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa el total de tus compras: "));
        
        if(iTotalCompras <= 300){
            
            JOptionPane.showMessageDialog(null,
                "Tu monto total de compras NO aplica el desucneto del 20%"
            + "\nPor lo tanto debes pagar: $" + iTotalCompras);
            
        }else{
            
            fPrecioFinal = iTotalCompras - (float)(iTotalCompras*0.20);
            
            JOptionPane.showMessageDialog(null,
                "Tu monto total de compras Si se aplica el desucneto del 20%"
            + "\nPor lo tanto debes pagar: $" + fPrecioFinal);
            
            
        }//fin if-else
        
    }//fin public static void main
    
}//fin public class DescuentoDel20PorCiento
