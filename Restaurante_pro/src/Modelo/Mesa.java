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
    public int codigo;
    public Camarero camarero;
    public int venta;

    public Mesa(int codigo, Camarero camarero, int venta) {
        this.codigo = codigo;
        this.camarero = camarero;
        this.venta = venta;
    }
    
}
