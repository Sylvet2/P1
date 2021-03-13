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
    
    
    //ArrayList <Hombre> prendaHombres = new ArrayList<>();
    //ArrayList <Mujer> prendasMujeres = new ArrayList<>();      

    @Override
    public String toString() {
        return "Prenda{" + "nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", talla=" + talla + ", color=" + color + '}';
    }
 
}
