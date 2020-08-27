/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuconversiomasa;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class MenuConversioMasa {

    /**
     * Pasar unidades de Kg a otra unidad de medida de masa con un menú
     */
    public static void main(String[] args) {
        
        double dUnidadesKg,//para Kilogramo
              dUnidadesHg, //para Hectogramos
              dUnidadesDag, //para Decagramos  
              dUnidadesGramo,//para gramos
              dUnidades_dg, //para decigramos
              dUnidades_cg, //para centigramos
              dUnidades_mg,//para miligramo
              dUnidadesToneladas,//para Toneladas
              dUnidadesStone,//para Stone
              dUnidadesLibra,//para Libras
              dUnidadesOnza;//para Onzas
        
        int iOpcion;
        
        iOpcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Este programa convierte unidades de Kilogramo(Kg) "
              + "\na otras unidades de masa"
              + "\n¿A que unidad deseas convertir?"
              + "\n1. Hectogramos(Hg)"
              + "\n2. Decagramos(Dag)"
              + "\n3. Gramos(g)"
              + "\n4. Decigramos(dg)"
              + "\n5. Centigramos(cg)"
              + "\n6. Miligramos(mg)"
              + "\n7. Toneladas"
              + "\n8. Stones"
              + "\n9. Libras"
              + "\n10. Onzas"));
        
        switch(iOpcion){
            
            case 1:
                
                dUnidadesKg = Double.parseDouble(JOptionPane.showInputDialog(
                "Ingresa la cantidad en Kilogramos(Kg) que deseas convertir"));
                
                dUnidadesHg = dUnidadesKg *10;
                
                JOptionPane.showMessageDialog(null, 
                        dUnidadesKg + " Kg equivale a: " 
                      + "\n " + dUnidadesHg + " Hg");
                
            break; //case Hectogramos
            
            case 2:
                
                dUnidadesKg = Double.parseDouble(JOptionPane.showInputDialog(
                "Ingresa la cantidad en Kilogramos(Kg) que deseas convertir"));
                
                dUnidadesDag = dUnidadesKg *100;
                
                JOptionPane.showMessageDialog(null, 
                        dUnidadesKg + " Kg equivale a: " 
                      + "\n " + dUnidadesDag + " Dag");
                
                
            break;//case Decagramos
            
            case 3:
                
                dUnidadesKg = Double.parseDouble(JOptionPane.showInputDialog(
                "Ingresa la cantidad en Kilogramos(Kg) que deseas convertir"));
                
                dUnidadesGramo = dUnidadesKg *1000;
                
                JOptionPane.showMessageDialog(null, 
                        dUnidadesKg + " Kg equivale a: " 
                      + "\n " + dUnidadesGramo + " Gr");
                
                
            break;//case Gramos
            
            case 4:
                
                dUnidadesKg = Double.parseDouble(JOptionPane.showInputDialog(
                "Ingresa la cantidad en Kilogramos(Kg) que deseas convertir"));
                
                dUnidades_dg = dUnidadesKg *1e4;
                
                JOptionPane.showMessageDialog(null, 
                        dUnidadesKg + " Kg equivale a: " 
                      + "\n " + dUnidades_dg + " dg");
                
            break;//case Decigramos
            
            case 5:
                
                dUnidadesKg = Double.parseDouble(JOptionPane.showInputDialog(
                "Ingresa la cantidad en Kilogramos(Kg) que deseas convertir"));
                
                dUnidades_cg = dUnidadesKg *1e5;
                
                JOptionPane.showMessageDialog(null, 
                        dUnidadesKg + " Kg equivale a: " 
                      + "\n " + dUnidades_cg + " cg");
                
                        
            break;//case Centigramos
            
            case 6:
                
                dUnidadesKg = Double.parseDouble(JOptionPane.showInputDialog(
                "Ingresa la cantidad en Kilogramos(Kg) que deseas convertir"));
                
                dUnidades_mg = dUnidadesKg *1e6;
                
                JOptionPane.showMessageDialog(null, 
                        dUnidadesKg + " Kg equivale a: " 
                      + "\n " + dUnidades_mg + " mg");
                
                
            break;//case Miligramos
            
            case 7:
                
                dUnidadesKg = Double.parseDouble(JOptionPane.showInputDialog(
                "Ingresa la cantidad en Kilogramos(Kg) que deseas convertir"));
                
                dUnidadesToneladas = dUnidadesKg/1000;
                
                JOptionPane.showMessageDialog(null, 
                        dUnidadesKg + " Kg equivale a: " 
                      + "\n " + dUnidadesToneladas + " Toneladas");
                                
            break;//case Toneladas
            
            case 8:
                
                dUnidadesKg = Double.parseDouble(JOptionPane.showInputDialog(
                "Ingresa la cantidad en Kilogramos(Kg) que deseas convertir"));
                
                dUnidadesStone = dUnidadesKg /6.35;
                
                JOptionPane.showMessageDialog(null, 
                        dUnidadesKg + " Kg equivale a: " 
                      + "\n " + dUnidadesStone + " Stone");
                                
            break;//case Stone
            
            case 9:
                
                dUnidadesKg = Double.parseDouble(JOptionPane.showInputDialog(
                "Ingresa la cantidad en Kilogramos(Kg) que deseas convertir"));
                
                dUnidadesLibra = dUnidadesKg * 2.205;
                
                JOptionPane.showMessageDialog(null, 
                        dUnidadesKg + " Kg equivale a: " 
                      + "\n " + dUnidadesLibra + " Libras");
                
            break; //case Libras
            
            case 10:
                
                dUnidadesKg = Double.parseDouble(JOptionPane.showInputDialog(
                "Ingresa la cantidad en Kilogramos(Kg) que deseas convertir"));
                
                dUnidadesOnza = dUnidadesKg * 35.274;
                
                JOptionPane.showMessageDialog(null, 
                        dUnidadesKg + " Kg equivale a: " 
                      + "\n " + dUnidadesOnza + " Libras");
                
            break;//case Onzas
                       
        }//fin switch-case
        
    }//fin public static void main
    
}//fin public class MenuConversionMasa
