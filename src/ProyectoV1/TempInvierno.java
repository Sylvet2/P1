/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoV1;

import java.util.ArrayList;

/**
 *
 * @author Richard
 */
public class TempInvierno extends TipoPrenda  {
    
    
    
    public TempInvierno( ArrayList <Prenda> lista) {
        
        this.nombre = "Temporada Invierno";
        this.listaDePrendas = lista;
    }
    
    
    public void calcularPago() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
 
}
