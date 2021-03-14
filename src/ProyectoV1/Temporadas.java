/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoV1;

/**
 *
 * @author USUARIO
 */
public abstract class Temporadas {
    private String nombre;
    private double descuentoTemporada;
  //  private double descuentoCantidad;
    //metodo
     protected double pago;
    public abstract void calcularPago();
}
