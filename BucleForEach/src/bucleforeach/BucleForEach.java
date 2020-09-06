/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucleforeach;

/**
 *
 * @author Freddy875
 */
public class BucleForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] sNombres1 = {"Alejandro","Maria","Luisa","Juan","Narcisa","Luis"};

        System.out.println("\nArreglo 1\n");

        //i es un contador
        for(int i = 0; i < 6; i++){

            System.out.println(sNombres1[i]);
        
        }//fin for

        System.out.println("\nArreglo 2\n");

        String[] sNombres2 = {"Alejandro","Maria","Luisa","Juan","Narcisa","Luis"
                            ,"Roberto","Flor","Jessica"};

        //j es un contador
        for(int j = 0; j<sNombres2.length; j++){

            System.out.println(sNombres2[j]);

        }//fin for

        String[] sNombres3 = {"Alejandro","Maria","Luisa","Juan","Narcisa","Luis"
                            ,"Roberto","Flor","Jessica"};

        System.out.println("\nArreglo 3\n");

        //k es cun contador
        for(String k:sNombres3){

            System.out.println(k);

        }//fin for

        String[] sNombres4 = {"Alejandro","Maria","Luisa","Juan","Narcisa","Luis"
        ,"Roberto","Flor","Jessica"};

        System.out.println("\nArreglo 4\n");

        //l es un contador
        for(String l:sNombres4){

            System.out.println("Nombres: " + l);

        }//fin for

        

    }//fin public static void main
    
}//fin public class BucleForEach
