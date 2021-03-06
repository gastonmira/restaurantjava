package tprestaurant;

import tprestaurant.misc.Carga;
import tprestaurant.misc.Persister;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import tprestaurant.model.*;
import tprestaurant.model.productos.Postre;

public class TPRestaurant extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private Restaurant restaurant;

    public TPRestaurant() {
        initComponents();
        restaurant = new Restaurant();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProductos = new javax.swing.JButton();
        btnMenues = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        cargarIngredientes = new javax.swing.JMenuItem();
        cargarRestaurante = new javax.swing.JMenuItem();
        guardarRestaurante = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnProductos.setText("Productos");
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosMouseClicked(evt);
            }
        });

        btnMenues.setText("Menues");
        btnMenues.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuesMouseClicked(evt);
            }
        });

        btnReportes.setText("Reportes");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Cargar Porcentaje ganancia postres ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        cargarIngredientes.setText("Cargar Ingredientes");
        cargarIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarIngredientesActionPerformed(evt);
            }
        });
        jMenu1.add(cargarIngredientes);

        cargarRestaurante.setText("Cargar Restaurante");
        cargarRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarRestauranteActionPerformed(evt);
            }
        });
        jMenu1.add(cargarRestaurante);

        guardarRestaurante.setText("Guardar Restaurante");
        guardarRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarRestauranteActionPerformed(evt);
            }
        });
        jMenu1.add(guardarRestaurante);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(btnMenues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMenues, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        JFrame productosForm = new ProductosForm(restaurant);
        productosForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        productosForm.setVisible(true);
        productosForm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnMenuesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuesMouseClicked
        JFrame menuesForm = new MenuesForm(restaurant);
        menuesForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        menuesForm.setVisible(true);
        menuesForm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMenuesMouseClicked

    private void cargarRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarRestauranteActionPerformed
        try {
            restaurant = Persister.cargarRestaurant("file.xml");
        } catch (ExcepcionLogica ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
        Postre.setPorcentajeGanancia(restaurant.getPorcentajeGananciaPostres());
    }//GEN-LAST:event_cargarRestauranteActionPerformed

    private void guardarRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarRestauranteActionPerformed
        try {
            Persister.guardarRestaurant("file.xml", restaurant);
        } catch (ExcepcionLogica ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_guardarRestauranteActionPerformed

    private void cargarIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarIngredientesActionPerformed
        try {
            restaurant.agregarIngredientes(Carga.cargaIngredientes("ingredientes.txt"));
        } catch (ExcepcionLogica ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_cargarIngredientesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JFrame gananciaPostres = new CargaGananciaPostres(restaurant);
        gananciaPostres.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gananciaPostres.setVisible(true);
        gananciaPostres.setLocationRelativeTo(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        JFrame reportesForm = new ReportesForm(restaurant);
        reportesForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        reportesForm.setVisible(true);
        reportesForm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnReportesActionPerformed

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
            java.util.logging.Logger.getLogger(TPRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TPRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TPRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TPRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TPRestaurant tpRestaurant = new TPRestaurant();

                tpRestaurant.setLocationRelativeTo(null);
                tpRestaurant.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenues;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnReportes;
    private javax.swing.JMenuItem cargarIngredientes;
    private javax.swing.JMenuItem cargarRestaurante;
    private javax.swing.JMenuItem guardarRestaurante;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
