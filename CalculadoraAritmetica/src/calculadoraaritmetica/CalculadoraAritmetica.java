/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraaritmetica;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class CalculadoraAritmetica {

    /**
     * Simular el funcionamiento de una calculadora 
     * que pueda realizar las 4 operaciones aritmeticas
     * basicas (suma,resta,multiplicación,división)
     * con valores númericos enteros.
     * El usuario especifica la operación con 
     * la primera letra de la operación
     * S o s para suma
     * R o r para resta
     * P, p , M o m para producto
     * Y D o d para división
     */
    public static void main(String[] args) {
        
        int iNumero1,iNumero2,iSuma,iResta,iMult;
        
        float fDiv;
        
        char cOperaciones;
        
        iNumero1 = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa el primer número: "));
        
        iNumero2 = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingresa el segundo número: "));
        
        cOperaciones = JOptionPane.showInputDialog(
                "Digite la operación que deseas realizar"
                        + "\nS o s para Suma"
                        + "\nR o r para Resta"
                        + "\nP, p, M o m para Producto o Multiplicación"
                        + "\nD o d para División").charAt(0);
        
        switch(cOperaciones){
            
            case 's':
            case 'S':
                
                iSuma = iNumero1 + iNumero2;
                
                JOptionPane.showMessageDialog(null, "El resultado de sumar: "
                + iNumero1 + " + " + iNumero2 + " = " + iSuma);
                
            break; //fin del caso Suma
            
            case 'r':
            case 'R':
                
                iResta = iNumero1 - iNumero2;
                
                JOptionPane.showMessageDialog(null, "El resultado de restar: "
                + iNumero1 + " - " + iNumero2 + " = " + iResta);
                
            break; //fin del caso Resta
            
            case 'p':
            case 'P':
            case 'm':
            case 'M':
                
                iMult = iNumero1 * iNumero2;
                
                JOptionPane.showMessageDialog(null, "El resultado de sumar: "
                + iNumero1 + " x " + iNumero2 + " = " + iMult);
                
            break; //fin del caso Producto o Multiplicación 
            
            case 'd':
            case 'D':
                
                if(iNumero2 == 0){
                    
                    JOptionPane.showMessageDialog(null, "La división entre cero"
                            + " NO esta definida",
                            "Division entre cero",
                            JOptionPane.ERROR_MESSAGE);
                    
                }else{
                    
                    fDiv = (float)(iNumero1 / iNumero2);
                
                    JOptionPane.showMessageDialog(null, "El rdesultado de sumar: "
                    + iNumero1 + " / " + iNumero2 + " = " + fDiv);
                
                }//fin if-else
                
            break; //fin del caso División 
            
            default:
                
                 JOptionPane.showMessageDialog(null,
                           "Opción NO Valida",
                           "ERROR",
                           JOptionPane.ERROR_MESSAGE
                   );
                
            
        }//fin swich-case
        
        
    }//fin public static void main
    
}//fin public class CalculadoraAritmetica
