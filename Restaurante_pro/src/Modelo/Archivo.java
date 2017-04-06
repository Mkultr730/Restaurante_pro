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
    public int codigo;
    public String nombre;
    public double precio;
    public int cantidad;
    public int venta;
    public Archivo link;

    public Archivo(int codigo, String nombre, double precio, int cantidad, int venta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.venta = venta;
    }
    
    public void ReadFile(Archivo ptrF) throws FileNotFoundException, IOException {
        File archivo = new File("Menu.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String c;
        while ((c = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(c, ",");
            int cod = Integer.parseInt(st.nextElement().toString());
            String name = st.nextElement().toString();
            double prec = Double.parseDouble(st.nextElement().toString());
            int cant = Integer.parseInt(st.nextElement().toString());
            int vent = Integer.parseInt(st.nextElement().toString());
            Archivo u = new Archivo(cod, name, prec, cant, vent);
            if (ptrF == null) {
                ptrF = u;
            }else{
                Archivo p = ptrF;
                while(p.link != null){
                    p = p.link;
                }
                p.link = u;
            }            
        }
        br.close();
        Archivo p = ptrF;
        while(p != null){
            System.out.println(p.codigo+","+p.nombre+","+p.precio+","+p.cantidad+","+p.venta);
            p = p.link;
        }
    }
    
    public void UpdateFile(Pedido p, Archivo ptrF) throws IOException{
        File archivo = new File("Menu.txt");
        FileWriter fw = new FileWriter(archivo);
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            while(ptrF != null){
                Plato q = p.plato;
                int cod = ptrF.codigo;
                String name = ptrF.nombre;
                double precio = ptrF.precio;
                int cant = ptrF.cantidad;
                int venta = ptrF.venta;
                while(q != null){
                    if (q.cod == cod) {
                        cant = cant - q.cantidad;
                        venta = venta + q.cantidad;
                    }else{
                        q = q.link;
                    }
                }
                System.out.println(cod+","+name+","+precio+","+cant+","+venta);
                bw.write(cod+","+name+","+precio+","+cant+","+venta);
                bw.newLine();
                ptrF = ptrF.link;
            }
        }
    }
}
