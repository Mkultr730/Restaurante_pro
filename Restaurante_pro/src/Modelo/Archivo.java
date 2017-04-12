/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author Laboratorio
 */
public class Archivo {

    public String nombre;
    public double precio;
    public String tipo;
    public int venta;
    public Archivo link;

    public Archivo(String nombre, double precio, String tipo, int venta) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.venta = venta;
    }

    public int Prueba(int n) {
        n = n + 1;
        return n;
    }

    public Archivo ReadFile(Archivo ptrF) throws FileNotFoundException, IOException {
        File archivo = new File("Menu.txt");
        FileReader fr = new FileReader(archivo);
        try (BufferedReader br = new BufferedReader(fr)) {
            String c;
            while ((c = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(c, ",");
                String name = st.nextElement().toString();
                double prec = Double.parseDouble(st.nextElement().toString());
                String tipo = st.nextElement().toString();
                int vent = Integer.parseInt(st.nextElement().toString());
                Archivo u = new Archivo(name, prec, tipo, vent);
                if (ptrF == null) {
                    ptrF = u;
                } else {
                    Archivo p = ptrF;
                    while (p.link != null) {
                        p = p.link;
                    }
                    p.link = u;
                }
            }
            return ptrF;
        }
    }
    public Archivo UpdateList(Archivo ptrF, Pedido ptr){
        Archivo q = ptrF;
        while(q != null){
            Plato p = ptr.plato;
            while(p != null){
                if (p.getNombre().equals(q.nombre)) {
                    q.venta = q.venta + p.getCantidad();
                }
                p = p.getLink();
            }
            q = q.link;
        }
        return ptrF;
    }
    
    public boolean Inventario(String pro, int cant, int p) throws FileNotFoundException, IOException{
        int sw = 0;
        File inventario = new File("Inventario.txt");
        FileReader fr = new FileReader(inventario);
        BufferedReader br = new BufferedReader(fr);
        String c;
        while((c = br.readLine()) != null && sw ==0){
            StringTokenizer st = new StringTokenizer(c, ",");
            String nombre = st.nextElement().toString();
            int ca = Integer.parseInt(st.nextElement().toString());
            if (nombre.equals(pro)) {
                sw = 1;
                if ((cant*p)>ca) {
                    return true;
                }
            }
        }
        return false;
    }
}
