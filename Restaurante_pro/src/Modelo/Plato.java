/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Laboratorio
 */
public final class Plato {

    public String nombre;
    public double precio;
    public int cantidad;
    public Plato link = null;

    public Plato(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    
    
}
