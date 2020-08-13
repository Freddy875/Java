/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaifelse;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class SentenciaIfElse {

    /**
     * Ka sentencia if else:
     * 
     * if(condicion){
     * 
     *  Instruccion1;
     * 
     * }else{
     * 
     *  Instruccion2;
     * 
     * }
     * 
     */
    
    /*
    == : Igual a 
    != : Diferente de
    >  : Mayor que 
    <  : Menor que 
    >= : Mayor que o igual a:
    <= : Menor que o igual a: 
    */
    public static void main(String[] args) {
        
        int iNumero, iDato = 5;
                
        iNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa "
                + "un número"));
        
        if(iNumero == iDato){
            
            JOptionPane.showMessageDialog(null, "Tu número es " + iDato);
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Tu numero es diferente de " 
                    + iDato);
            
        }//fin if-esle
        
        int iNumero2, iDato2 = 8;
        
        iNumero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro"
                + " número" ));
        
        if(iNumero2 != iDato2){
            
            JOptionPane.showMessageDialog(null, "Tu número es diferente de " 
                    + iDato2);
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Tu número es " + iDato2);
            
        }//fin fi-esle
        
              
        int iNumero3, iDato3 = 7;
       
        iNumero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro"
                + " número"));
        
        if(iNumero3 > iDato3){
            
            JOptionPane.showMessageDialog(null, "Tu número " + iNumero3 
                
                    + " es mayor que " + iDato3);
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Tu número " + iNumero3
                
                    + " es menor que " + iDato3);
            
        }//fin if-else
        
        int iNumero4, iDato4 = 2;
        
        iNumero4 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro" 
         +  " número"));
        
        if(iNumero4 <= iDato4){
            
            JOptionPane.showMessageDialog(null, "Tu número " + iNumero4
             
                    + " es menor que o igual a " + iDato4);
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Tu número " + iNumero4
             
                    + " es mayor que  " + iDato4);
            
        }//fin if-else
        
    }//fin public static void main
    
}//fin public class SentenciaIfElse
