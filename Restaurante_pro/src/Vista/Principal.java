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

/**
 *
 * @author Laboratorio
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Archivo ptrF = null;

    public Principal() throws IOException {
        initComponents();
        Archivo prueba = new Archivo(0, "", 0, "", 0);
        prueba.ReadFile(ptrF, 24);
        this.setSize(600, 516);
        this.setLocationRelativeTo(null);
        Meseros.setSize(540, 267);
        Meseros.setLocationRelativeTo(null);
        Pedido.setSize(858, 574);
        Pedido.setLocationRelativeTo(null);
        Menu.setSize(849, 730);
        Menu.setLocationRelativeTo(null);
        table.setBackground(java.awt.Color.WHITE);
        factura.setBackground(java.awt.Color.WHITE);
        E_pedido.setBackground(java.awt.Color.WHITE);
        pedido.setBackground(java.awt.Color.WHITE);
        admin.setBackground(java.awt.Color.WHITE);
        cocina.setBackground(java.awt.Color.WHITE);
        mesero.setBackground(java.awt.Color.WHITE);
        add.setBackground(java.awt.Color.WHITE);
        del.setBackground(java.awt.Color.WHITE);
        acep.setBackground(java.awt.Color.WHITE);
        back.setBackground(java.awt.Color.WHITE);
        acep1.setBackground(java.awt.Color.WHITE);
        back1.setBackground(java.awt.Color.WHITE);
        image.setBackground(java.awt.Color.WHITE);

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
        admin = new javax.swing.JButton();
        cocina = new javax.swing.JButton();
        mesero = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        Meseros.setTitle("Meseros");
        Meseros.setResizable(false);
        Meseros.setSize(new java.awt.Dimension(540, 267));
        Meseros.getContentPane().setLayout(null);

        factura.setText("Factura");
        factura.setBorder(null);
        Meseros.getContentPane().add(factura);
        factura.setBounds(40, 120, 120, 50);

        pedido.setText("Pedido");
        pedido.setBorder(null);
        pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidoActionPerformed(evt);
            }
        });
        Meseros.getContentPane().add(pedido);
        pedido.setBounds(390, 120, 120, 50);

        E_pedido.setText("Estado de Pedido");
        E_pedido.setBorder(null);
        Meseros.getContentPane().add(E_pedido);
        E_pedido.setBounds(200, 120, 150, 50);

        FondoM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MeseroP.png"))); // NOI18N
        Meseros.getContentPane().add(FondoM);
        FondoM.setBounds(0, -30, 620, 320);

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
                "Codigo", "Plato", "Cantidad", "Precio", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(55);
            table.getColumnModel().getColumn(0).setMaxWidth(55);
            table.getColumnModel().getColumn(2).setMinWidth(65);
            table.getColumnModel().getColumn(2).setMaxWidth(65);
            table.getColumnModel().getColumn(3).setMinWidth(75);
            table.getColumnModel().getColumn(3).setMaxWidth(75);
            table.getColumnModel().getColumn(4).setMinWidth(75);
            table.getColumnModel().getColumn(4).setMaxWidth(75);
        }

        Pedido.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 130, 530, 360);

        add.setText("Añadir");
        add.setBorder(null);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        Pedido.getContentPane().add(add);
        add.setBounds(560, 140, 130, 40);

        acep.setText("Aceptar");
        acep.setBorder(null);
        Pedido.getContentPane().add(acep);
        acep.setBounds(590, 370, 90, 30);

        back.setText("Volver");
        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        Pedido.getContentPane().add(back);
        back.setBounds(730, 370, 80, 30);

        Pedido.getContentPane().add(jComboBox1);
        jComboBox1.setBounds(720, 240, 90, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sebastian", "Jaime", "Esteban", "Perkins" }));
        Pedido.getContentPane().add(jComboBox2);
        jComboBox2.setBounds(560, 230, 130, 40);

        jLabel2.setText("Camarero");
        Pedido.getContentPane().add(jLabel2);
        jLabel2.setBounds(570, 210, 70, 14);

        jLabel4.setText("Mesa");
        Pedido.getContentPane().add(jLabel4);
        jLabel4.setBounds(720, 220, 41, 14);

        Fondop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PedidoP.png"))); // NOI18N
        Pedido.getContentPane().add(Fondop);
        Fondop.setBounds(0, 0, 930, 660);

        Menu.setResizable(false);
        Menu.getContentPane().setLayout(null);

        acep1.setText("Aceptar");
        acep1.setBorder(null);
        Menu.getContentPane().add(acep1);
        acep1.setBounds(540, 590, 110, 40);

        back1.setText("Volver");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        Menu.getContentPane().add(back1);
        back1.setBounds(540, 640, 110, 40);
        Menu.getContentPane().add(cant);
        cant.setBounds(690, 600, 70, 20);

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
        jLabel1.setBounds(690, 580, 70, 14);

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurante La Prosperidad");
        setResizable(false);
        setSize(new java.awt.Dimension(600, 516));
        getContentPane().setLayout(null);

        admin.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        admin.setText("Administración");
        admin.setBorder(null);
        admin.setBorderPainted(false);
        getContentPane().add(admin);
        admin.setBounds(20, 270, 170, 60);

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
                int cod = Integer.parseInt(st.nextElement().toString());
                String name = st.nextElement().toString();
                double prec = Double.parseDouble(st.nextElement().toString());
                String tipo = st.nextElement().toString();
                int vent = Integer.parseInt(st.nextElement().toString());
                Archivo u = new Archivo(cod, name, prec, tipo, vent);
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
        // TODO add your handling code here:
        System.out.println("Felicidad");
    }//GEN-LAST:event_cocinaActionPerformed

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
    private javax.swing.JButton E_pedido;
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoM;
    private javax.swing.JLabel Fondop;
    private javax.swing.JFrame Menu;
    private javax.swing.JFrame Meseros;
    private javax.swing.JFrame Pedido;
    private javax.swing.JButton acep;
    private javax.swing.JButton acep1;
    private javax.swing.JButton add;
    private javax.swing.JButton admin;
    private javax.swing.JButton back;
    private javax.swing.JButton back1;
    private javax.swing.JSpinner cant;
    private javax.swing.JButton cocina;
    private javax.swing.JButton del;
    private javax.swing.JButton factura;
    private javax.swing.JLabel image;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> menu;
    private javax.swing.JButton mesero;
    private javax.swing.JButton pedido;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
