/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroautomatico;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class CajeroAutomatico {

    /**
     * Hacer un programa que simule un cajero automático 
     * con un saldo inicial de 1000 dolares,
     * con el siguiente menú de opciones 
     * 
     * 1. Ingresar dinero a la cuenta
     * 2. Retirar dinero de la cuenta
     * 3. Salir 
     */
    public static void main(String[] args) {
        
        final float fSaldoInicial = 1000.00f;
        
        float fDeposito, fRetiro, fSaldoActual;
        
        int iOpcion;
        
        iOpcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Bienvenido al cajero automático"
              + "\n¿Que deseas hacer ? "
              + "\n1. Depositar dinero a la cuenta"
              + "\n2. Retirar dinero de la cuenta"
              + "\n3. Salir"));
        
        switch(iOpcion){
            
            case 1:
                
               fDeposito = Float.parseFloat(JOptionPane.showInputDialog(
                       "Ingresa la cantidad de dinero que deseas depositar"
                        + " a tu cuenta"));
               
               fSaldoActual = fSaldoInicial + fDeposito;
               
               JOptionPane.showMessageDialog(null, "Actualmente cuentas con: $"
               + fSaldoActual  + " en tu cuenta");
                
            break;
            //fin del case 1 Depositar dinero
            
            case 2:
                
                fRetiro = Float.parseFloat(JOptionPane.showInputDialog(
                        "Ingresa la cantidad de dinero que deseas retirar"
                        + "de tu cuenta"));
                
                if(fRetiro > fSaldoInicial){
                   
                    JOptionPane.showMessageDialog(null, 
                    "No cuentas con el saldo suficiente para retirar esa"
                    + " cantidad "
                    /*
                    "Actulamente cuentas con: $ "
                    + fSaldoInicial
                    */
                    , "Saldos Insuficiente"
                    ,JOptionPane.ERROR_MESSAGE
                    );
                    
                }else{
                    
                    fSaldoActual = fSaldoInicial - fRetiro;
                    
                    JOptionPane.showMessageDialog(null, 
                    "Operacion exitosa"
                    + "\nActualmente cuentas con: $ "
                    + fSaldoActual
                    );
                    
                }//fin if-else
                
            break;
            //fin del case 2 Retirar dinero
            
            case 3:
                
                JOptionPane.showMessageDialog(null, 
                        "Gracias vuelva pronto");
                
            break;
            
            default:
                
                JOptionPane.showMessageDialog(null,
                    "Opcion NO Valida"
                    ,"Opcion NO Valida"
                    ,JOptionPane.ERROR_MESSAGE);
            
        }//fin switch case
        
    }//fin public static void main
    
}//fin public class CajeroAutomatico
