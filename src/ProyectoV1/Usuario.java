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
public class Usuario{
    
  //  public abstract double calcularPago();
    
   // private String genero;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private String telefono;
    private String cedula;

    public Usuario( String nombre, String apellido, String direccion, String correo, String telefono, String cedula) {
       
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + ", cedula=" + cedula + '}';
    }
    
    
    
}
