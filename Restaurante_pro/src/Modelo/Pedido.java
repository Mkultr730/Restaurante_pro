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
    public boolean entregado;
    public int hora;
    public int minuto;
    public int segundo;
    public Pedido link;

    public Pedido(String mesa, Plato plato, int hora, int minuto, int segundo) {
        this.mesa = mesa;
        this.plato = plato;
        this.estado = false;
        this.estado = false;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.link = null;    
    }
    
}
