/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Mesa {
    public String codigo;
    public Camarero camarero;
    public Pedido venta;
    public double total;
    public Mesa link;

    public Mesa(String codigo, Camarero camarero, Pedido venta) {
        this.codigo = codigo;
        this.camarero = camarero;
        this.venta = venta;
        this.total = 0;
        this.link = null;
    }
    
  
    
}
