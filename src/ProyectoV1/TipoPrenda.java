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
 * @author USUARIO
 */
public abstract class TipoPrenda {
    
    protected String nombre;
    //implementar la relacion de composición con Vendedor
    List <Prenda> listaDePrendas = new ArrayList <> ();
   // private double descuentoTemporada;
    //private double descuentoCantidad;
    //metodo
    protected double pago;
    
     public void addPrenda(Prenda p){
        listaDePrendas.add(p);
    
     }
     
    public abstract void calcularPago();
    

}
