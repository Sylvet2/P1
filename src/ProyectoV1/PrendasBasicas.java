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
public class PrendasBasicas extends TipoPrenda  {
    
    
    private double descuentoCantidad = 0;
    
    
    public PrendasBasicas( ArrayList <Prenda> lista) {
        
        this.nombre = "Prendas Basicas";
        this.listaDePrendas = lista;
    }
    
  
    

    
    public void calcularDescuento() {
        
        if(this.listaDePrendas.size() == 10) {
            descuentoCantidad = 0.1;
        }
        if(this.listaDePrendas.size() == 15) {
            descuentoCantidad = 0.20;
        }
        
        
    }

    @Override
    public void calcularSubPago() {
        for (int i = 0; i <= listaDePrendas.size()-1; ++i) {
        subTotal = subTotal+ this.listaDePrendas.get(i).getPago();
        }
        subTotal =subTotal*descuentoCantidad;
        
    }

   
        
    
    
}
