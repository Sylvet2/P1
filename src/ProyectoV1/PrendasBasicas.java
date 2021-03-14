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
    
    
    private double descuentoCantidad;
    
    
    public PrendasBasicas( ArrayList <Prenda> vendedores) {
        
        this.nombre = "Prendas Basicas";
        this.listaDePrendas = vendedores;
    }
    
    
    public void calcularPago(){
        
    }
    
    
}
