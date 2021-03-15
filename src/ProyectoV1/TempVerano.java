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
public class TempVerano extends TipoPrenda{
    
       
    public TempVerano(  ArrayList <Prenda> lista) {
        
        this.nombre = "Temporada Verano";
        this.listaDePrendas = lista;
        
    }

    @Override
    public void calcularSubPago() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}

    

