/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedioedadesyestaturas;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class PromedioEdadesYEstaturas {

    /**
     * Dadas las edades y alturas de 5 alumnos 
     * Mostrar la media de la edad y de las estaturas, 
     * mostrar la cantidad de alumnos mayores de 18 años 
     * y mostrar la cantidad de alumnos que miden más de 1.75
     * 
     */
    public static void main(String[] args) {
        
        int iEdad,
            iSumaEdad = 0, 
            iConteoEdad = 0,
            iConteoAltura = 0,
            iConteoMayor18 = 0,
            iConteoMayor175 = 0; 
        
        float fAltura,
              fSumaAltura = 0,
              fMediaEdad = 0,
              fMediaAltura =0;
        
        //Primero validamos y pedimos las edades
        
        for(int iContador1 = 1; iContador1 <= 5; iContador1++ ){
            
            iEdad = Integer.parseInt(JOptionPane.showInputDialog( 
                "Este programa te dice la media de la edad de 5 alumnos"
               + "\nIngresa la edad del alumno: " + iContador1));
            
            if(iEdad <= 0 ){ 
            
            /*
            Validamos que las edades y alturas no sean negativos
            Ni que sean cero    
             
                 JOptionPane.showMessageDialog(null,
                           "No se puede tener edades ni alturas negativas"
                          + "\nO iguales a cero",
                           "ERROR",
                           JOptionPane.ERROR_MESSAGE
                   );
            */
            
            }else{
                
                iConteoEdad++;
                /*
                Si el usuario ingresa opciones no validas 
                entonces obtenemos la media solo 
                con las opciones validas
                */
                
                iSumaEdad+=iEdad;//Sumamos iterativamente las edades
                
                
            }//fin if-else
            
            if(iEdad >= 18){//Validamos las edades que sean mayores a 18
                
                iConteoMayor18++;
                
            }//fin if-else
            
            fMediaEdad = (float)iSumaEdad/iConteoEdad;
        
                                    
        }//fin for
        //Aqui terminamos las operaciones con las edades
        
        //Ahora validamos y pedimos las alturas
        
        for(int iContador2 = 1; iContador2 <= 5; iContador2++ ){
            
            fAltura = Float.parseFloat(JOptionPane.showInputDialog(
                "También te dice la media de la altura de 5 alumnos"
               + "\nIngresa la altura del alumno: " + iContador2));
            
            if(fAltura <= 0){ 
            
            /*
            Validamos que las edades y alturas no sean negativos
            Ni que sean cero    
             
                 JOptionPane.showMessageDialog(null,
                           "No se puede tener edades ni alturas negativas"
                          + "\nO iguales a cero",
                           "ERROR",
                           JOptionPane.ERROR_MESSAGE
                   );
            */
            
            }else{
                
                iConteoAltura++;
                /*
                Si el usuario ingresa opciones no validas 
                entonces obtenemos la media solo 
                con las opciones validas
                */
                
                
                fSumaAltura+=fAltura;//Sumamos iterativamente las alturas
                
            }//fin if-else
            
            if(fAltura >= 1.75){//Validamos si la altura es mayor a 1.75
                
                iConteoMayor175++;
                
            }//fin if-else
            
            fMediaAltura = (float)fSumaAltura/iConteoAltura;
                                    
        }//fin for
        
        //Aqui terminamos las operaciones con las Alturas
        
        //Ahora mostramos los resultados finales
        
        if(iConteoEdad == 0 && iConteoAltura == 0){
            
            JOptionPane.showMessageDialog(null,
                           "No se puede obtener el promedio de las edades"
                         + "\nNi de las alturas porque todos los valores son "
                         + "\nNegativos O iguales a cero",
                           "ERROR",
                           JOptionPane.ERROR_MESSAGE
                   );
            
        }else{
            
            JOptionPane.showMessageDialog(null, 
                    "Ingresaste " + iConteoEdad + "  edades validas"
                  + "\nE Ingresate " + iConteoAltura + "  alturas validas"
                  + "\nPor lo tanto el promedio de edades es: " 
                  + fMediaEdad
                  + "\nY el promedio de alturas es: " + fMediaAltura
                  + "\nTienes " + iConteoMayor18 + " alumnos con edades mayores"
                  + " o iguales a 18 "
                  + "\nY tines " + iConteoMayor175 + " alumnos con alturas "
                  + "mayores o iguales 1.75 metros");
            
        }//fin if-else 
        
        
        
/*
        
        Esta fue la primera versión de nuestro porgrama 
        intentamos pedir los dos resultados al mismo tiempo 
        pero eso parece poco efectivo 
        
        int iEdad,
            iSumaEdad = 0, 
            iConteoEdad = 0,
            iConteoAltura = 0,
            iConteoMayor18 = 0,
            iConteoMayor175 = 0; 
        
        float fAltura,
              fSumaAltura = 0,
              fMediaEdad = 0,
              fMediaAltura =0;
        
        for(int iContador = 1; iContador <= 5; iContador++ ){
            
            iEdad = Integer.parseInt(JOptionPane.showInputDialog( 
                "Este programa te dice la media de la edad de 5 alumnos"
               + "\nIngresa la edad del alumno: " + iContador));
            
            fAltura = Float.parseFloat(JOptionPane.showInputDialog(
                "También te dice la media de la altura de 5 alumnos"
               + "\nIngresa la altura del alumno: " + iContador));
            
            if(iEdad <= 0 && fAltura <= 0){ 
            
            /*
            Validamos que las edades y alturas no sean negativos
            Ni que sean cero    
             
                 JOptionPane.showMessageDialog(null,
                           "No se puede tener edades ni alturas negativas"
                          + "\nO iguales a cero",
                           "ERROR",
                           JOptionPane.ERROR_MESSAGE
                   );
            
            
            }else{
                
                iConteoEdad++;
                /*
                Si el usuario ingresa opciones no validas 
                entonces obtenemos la media solo 
                con las opciones validas
                
                
                iSumaEdad+=iEdad;//Sumamos iterativamente las edades
                
                iConteoAltura++;
                /*
                Si el usuario ingresa opciones no validas 
                entonces obtenemos la media solo 
                con las opciones validas
                
                
                
                fSumaAltura+=fAltura;//Sumamos iterativamente las alturas
                
            }//fin if-else
            
            if(iEdad >= 18){//Validamos si la edad es mayor a 18
                
                iConteoMayor18++;
                
            }//fin if-else
            
            if(fAltura >= 1.75){//Validamos si la altura es mayor a 1.75
                
                iConteoMayor175++;
                
            }//fin if-else
            
            
            fMediaEdad = (float)iSumaEdad/iConteoEdad;
        
            fMediaAltura = (float)fSumaAltura/iConteoAltura;
                                    
        }//fin for
        
        
        
        if(iConteoEdad == 0 && iConteoAltura == 0){
            
            JOptionPane.showMessageDialog(null,
                           "No se puede obtener el promedio de las edades"
                         + "\nNi de las alturas porque todos los valores son "
                         + "\nNegativos O iguales a cero",
                           "ERROR",
                           JOptionPane.ERROR_MESSAGE
                   );
            
        }else{
            
            JOptionPane.showMessageDialog(null, 
                    "Ingresaste " + iConteoEdad + "  edades validas"
                  + "\nE Ingresate " + iConteoAltura + "  alturas validas"
                  + "\nPor lo tanto el promedio de edades es: " 
                  + fMediaEdad
                  + "\nY el promedio de alturas es: " + fMediaAltura
                  + "\nTienes " + iConteoMayor18 + " alumnos con edades mayores"
                  + " o iguales a 18 "
                  + "\nY tines " + iConteoMayor175 + " alumnos con alturas "
                  + "mayores o iguales 1.75 metros");
            
        } 
           

*/

    }//fin public static void main
    
}//fin public class PromedioEdadesYEstaturas
