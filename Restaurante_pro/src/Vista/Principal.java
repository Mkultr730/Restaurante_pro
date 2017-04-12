/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Archivo;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Laboratorio
 */
public class Principal extends javax.swing.JFrame implements Runnable {

    String hora, minutos, segundos, ampm;
    Calendar calendario;
    Thread h1;
    /**
     * Creates new form Principal
     */
    public Archivo ptrF = null;
    public Archivo a = new Archivo("", 0, "", 0);

    public Principal() throws IOException {
        initComponents();
        h1 = new Thread(this);
        h1.start();
        ptrF = a.ReadFile(ptrF);
        this.setSize(600, 516);
        this.setLocationRelativeTo(null);
        Time.setSize(534, 217);
        Meseros.setSize(540, 267);
        Meseros.setLocationRelativeTo(null);
        Pedido.setSize(858, 574);
        Pedido.setLocationRelativeTo(null);
        Menu.setSize(849, 730);
        Menu.setLocationRelativeTo(null);
        Cocina.setSize(692, 431);
        Cocina.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Meseros = new javax.swing.JFrame();
        factura = new javax.swing.JButton();
        pedido = new javax.swing.JButton();
        E_pedido = new javax.swing.JButton();
        FondoM = new javax.swing.JLabel();
        Pedido = new javax.swing.JFrame();
        del = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        add = new javax.swing.JButton();
        acep = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Fondop = new javax.swing.JLabel();
        Menu = new javax.swing.JFrame();
        acep1 = new javax.swing.JButton();
        back1 = new javax.swing.JButton();
        cant = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        menu = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        image = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        Cocina = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        timeC = new javax.swing.JButton();
        see = new javax.swing.JButton();
        end = new javax.swing.JButton();
        backC = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        FondoC = new javax.swing.JLabel();
        Time = new javax.swing.JFrame();
        lbHora = new javax.swing.JLabel();
        FondoT = new javax.swing.JLabel();
        admin = new javax.swing.JButton();
        cocina = new javax.swing.JButton();
        mesero = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        Meseros.setTitle("Meseros");
        Meseros.setResizable(false);
        Meseros.setSize(new java.awt.Dimension(540, 267));
        Meseros.getContentPane().setLayout(null);

        factura.setBackground(new java.awt.Color(255, 255, 255));
        factura.setText("Factura");
        factura.setBorder(null);
        Meseros.getContentPane().add(factura);
        factura.setBounds(40, 120, 120, 50);

        pedido.setBackground(new java.awt.Color(255, 255, 255));
        pedido.setText("Pedido");
        pedido.setBorder(null);
        pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoActionPerformed(evt);
            }
        });
        Meseros.getContentPane().add(pedido);
        pedido.setBounds(390, 120, 120, 50);

        E_pedido.setBackground(new java.awt.Color(255, 255, 255));
        E_pedido.setText("Estado de Pedido");
        E_pedido.setBorder(null);
        Meseros.getContentPane().add(E_pedido);
        E_pedido.setBounds(200, 120, 150, 50);

        FondoM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MeseroP.png"))); // NOI18N
        Meseros.getContentPane().add(FondoM);
        FondoM.setBounds(0, -30, 620, 320);

        Pedido.setTitle("Pedido");
        Pedido.setResizable(false);
        Pedido.getContentPane().setLayout(null);

        del.setBackground(new java.awt.Color(255, 255, 255));
        del.setText("Eliminar");
        del.setBorder(null);
        Pedido.getContentPane().add(del);
        del.setBounds(700, 140, 130, 40);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plato", "Cantidad", "Precio", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(1).setMinWidth(65);
            table.getColumnModel().getColumn(1).setMaxWidth(65);
            table.getColumnModel().getColumn(2).setMinWidth(75);
            table.getColumnModel().getColumn(2).setMaxWidth(75);
            table.getColumnModel().getColumn(3).setMinWidth(75);
            table.getColumnModel().getColumn(3).setMaxWidth(75);
        }

        Pedido.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 130, 530, 360);

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setText("Añadir");
        add.setBorder(null);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        Pedido.getContentPane().add(add);
        add.setBounds(560, 140, 130, 40);

        acep.setBackground(new java.awt.Color(255, 255, 255));
        acep.setText("Aceptar");
        acep.setBorder(null);
        acep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acepActionPerformed(evt);
            }
        });
        Pedido.getContentPane().add(acep);
        acep.setBounds(590, 370, 90, 30);

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setText("Volver");
        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        Pedido.getContentPane().add(back);
        back.setBounds(730, 370, 80, 30);

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        Pedido.getContentPane().add(jComboBox1);
        jComboBox1.setBounds(720, 240, 90, 26);

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sebastian", "Jaime", "Esteban", "Perkins" }));
        Pedido.getContentPane().add(jComboBox2);
        jComboBox2.setBounds(560, 230, 130, 40);

        jLabel2.setText("Camarero");
        Pedido.getContentPane().add(jLabel2);
        jLabel2.setBounds(570, 210, 70, 16);

        jLabel4.setText("Mesa");
        Pedido.getContentPane().add(jLabel4);
        jLabel4.setBounds(720, 220, 41, 16);

        Fondop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PedidoP.png"))); // NOI18N
        Pedido.getContentPane().add(Fondop);
        Fondop.setBounds(0, 0, 930, 660);

        Menu.setTitle("Menú");
        Menu.setResizable(false);
        Menu.getContentPane().setLayout(null);

        acep1.setBackground(new java.awt.Color(255, 255, 255));
        acep1.setText("Aceptar");
        acep1.setBorder(null);
        acep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acep1ActionPerformed(evt);
            }
        });
        Menu.getContentPane().add(acep1);
        acep1.setBounds(540, 590, 110, 40);

        back1.setBackground(new java.awt.Color(255, 255, 255));
        back1.setText("Volver");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        Menu.getContentPane().add(back1);
        back1.setBounds(540, 640, 110, 40);

        cant.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        Menu.getContentPane().add(cant);
        cant.setBounds(690, 600, 70, 28);

        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(menu);

        Menu.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(530, 200, 280, 360);

        jLabel1.setText("Cantidad");
        Menu.getContentPane().add(jLabel1);
        jLabel1.setBounds(690, 580, 70, 16);

        tipo.setBackground(new java.awt.Color(255, 255, 255));
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Platillos", "Bebidas", "Postres" }));
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });
        Menu.getContentPane().add(tipo);
        tipo.setBounds(560, 150, 200, 40);
        Menu.getContentPane().add(image);
        image.setBounds(50, 150, 470, 530);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuP.png"))); // NOI18N
        Menu.getContentPane().add(Fondo);
        Fondo.setBounds(0, -20, 1480, 890);

        Cocina.setTitle("Cocina");
        Cocina.setResizable(false);
        Cocina.getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Platillo", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMinWidth(70);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(70);
        }

        Cocina.getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(30, 110, 410, 270);

        timeC.setBackground(new java.awt.Color(255, 255, 255));
        timeC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Time.png"))); // NOI18N
        timeC.setBorder(null);
        timeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeCActionPerformed(evt);
            }
        });
        Cocina.getContentPane().add(timeC);
        timeC.setBounds(580, 30, 70, 40);

        see.setBackground(new java.awt.Color(255, 255, 255));
        see.setText("Ver Pedido");
        see.setBorder(null);
        Cocina.getContentPane().add(see);
        see.setBounds(460, 210, 100, 40);

        end.setBackground(new java.awt.Color(255, 255, 255));
        end.setText("Terminado");
        end.setBorder(null);
        Cocina.getContentPane().add(end);
        end.setBounds(580, 210, 90, 40);

        backC.setBackground(new java.awt.Color(255, 255, 255));
        backC.setText("Volver");
        backC.setBorder(null);
        backC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backCActionPerformed(evt);
            }
        });
        Cocina.getContentPane().add(backC);
        backC.setBounds(480, 340, 70, 40);

        jComboBox3.setBackground(new java.awt.Color(255, 255, 255));
        Cocina.getContentPane().add(jComboBox3);
        jComboBox3.setBounds(460, 170, 100, 30);

        jLabel3.setText("N. Mesa");
        Cocina.getContentPane().add(jLabel3);
        jLabel3.setBounds(460, 150, 60, 16);

        FondoC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CocinaP.png"))); // NOI18N
        Cocina.getContentPane().add(FondoC);
        FondoC.setBounds(0, 0, 693, 431);

        Time.setResizable(false);
        Time.getContentPane().setLayout(null);

        lbHora.setFont(new java.awt.Font("sansserif", 1, 85)); // NOI18N
        lbHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHora.setText("Time");
        Time.getContentPane().add(lbHora);
        lbHora.setBounds(0, 0, 530, 220);

        FondoT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reloj.png"))); // NOI18N
        Time.getContentPane().add(FondoT);
        FondoT.setBounds(0, 0, 540, 220);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurante La Prosperidad");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 516));
        getContentPane().setLayout(null);

        admin.setBackground(new java.awt.Color(255, 255, 255));
        admin.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        admin.setText("Administración");
        admin.setBorder(null);
        admin.setBorderPainted(false);
        getContentPane().add(admin);
        admin.setBounds(20, 270, 170, 60);

        cocina.setBackground(new java.awt.Color(255, 255, 255));
        cocina.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        cocina.setText("Cocina");
        cocina.setBorder(null);
        cocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocinaActionPerformed(evt);
            }
        });
        getContentPane().add(cocina);
        cocina.setBounds(220, 270, 170, 60);

        mesero.setBackground(new java.awt.Color(255, 255, 255));
        mesero.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        mesero.setText("Meseros");
        mesero.setBorder(null);
        mesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meseroActionPerformed(evt);
            }
        });
        getContentPane().add(mesero);
        mesero.setBounds(410, 270, 170, 60);

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo2.png"))); // NOI18N
        getContentPane().add(FONDO);
        FONDO.setBounds(0, -70, 600, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void meseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meseroActionPerformed
        this.setVisible(false);
        Meseros.setVisible(true);
    }//GEN-LAST:event_meseroActionPerformed

    private void pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidoActionPerformed
        Meseros.setVisible(false);
        Pedido.setVisible(true);
    }//GEN-LAST:event_pedidoActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Pedido.setVisible(false);
        Meseros.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        Pedido.setVisible(false);
        Menu.setVisible(true);
        ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/nulo.png"));
        image.setIcon(Img);
        Archivo p = ptrF;
        while (p != null) {
            System.out.println(p.nombre);
            p = p.link;
        }
    }//GEN-LAST:event_addActionPerformed
    void lista(Archivo ptrF, String op, int sw) {
        DefaultListModel model = new DefaultListModel();
        File archivo = new File("Menu.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(archivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (BufferedReader br = new BufferedReader(fr)) {
            String c;
            while ((c = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(c, ",");
                String name = st.nextElement().toString();
                double prec = Double.parseDouble(st.nextElement().toString());
                String tipo = st.nextElement().toString();
                int vent = Integer.parseInt(st.nextElement().toString());
                Archivo u = new Archivo(name, prec, tipo, vent);
                if (sw == 0) {
                    if (ptrF == null) {
                        ptrF = u;
                    } else {
                        Archivo p = ptrF;
                        while (p.link != null) {
                            p = p.link;
                        }
                        p.link = u;
                    }

                } else {
                    if (op.equals(tipo)) {
                        model.addElement(name);
                    }
                }

            }
            menu.setModel(model);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        String op = tipo.getSelectedItem().toString();
        switch (op) {
            case "Platillos":
                lista(null, op, 1);
                break;
            case "Bebidas":
                lista(null, op, 1);
                break;
            case "Postres":
                lista(null, op, 1);
                break;
        }
    }//GEN-LAST:event_tipoActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        Menu.setVisible(false);
        Pedido.setVisible(true);
    }//GEN-LAST:event_back1ActionPerformed

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        String op = menu.getSelectedValue();
        if (!op.equals("")) {
            if (!op.contains(" ")) {
                ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/" + op + ".png"));
                image.setIcon(Img);
            } else {
                String aux = "";
                for (int i = 0; i < op.length(); i++) {
                    if (op.charAt(i) != ' ') {
                        aux += op.charAt(i);
                    }
                }
                ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/" + aux + ".png"));
                image.setIcon(Img);
            }
        }
    }//GEN-LAST:event_menuMouseClicked

    private void cocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cocinaActionPerformed
        this.setVisible(false);
        Cocina.setVisible(true);
    }//GEN-LAST:event_cocinaActionPerformed

    private void backCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backCActionPerformed
        Cocina.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_backCActionPerformed

    private void timeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeCActionPerformed
        Time.setVisible(true);
    }//GEN-LAST:event_timeCActionPerformed

    private void acep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acep1ActionPerformed
        int cont = 0;
        int c = Integer.parseInt(cant.getValue().toString());
        String op = menu.getSelectedValue();
        File archivo = new File("Menu.txt");
        FileReader fr = null;
        boolean sw = false;
        try {
            fr = new FileReader(archivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(fr);
        String aux;
        try {
            while ((aux = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(aux, ",");
                String name = st.nextElement().toString();
                double prec = Double.parseDouble(st.nextElement().toString());
                String tipo = st.nextElement().toString();
                int vent = Integer.parseInt(st.nextElement().toString());
                if (name.equals(op)) {
                    File bodega = new File("Inventario.txt");
                    FileReader nfr = new FileReader(bodega);
                    BufferedReader nbf = new BufferedReader(fr);
                    String d;
                    while (st.hasMoreElements() && sw == false) {
                        StringTokenizer nt = new StringTokenizer(st.nextElement().toString(), ":");
                        String ingrediente = nt.nextElement().toString();
                        int cant = Integer.parseInt(nt.nextElement().toString());
                        System.out.println(ingrediente + ", " + cant);
                        sw = a.Inventario(ingrediente, cant, c);
                        System.out.println(sw);
//                        if (sw == true) {
//                            cont += 1;
//                        }
                    }
                    if (sw == false) {
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(new Object[]{name, c , prec, (c * prec)});
                        Pedido.setVisible(true);
                        Menu.setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(null, "No hay suficientes ingredientes", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }
                }

            }

        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_acep1ActionPerformed

    private void acepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acepActionPerformed
        
    }//GEN-LAST:event_acepActionPerformed
    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == h1) {
            calcula();
            lbHora.setText(hora + ":" + minutos + ":" + segundos + " " + ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(3500);
                } catch (Exception e) {
                }
                try {
                    new Principal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Cocina;
    private javax.swing.JButton E_pedido;
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoC;
    private javax.swing.JLabel FondoM;
    private javax.swing.JLabel FondoT;
    private javax.swing.JLabel Fondop;
    private javax.swing.JFrame Menu;
    private javax.swing.JFrame Meseros;
    private javax.swing.JFrame Pedido;
    private javax.swing.JFrame Time;
    private javax.swing.JButton acep;
    private javax.swing.JButton acep1;
    private javax.swing.JButton add;
    private javax.swing.JButton admin;
    private javax.swing.JButton back;
    private javax.swing.JButton back1;
    private javax.swing.JButton backC;
    private javax.swing.JSpinner cant;
    private javax.swing.JButton cocina;
    private javax.swing.JButton del;
    private javax.swing.JButton end;
    private javax.swing.JButton factura;
    private javax.swing.JLabel image;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbHora;
    private javax.swing.JList<String> menu;
    private javax.swing.JButton mesero;
    private javax.swing.JButton pedido;
    private javax.swing.JButton see;
    private javax.swing.JTable table;
    private javax.swing.JButton timeC;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
