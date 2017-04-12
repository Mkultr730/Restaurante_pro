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

    private int cod;
    private String nombre;
    private double precio;
    private int cantidad;
    private String mesa;
    private Plato link;

    public Plato(int cod, String nombre, double precio, int cantidad, String mesa) {
        setCod(cod);
        setNombre(nombre);
        setPrecio(precio);
        setCantidad(cantidad);
        setMesa(mesa); 
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public Plato getLink() {
        return link;
    }

    public void setLink(Plato link) {
        this.link = link;
    }
    
}
