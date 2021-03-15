/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoV1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Richard
 */
public class TempInvierno extends TipoPrenda  {
    
    private double descuentoTemporada = 0.10;
    
    public TempInvierno( List <Prenda> lista) {
        
        this.nombre = "Temporada Invierno";
        this.listaDePrendas = lista;
    }
    
    
    @Override
    public void calcularPago(int indice) {
        pago = listaDePrendas.get(indice).getCantidad() * listaDePrendas.get(indice).getPrecio()*descuentoTemporada;
    }
    
    
    
 
}
