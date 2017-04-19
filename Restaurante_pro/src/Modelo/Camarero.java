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
public class Camarero {
    public String nombre;
    public int venta;
    public Camarero link;
    

    public Camarero(String nombre, int venta) {
        this.nombre = nombre;
        this.venta = venta;
        this.link = null;
    }
    
    public Camarero add(Camarero ptr, String c){
        if (ptr == null) {
            Camarero camarero = new Camarero(c, 1);
            ptr = camarero;
        }else{
            Camarero p = ptr;
            while((p.link != null) && !(p.nombre.equals(c))){
                p = p.link;
            }
            if (!p.nombre.equals(c)) {
                Camarero camarero = new Camarero(c, 1);
                p.link = camarero;
            }else{
                p.venta = p.venta + 1;
            }            
        }
        return ptr;
    }
}
