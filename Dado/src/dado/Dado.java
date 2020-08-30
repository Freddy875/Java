/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dado;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class Dado {

    /**
     * Este programa simila ser un dado de 6 caras
     */
    public static void main(String[] args) {
        
        int iDado;
        
        iDado = (int)(Math.random()*7);
        
        JOptionPane.showMessageDialog(null, "Avanzas " + iDado);
        
    }//fin public static void main 
    
}//fin public class Dado
