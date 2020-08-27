/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiondekg;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class ConversionDeKG {

    /**
     * Pasar unidades de Kg a otra unidad de medida de masa
     */
    public static void main(String[] args) {
        
        double dUnidadesKg,//para Kilogramo
              dUnidadesGramo,
              dUnidadesMg,//para Miligramo
              dUnidadesToneladas,//para Toneladas
              dUnidadesStone,//para Stone
              dUnidadesLibra,//para Libras
              dUnidadesOnza;//para Onzas
              
             
        
        dUnidadesKg = Double.parseDouble(JOptionPane.showInputDialog(
                "Ingresa la cantidad en Kilogramos(Kg) que deseas convertir"));
        
        dUnidadesGramo = dUnidadesKg * 1000;
        dUnidadesMg = dUnidadesKg * 1e6;
        dUnidadesToneladas = dUnidadesKg/1000;
        dUnidadesStone = dUnidadesKg /6.35;
        dUnidadesLibra = dUnidadesKg * 2.205;
        dUnidadesOnza = dUnidadesKg * 35.274;
        
        JOptionPane.showMessageDialog(null,dUnidadesKg + " Kg equivale a:"
                + "\n " + dUnidadesGramo + " Gr"
                + "\n " + dUnidadesMg + " mg"
                + "\n " + dUnidadesToneladas + " Toneladas"
                + "\n " + dUnidadesStone + " Stones"
                + "\n " + dUnidadesLibra + " Libras"
                + "\n " + dUnidadesOnza + " Onzas" );
        
    }//fin public static void main
    
}//fin public class ConversionDeKG
