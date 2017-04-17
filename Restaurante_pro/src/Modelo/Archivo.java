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
    public String receta;
    public Archivo link;

    public Archivo(String nombre, double precio, String tipo, int venta, String receta) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.venta = venta;
        this.receta = receta;
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
                String receta = "";
                while(st.hasMoreElements()){
                    receta +=st.nextElement().toString() + "," ;
                }
                Archivo u = new Archivo(name, prec, tipo, vent, receta);
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
            br.close();
            return ptrF;
        }
    }

    public Archivo UpdateListFile(Archivo ptrF, Pedido ptr) {
        Archivo q = ptrF;
        while (q != null) {
            Plato p = ptr.plato;
            while (p != null) {
                if (p.nombre.equals(q.nombre)) {
                    q.venta = q.venta + p.cantidad;
                }
                p = p.link;
            }
            q = q.link;
        }
        return ptrF;
    }
    
    public void WriteFile(Archivo ptrF) throws IOException{
        File archivo = new File("Menu.txt");
        FileWriter fw = new FileWriter(archivo);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("");
        Archivo p = ptrF;
        String line;
        while(p != null){
            line = p.nombre+","+p.precio+","+p.tipo+","+p.venta+","+p.receta;
            bw.write(line);
            bw.newLine();
            p = p.link;
        }
        bw.close();
    }
}
