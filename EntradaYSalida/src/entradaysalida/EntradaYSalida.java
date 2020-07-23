/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradaysalida;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class EntradaYSalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sCadena;
        
        int iEntero;
        
        char cLetra;
        
        float fReal;
        
        double doble;
        
        sCadena = JOptionPane.showInputDialog("\"Ingresa una cadena\"");
        
                iEntero = Integer.parseInt(JOptionPane.showInputDialog
        ("Ingresa un numero entero: "));
        
        cLetra = JOptionPane.showInputDialog("Ingresa un caracter: ").charAt(0);
        
        doble = Double.parseDouble(JOptionPane.showInputDialog
        ("Ingresa un decimal: "));
        
        fReal = Float.parseFloat(JOptionPane.showInputDialog
        ("Ingresa otro numero decimal: "));
        
        JOptionPane.showMessageDialog(null, "La cadena es: " + sCadena);
        
        JOptionPane.showMessageDialog(null, "El entero es: " + iEntero);
        
        JOptionPane.showMessageDialog(null, "El caracter es: " + cLetra);
        
        JOptionPane.showMessageDialog(null, "El numero decial es: " + doble);
        
        JOptionPane.showMessageDialog
        (null, "El otro numero decimal es: " + fReal);
       
    }//fin public static void main
    
}//fin public class EntradaYSalida
