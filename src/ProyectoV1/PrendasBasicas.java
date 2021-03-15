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
    
    /*public void calcularDescuento(int indice){
        if(this.listaDePrendas.get(indice).getCantidad() == 4) {
            descuentoCantidad = 0.1;
        }
        if(this.listaDePrendas.get(indice).getCantidad() == 8) {
            descuentoCantidad = 0.25;
        }
    }*/
    

    
    public void calcularDescuento() {
        
        if(this.listaDePrendas.size() == 10) {
            descuentoCantidad = 0.1;
        }
        if(this.listaDePrendas.size() == 15) {
            descuentoCantidad = 0.20;
        }
        
        
    }

    
    public void calcularSubPago() {
        for (int i = 0; i <= listaDePrendas.size()-1; ++i) {
        subPago = subPago + this.listaDePrendas.get(i).getPago();
        }
        
    }
    
    
    
    
    
    
    
    
    
    
}
