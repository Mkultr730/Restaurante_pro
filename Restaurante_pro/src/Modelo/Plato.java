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
public class Plato {

    public int cod;
    public String nombre;
    public double precio;
    public int cantidad;
    public String mesa;
    public Plato link;

    public Plato(int cod, String nombre, double precio, int cantidad, String mesa) {
        this.cod = cod;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.mesa = mesa;
        this.link = null;

    }
}
