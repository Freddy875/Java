/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechacorrecta;

import javax.swing.JOptionPane;

/**
 *
 * @author fer87
 */
public class FechaCorrecta {

    /**
     *Pedir el día, mes y anio de una fecha 
     * E indicar si la fecha es correcta.
     * 
     */
    public static void main(String[] args) {
        
        int iDia,iMes,iAnio;
        
        iDia = Integer.parseInt(
                JOptionPane.showInputDialog("Ingresa el día: "));
        
        iMes = Integer.parseInt(
                JOptionPane.showInputDialog("Ingresa el mes: "));
        
        iAnio = Integer.parseInt(
                JOptionPane.showInputDialog("Ingresa el año: "));
        
        if(iAnio > 0){
            
            switch(iMes){
                
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                   
                    if((iDia >= 1) && (iDia <= 31)){
                        
                        JOptionPane.showMessageDialog(null,"Fecha Correcta" +
                                 "\nLa fecha es: " + iDia  + "/"  +iMes + "/"
                                + iAnio);
                        
                    }else{
                        
                        JOptionPane.showMessageDialog(null, "Fecha Incorrecta"
                        +  "\nPara estos meses los días deben de estar"
                        +  "entre 1 a 31");
                        
                    }//fin if-else
                    
                break;
                
                /*
			Este caso es para los meses de
			Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre
			Que tiene 31 dias 
                */
		
                case 2:
                    
                    if(iAnio%4 == 0){
                        
                        
                        if((iDia >= 1) && (iDia<= 29)){
                            
                            JOptionPane.showMessageDialog(null,"Fecha Correcta "
                                + "\nEs año bisiesto"
                                + "\nLa fecha es: " + iDia  + "/"  +iMes + "/"
                                + iAnio);
                            
                        }else{
                            
                            JOptionPane.showMessageDialog(null, 
                                    "Como es año bisiesto los días deben de"
                                   + " estar entre 1 a 29");
                            
                        }//fin if-else
                        
                    }else{
                        
                        if((iDia >= 1) && (iDia <= 28)){
                            
                            JOptionPane.showMessageDialog(null,"Fecha Correcta "
                                + "\nNO Es año bisiesto"
                                + "\nLa fecha es: " + iDia  + "/"  +iMes + "/"
                                + iAnio);
                            
                        }else{
                        
                            JOptionPane.showMessageDialog(null, 
                                    "Fecha Incorrecta"
                                   + "Como NO es año bisiesto los días deben de"
                                   + " estar entre 1 a 28");
                        }//fin if-else
                       
                    }//fin if-else
                    
                break;
                /*
                Este caso es para el mes de Febrero 
		que dependiendo del anio puede tener
		entre 28 o 29 dias si es anio bisiesto
		*/
		
                case 4:
                case 6:
                case 9:
                case 11:
                
                    if((iDia >= 1) && (iDia <= 30)){
                        
                       JOptionPane.showMessageDialog(null,"Fecha Correcta" +
                                 "\nLa fecha es: " + iDia  + "/"  +iMes + "/"
                                + iAnio);
                        
                    }else{
                        
                       JOptionPane.showMessageDialog(null, "Fecha Incorrecta"
                        +  "\nPara estos meses los días deben de estar"
                        +  "entre 1 a 30");
                         
                        
                    }//fin if-else
                    
                break;
                
                /*
		Este caso es para los meses de 
		Abril, Junio, Septiembre, Noviembre
		Que tiene 30 dias 
		*/
	
                default:
                    
                   JOptionPane.showMessageDialog(null,
                           "El mes debe de estar entre 1 al 12",
                           "Fecha Incorrecta",
                           JOptionPane.ERROR_MESSAGE
                   );
            }//fin switch
            
        }else{
            
            JOptionPane.showMessageDialog(null, "El año debe de ser mayor que "
                    + "cero",
                    "Fecha Incorrecta",
                    JOptionPane.ERROR_MESSAGE);
            
        }//fin if-else
        
        
        
    }//fin public static void main
    
}//fin public class FechaCorrecta
