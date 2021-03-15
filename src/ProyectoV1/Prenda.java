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
public class Prenda {
    
    private String nombre;
    private double precio;
    private int cantidad;
    private char talla;
    private String color;
    
     
    public Prenda (String nombre, double precio, int cantidad, char talla, String color){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.talla = talla;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public char getTalla() {
        return talla;
    }

    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTalla(char talla) {
        this.talla = talla;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //ArrayList <Hombre> prendaHombres = new ArrayList<>();
    //ArrayList <Mujer> prendasMujeres = new ArrayList<>();      

    @Override
    public String toString() {
        return "Prenda{" + "nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", talla=" + talla + ", color=" + color + '}';
    }

  
 
}
