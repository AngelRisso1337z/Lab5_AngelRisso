/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author HP_AMD_64
 */
public class Liga_espagnola extends javax.swing.JFrame {

    /**
     * Creates new form Liga_espagnola
     */
    public Liga_espagnola() {
        initComponents();
        
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_agregar = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_presu = new javax.swing.JTextField();
        sp_copas = new javax.swing.JSpinner();
        bt_crearE = new javax.swing.JButton();
        bt_jugadores = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tf_estadio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_jugadores = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rb_dis = new javax.swing.JRadioButton();
        rb_nod = new javax.swing.JRadioButton();
        rb_atacante = new javax.swing.JRadioButton();
        rb_defensor = new javax.swing.JRadioButton();
        rb_medio = new javax.swing.JRadioButton();
        rb_portero = new javax.swing.JRadioButton();
        tf_precio = new javax.swing.JTextField();
        tf_jugador = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        sp_habilidad = new javax.swing.JSpinner();
        sp_dura = new javax.swing.JSpinner();
        sp_tecnica = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_equipos = new javax.swing.JList<>();
        jLabel18 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        bt_agregar = new javax.swing.JButton();
        bt_listar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jd_agregar.setTitle("Agregar");
        jd_agregar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jd_agregar.setPreferredSize(new java.awt.Dimension(803, 546));
        jd_agregar.setResizable(false);
        jd_agregar.getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel4.setText("Nombre de equipo");
        jd_agregar.getContentPane().add(jLabel4);
        jLabel4.setBounds(87, 50, 97, 17);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel5.setText("Presupuesto");
        jd_agregar.getContentPane().add(jLabel5);
        jLabel5.setBounds(122, 91, 62, 17);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel6.setText("Cantidad de copas ganadas");
        jd_agregar.getContentPane().add(jLabel6);
        jLabel6.setBounds(42, 135, 142, 17);

        tf_nombre.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jd_agregar.getContentPane().add(tf_nombre);
        tf_nombre.setBounds(202, 47, 160, 23);

        tf_presu.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jd_agregar.getContentPane().add(tf_presu);
        tf_presu.setBounds(202, 88, 160, 23);

        sp_copas.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jd_agregar.getContentPane().add(sp_copas);
        sp_copas.setBounds(202, 129, 42, 30);

        bt_crearE.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        bt_crearE.setText("crear equipo");
        bt_crearE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearEMouseClicked(evt);
            }
        });
        jd_agregar.getContentPane().add(bt_crearE);
        bt_crearE.setBounds(60, 230, 99, 43);

        bt_jugadores.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        bt_jugadores.setText("Agregar jugadores");
        bt_jugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_jugadoresMouseClicked(evt);
            }
        });
        jd_agregar.getContentPane().add(bt_jugadores);
        bt_jugadores.setBounds(42, 484, 129, 43);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel7.setText("Estadio Local");
        jd_agregar.getContentPane().add(jLabel7);
        jLabel7.setBounds(114, 168, 70, 17);

        tf_estadio.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jd_agregar.getContentPane().add(tf_estadio);
        tf_estadio.setBounds(202, 165, 160, 23);

        jl_jugadores.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jl_jugadores.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_jugadores);

        jd_agregar.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(580, 350, 207, 159);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel9.setText("Lista jugadores");
        jd_agregar.getContentPane().add(jLabel9);
        jLabel9.setBounds(590, 320, 80, 17);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel11.setText("Nombre de Jugador");
        jd_agregar.getContentPane().add(jLabel11);
        jLabel11.setBounds(42, 342, 106, 17);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel12.setText("Disponible");
        jd_agregar.getContentPane().add(jLabel12);
        jLabel12.setBounds(92, 313, 53, 17);

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel13.setText("Precio De Jugador");
        jd_agregar.getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 380, 98, 17);

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel14.setText("Pocicion de jugador");
        jd_agregar.getContentPane().add(jLabel14);
        jLabel14.setBounds(25, 447, 110, 17);

        buttonGroup1.add(rb_dis);
        rb_dis.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        rb_dis.setSelected(true);
        rb_dis.setText("Disponible");
        rb_dis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_disActionPerformed(evt);
            }
        });
        jd_agregar.getContentPane().add(rb_dis);
        rb_dis.setBounds(163, 311, 80, 25);

        buttonGroup1.add(rb_nod);
        rb_nod.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        rb_nod.setText("No Disponible");
        jd_agregar.getContentPane().add(rb_nod);
        rb_nod.setBounds(254, 311, 110, 25);

        buttonGroup2.add(rb_atacante);
        rb_atacante.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        rb_atacante.setSelected(true);
        rb_atacante.setText("Atacante");
        jd_agregar.getContentPane().add(rb_atacante);
        rb_atacante.setBounds(161, 443, 80, 25);

        buttonGroup2.add(rb_defensor);
        rb_defensor.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        rb_defensor.setText("Defensor");
        rb_defensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_defensorActionPerformed(evt);
            }
        });
        jd_agregar.getContentPane().add(rb_defensor);
        rb_defensor.setBounds(361, 443, 80, 25);

        buttonGroup2.add(rb_medio);
        rb_medio.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        rb_medio.setText("Mediocampista");
        jd_agregar.getContentPane().add(rb_medio);
        rb_medio.setBounds(248, 443, 110, 25);

        buttonGroup2.add(rb_portero);
        rb_portero.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        rb_portero.setText("Portero");
        jd_agregar.getContentPane().add(rb_portero);
        rb_portero.setBounds(448, 443, 70, 25);

        tf_precio.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        tf_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_precioActionPerformed(evt);
            }
        });
        jd_agregar.getContentPane().add(tf_precio);
        tf_precio.setBounds(160, 380, 185, 23);

        tf_jugador.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        tf_jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_jugadorActionPerformed(evt);
            }
        });
        jd_agregar.getContentPane().add(tf_jugador);
        tf_jugador.setBounds(158, 341, 185, 23);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel15.setText("Habilidad");
        jd_agregar.getContentPane().add(jLabel15);
        jLabel15.setBounds(410, 370, 50, 17);

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel16.setText("Durabilidad");
        jd_agregar.getContentPane().add(jLabel16);
        jLabel16.setBounds(410, 300, 60, 17);

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel17.setText("Tecnica");
        jd_agregar.getContentPane().add(jLabel17);
        jLabel17.setBounds(414, 330, 50, 17);

        sp_habilidad.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        sp_habilidad.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 100.0d, 1.0d));
        jd_agregar.getContentPane().add(sp_habilidad);
        sp_habilidad.setBounds(500, 370, 50, 30);

        sp_dura.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        sp_dura.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 100.0d, 1.0d));
        sp_dura.setMaximumSize(new java.awt.Dimension(100, 100));
        jd_agregar.getContentPane().add(sp_dura);
        sp_dura.setBounds(500, 290, 50, 30);

        sp_tecnica.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        sp_tecnica.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 100.0d, 1.0d));
        jd_agregar.getContentPane().add(sp_tecnica);
        sp_tecnica.setBounds(500, 330, 50, 30);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel10.setText("Lista equipos");
        jd_agregar.getContentPane().add(jLabel10);
        jLabel10.setBounds(610, 30, 70, 17);

        jl_equipos.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jl_equipos.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_equipos);

        jd_agregar.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(580, 70, 200, 180);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab5/estadio-de-fútbol-vacío-41316005.jpg"))); // NOI18N
        jLabel18.setText("   ");
        jd_agregar.getContentPane().add(jLabel18);
        jLabel18.setBounds(0, 0, 800, 540);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIGA ESPAÑOLA DE FUTBOL");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LIGA ESPAÑOLA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 20, 220, 46);

        bt_agregar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        bt_agregar.setText("agregar");
        bt_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_agregar);
        bt_agregar.setBounds(70, 220, 102, 47);

        bt_listar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        bt_listar.setText("listar");
        getContentPane().add(bt_listar);
        bt_listar.setBounds(350, 220, 105, 47);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Agregar equipos y Jugadores");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 170, 195, 59);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Listar los equipos");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 190, 118, 21);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab5/futbol.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 13, 600, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarActionPerformed
        jd_agregar.setVisible(true);
        jd_agregar.setLocationRelativeTo(this);
        jd_agregar.pack();
        jd_agregar.setResizable(false);
        jd_agregar.setModal(true);
    }//GEN-LAST:event_bt_agregarActionPerformed

    private void bt_crearEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearEMouseClicked
        String nombre = "", estadio = "";
        double presupuesto = 0;
        int copas = 0;
        try {
            nombre = tf_nombre.getText();
            estadio = tf_estadio.getText();
            copas = (Integer) sp_copas.getValue();
            presupuesto = Double.parseDouble(tf_presu.getText());
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(jd_agregar, "Ocurrio un error en el input,intente de nuevo");
        } catch (NumberFormatException x) {
            JOptionPane.showMessageDialog(jd_agregar, "Ocurrio un error en el input en el area\nadonde va un numero, intente de nuevo");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(jd_agregar, "ERROR FATAL. caso en consola");
            ex.printStackTrace();
        }
        equipo.add(new Equipos(nombre, copas, presupuesto, estadio));
        DefaultListModel modelo = (DefaultListModel) jl_equipos.getModel();
        modelo.addElement(new Equipos(nombre, copas, presupuesto, estadio));

    }//GEN-LAST:event_bt_crearEMouseClicked

    private void tf_jugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_jugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_jugadorActionPerformed

    private void rb_defensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_defensorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_defensorActionPerformed

    private void rb_disActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_disActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_disActionPerformed

    private void tf_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_precioActionPerformed

    private void bt_jugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_jugadoresMouseClicked
        String nombre = " ";
        double precio = 0.0;
        double tecnica = 0.0;
        double habilidad = 0.0;
        double resistencia = 0.0;
        String pocicion = " ";
        boolean dispo = false;
        
        nombre = tf_jugador.getText();
        precio = Double.parseDouble(tf_precio.getText());
        tecnica = (Double)sp_tecnica.getValue();
        habilidad = (Double)sp_habilidad.getValue();
        resistencia = (Double)sp_dura.getValue();

        if (rb_atacante.isSelected()) {
            pocicion = "Atacante";

        } else if (rb_medio.isSelected()) {
            pocicion = "Mediocampista";

        } else if (rb_portero.isSelected()) {
            pocicion = "Portero";

        } else {
            pocicion = "Defensor";

        }

        dispo = rb_dis.isSelected();
        jugadores.add(new Jugador(nombre, habilidad, tecnica, resistencia, precio, dispo));

        tf_jugador.setText("");
        sp_tecnica.setValue(1);
        sp_habilidad.setValue(1);
        sp_dura.setValue(1);
        tf_precio.setText("");
        
        DefaultListModel modelo = (DefaultListModel) jl_jugadores.getModel();
        modelo.addElement(new Jugador(nombre, habilidad, tecnica, resistencia, precio, dispo));
    }//GEN-LAST:event_bt_jugadoresMouseClicked

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
            java.util.logging.Logger.getLogger(Liga_espagnola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Liga_espagnola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Liga_espagnola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Liga_espagnola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Liga_espagnola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agregar;
    private javax.swing.JButton bt_crearE;
    private javax.swing.JButton bt_jugadores;
    private javax.swing.JButton bt_listar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jd_agregar;
    private javax.swing.JList<String> jl_equipos;
    private javax.swing.JList<String> jl_jugadores;
    private javax.swing.JRadioButton rb_atacante;
    private javax.swing.JRadioButton rb_defensor;
    private javax.swing.JRadioButton rb_dis;
    private javax.swing.JRadioButton rb_medio;
    private javax.swing.JRadioButton rb_nod;
    private javax.swing.JRadioButton rb_portero;
    private javax.swing.JSpinner sp_copas;
    private javax.swing.JSpinner sp_dura;
    private javax.swing.JSpinner sp_habilidad;
    private javax.swing.JSpinner sp_tecnica;
    private javax.swing.JTextField tf_estadio;
    private javax.swing.JTextField tf_jugador;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_precio;
    private javax.swing.JTextField tf_presu;
    // End of variables declaration//GEN-END:variables

    ArrayList<Equipos> equipo = new ArrayList();
    ArrayList<Jugador> jugadores = new ArrayList();
}
