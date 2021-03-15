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
public class Usuario{
    
  //  public abstract double calcularPago();
    
   // private String genero;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private long telefono;
    private String cedula;
    
    List <TipoPrenda> tipoPrenda = new ArrayList<>();

    public Usuario( String nombre, String apellido, String direccion, String correo, long telefono, String cedula) {
       
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.cedula = cedula;
    }
    public void agregarTipoPrenda (TempInvierno v ) {
        tipoPrenda.add (v);
    }
    
    public void agregarTipoPrenda (TempVerano v ) {
        tipoPrenda.add (v);
    }
    public void agregarTipoPrenda (PrendasBasicas v ) {
        tipoPrenda.add (v);
    }
    

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + ", cedula=" + cedula + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
    
}
