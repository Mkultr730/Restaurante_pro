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
 * @author Usuario
 */
public class Inventario {

    public String ingrediente;
    public int existencias;
    public Inventario link;

    public Inventario(String ingrediente, int existencias) {
        this.ingrediente = ingrediente;
        this.existencias = existencias;
        this.link = null;
    }

    public Inventario readIn() throws FileNotFoundException, IOException {
        Inventario ptr = null;
        File inventario = new File("Inventario.txt");
        FileReader fr = new FileReader(inventario);
        BufferedReader br = new BufferedReader(fr);
        String c;
        while ((c = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(c, ",");
            String nombre = st.nextElement().toString();
            int cant = Integer.parseInt(st.nextElement().toString());
            Inventario p = new Inventario(nombre, cant);
            if (ptr == null) {
                ptr = p;
            } else {
                Inventario q = ptr;
                while (q.link != null) {
                    q = q.link;
                }
                q.link = p;
            }
        }
        br.close();;
        return ptr;
    }

    public boolean Inventario(String pro, int cant, int p, int aux) throws FileNotFoundException, IOException {
        File inventario = new File("Inventario.txt");
        int sw = 0;
        FileReader fr = new FileReader(inventario);
        BufferedReader br = new BufferedReader(fr);
        String c;
        while ((c = br.readLine()) != null && sw == 0) {
            StringTokenizer st = new StringTokenizer(c, ",");
            String nombre = st.nextElement().toString();
            int ca = Integer.parseInt(st.nextElement().toString());
            if (nombre.equals(pro)) {
                sw = 1;
                if ((cant * p) > ca) {
                    return true;
                }
            }
        }
        br.close();
        return false;
    }

    public Inventario UpdateListIn(Archivo ptrF, Inventario ptr, Plato p) {
        Archivo q = ptrF;
        while(q != null){
            Plato h = p;
            while(h != null){
                if (q.nombre.equals(h.nombre)) {
                    String receta = q.receta;
                    StringTokenizer st = new StringTokenizer(receta , ",");
                    while(st.hasMoreElements()){
                        StringTokenizer nt = new StringTokenizer(st.nextElement().toString() , ":");
                        String ingrediente = nt.nextElement().toString();
                        int cantidad = Integer.parseInt(nt.nextElement().toString());
                        Inventario i = ptr;
                        while(i != null){
                            if (i.ingrediente.equals(ingrediente)) {
                                i.existencias -= cantidad*h.cantidad;
                            }
                            i = i.link; 
                        }
                    }
                }
                h = h.link;
            }
            q = q.link;
        } 
        return ptr;
    }

    public void WriteIn(Inventario ptr) throws IOException {
        File inventario = new File("Inventario.txt");
        FileWriter fw = new FileWriter(inventario);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("");
        Inventario p = ptr;
        String line;
        while(p != null){
            line = p.ingrediente+","+p.existencias;
            bw.write(line);
            bw.newLine();
            p = p.link;
        }
        bw.close();               
    }
}
