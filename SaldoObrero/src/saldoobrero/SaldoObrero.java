/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldoobrero;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class SaldoObrero {

    /**
     * Un obrero necesita calcular su salario semanal
     * Si trabaja 40 horas o menos, entonces se le paga $16 la hora 
     * Si trabaja más de 40 horas se le paga $16 por cada una de las
     * primeras 40 horas y $20 por cada hora extra.
     */
    public static void main(String[] args) {
        
        int iHoras;
        float fSalarioFinal;

        iHoras = Integer.parseInt(JOptionPane.showInputDialog(
                "¿Cuántas horas a la semana trabajo el obrero ?"));
        
        if(iHoras <= 40){
            
            fSalarioFinal = (float)(iHoras * 16);
            
            JOptionPane.showMessageDialog(null, 
                    "El salario del obrero es de: $" + fSalarioFinal);
            
        }else{
            
            fSalarioFinal = (float)((iHoras - 40)*20) + (40*16);
            
            JOptionPane.showMessageDialog(null, 
                    "El salario del obrero es de: $" + fSalarioFinal);
            
        }//fin if-else
        
        
    }//fin piblic static void main
    
}//finn public class SaldoObrero
