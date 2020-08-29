/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pareseimapres;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class ParesEImapres {

    /**
     * Leer números hasta que el usuario introduzca un 0 
     * Por cada número ingresado indicar si es par o impar
     */
    public static void main(String[] args) {
        
        int iNumero1;
        
        do{
        
        iNumero1 = Integer.parseInt(JOptionPane.showInputDialog( 
                "Este programa te dice si el número que ingresaste es"
              + " Par o Impar "
              + "\nEste proceso se repite hasta que ingreses 0"
              + "\nIngresa un número cualquiera: "));
        
            if(iNumero1 == 0){
                
                JOptionPane.showMessageDialog(null,
                        "Tu número: " + iNumero1 + " es cero");
                                        
            }else if(iNumero1%2 == 0){
            
                JOptionPane.showMessageDialog(null,
                    "Tu número: " + iNumero1 + " es par");
                                            
            }else{
                
                JOptionPane.showMessageDialog(null,
                        "Tu número: " + iNumero1 + " es impar");
                
            }//fin if-else
        
        }while(iNumero1 != 0);
        
    }//fin pbulic static void main
    
}//fin public class ParesEImapres
