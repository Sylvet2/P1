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
    
    private double descuentoTemporada;
    
    public TempVerano(  ArrayList <Prenda> lista) {
        
        this.nombre = "Temporada Verano";
        this.listaDePrendas = lista;
        
    }
    
    
    @Override
    public void calcularPago(int indice) {
        
        
        pago = listaDePrendas.get(indice).getCantidad() * listaDePrendas.get(indice).getPrecio()*descuentoTemporada;
    }
}

    

