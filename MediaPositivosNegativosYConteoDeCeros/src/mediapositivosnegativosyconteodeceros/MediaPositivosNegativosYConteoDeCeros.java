/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediapositivosnegativosyconteodeceros;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class MediaPositivosNegativosYConteoDeCeros {

    /**
     * Pedir 10 números     
     * Mostrar la media de los números positivos,
     * la media de los números negativos 
     * Y la cantidad de 0
     */
    public static void main(String[] args) {
        
        int iNumero1,
            iSumaPositivos = 0,
            iSumaNegativos = 0,
            iConteoPositivos = 0,
            iConteoNegativos = 0,
            iConteoCeros = 0;
        
        float fMediaPositivos ,
              fMediaNegativos ;
        
        for(int iContador=1; iContador<= 10; iContador++){
            
            iNumero1 = Integer.parseInt(JOptionPane.showInputDialog( 
                    "Este programa te dice la media de 10 números"
                  + "\nIngresa el número: " + iContador));
            
            if(iNumero1 == 0){ //Validamos si el número es cero
                
                iConteoCeros++;//Aumentamos en 1 el conteo de ceros
                
            }else if(iNumero1 > 0){//Validamos si el número es positivo
                
                iSumaPositivos += iNumero1;//Suma iterativa de positivos
                
                iConteoPositivos++; 
                
            }else{ //Validamos si el número es negativo
                
                iSumaNegativos += iNumero1;
                
                iConteoNegativos++;
            
            }//fin if-else
            
        }//fin for
        
        //Hacemos las operaciones con los números positivos 
        
        if(iConteoPositivos == 0){
            
            JOptionPane.showMessageDialog(null,
                           "No se puede sacar la media de los positivos",
                           "ERROR",
                           JOptionPane.ERROR_MESSAGE
                   );
            
            //System.out.println("No se puede sacar la media de los positivos");
            
        }else{
            
            fMediaPositivos = (float) iSumaPositivos/iConteoPositivos;
            
            /*
            System.out.println("La media de los números positivos es: " 
            + fMediaPositivos );
            */
                        
            JOptionPane.showMessageDialog(null, 
                    "La media de los números positivos es: " 
            + fMediaPositivos);
            
        }//fin if-else
        
        //Ahora hacemos las operaciones con los números negativos
        
        if(iConteoNegativos == 0){
            
             JOptionPane.showMessageDialog(null,
                           "No se puede sacar la media de los negativos",
                           "ERROR",
                           JOptionPane.ERROR_MESSAGE
                   );
            
            //System.out.println("No se puede sacar la media de los negativos");
            
        }else{
            
            fMediaNegativos = (float) iSumaNegativos/iConteoNegativos;
             
            /*
            System.out.println("La media de los números positivos es: " 
            + fMediaNegativos );
            */
            
            JOptionPane.showMessageDialog(null, 
                    "La media de los números negativos es: " 
            + fMediaNegativos);
            
            
        }//fin if-else
        
    }//fin public static void main
    
}//fin public class MediPositivosNegativosYConteoDeCeros
