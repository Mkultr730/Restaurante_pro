/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Laboratorio
 */
public class Pedido {
    public String mesa;
    public Plato plato;
    public boolean estado;
    public Date hora;
    public Pedido link;

    public Pedido(String mesa, Plato plato) {
        this.mesa = mesa;
        this.plato = plato;
        this.estado = false;
        this.link = null;
    }
    
}
