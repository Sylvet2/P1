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
public class PrendasBasicas extends TipoPrenda  {
    
    
    private double descuentoCantidad;
    
    
    public PrendasBasicas( String nombre, String apellido, String direccion, String correo, String telefono, String cedula) {
        
        this.nombre = "Prendas Basicas";
        
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.cedula = cedula;
    }
    
    @Override
    public void calcularPago(){
        
    }
    
    
}
