/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoV1;

/**
 *
 * @author Richard
 */
public abstract class Mujer extends Tienda {
    
    @Override
    public double calcularPago(){
    return 0.0;
    }
    
    public abstract double descuentoNumPrendas();
    public abstract double descuenoPorTemporadas();
    
   
    
}
