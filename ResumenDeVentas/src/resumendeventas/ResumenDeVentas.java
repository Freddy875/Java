/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumendeventas;

import javax.swing.JOptionPane;

/**
 *
 * @author Freddy875
 */
public class ResumenDeVentas {

    /**
     * Una empresa que se dedica a la venta de desinfectantes requiere gestionar
     * las facturas. En cada factura figura el codigo del articulo 
     * La cantidad vendida en litros y el precio por litro 
     * Se pide de 5 facturas introducidas: Facturacion Total, Canditad de litro 
     * vendidos del articulo y cuantas facturas se emitieron de más de $600
     */
    public static void main(String[] args) {
        
        int iCodigo,
            iLitros,
            iConteoMas600 = 0,
            iLitroArticulo1 = 0;
        float fPrecioLitros,
              fImporteFactura,
              fFacturaTotal = 0;
        
        for(int iContador = 1; iContador <= 5; iContador++){
            
            iCodigo = Integer.parseInt(JOptionPane.showInputDialog(
                "Articulo N° " + iContador
                + "\nIngresa el codigo: "));
            
            iLitros = Integer.parseInt(JOptionPane.showInputDialog(
                "Articulo N° " + iContador
                + "\nIngresa la cantidad en litros: "));
            
            fPrecioLitros = Float.parseFloat(JOptionPane.showInputDialog(
                "Articulo N° " + iContador
                + "\nIngresa el precio por litros: "));
            
            fImporteFactura = (float) iLitros * fPrecioLitros; 
            //Importe Factura
            
            fFacturaTotal += fImporteFactura; 
            //Suma iterativa de las facturas
            
            if(iCodigo == 1){
                
                iLitroArticulo1 += iLitros;
                
            }//fin if
            
            if(fImporteFactura > 600 ){
                
                iConteoMas600++;
                
            }//fin if
            
            
            
        }//fin for
        
        JOptionPane.showMessageDialog(null, 
                    "Resumen de ventas "
                  + "\nFacturación Total: " + fFacturaTotal
                  + "\nCantidad en litros vendidos del articulo 1"
                  + iLitroArticulo1 
                  + "\nCantidad de facturas mayores a $600: " + iConteoMas600);
            
        
        
    }//fin public static void mian
    
}//fin public class ResumenDeVentas
