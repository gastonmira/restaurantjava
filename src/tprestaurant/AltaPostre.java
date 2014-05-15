package tprestaurant;

import tprestaurant.misc.Validator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tprestaurant.misc.Callback;
import tprestaurant.model.ExcepcionLogica;
import tprestaurant.model.Restaurant;
import tprestaurant.model.productos.Entrada;
import tprestaurant.model.productos.Postre;
import tprestaurant.model.productos.Producto;

public class AltaPostre extends javax.swing.JFrame {

    Restaurant restaurant;
    Callback callback;
    private Postre postre;

    /**
     * Creates new form AltaPostre
     */
    public AltaPostre(Postre postre, Restaurant restaurant, Callback callback) {
        this.callback = callback;
        this.restaurant = restaurant;
        this.postre = postre;
        initComponents();
        AltaOMod(postre);
    }

    private void AltaOMod(Postre postre) {

        if (postre != null) {
            txtDescripcionPostre.setText(postre.getDescripcion());
            costoPostre.setText(String.valueOf(postre.costo()));
            checkBoxPostre.setSelected(postre.isActivo());
            jLabel3.setText("Modificar Postre");
            btnEliminar.setVisible(true);
            txtDescripcionPostre.setEnabled(false);

        } else {
            txtDescripcionPostre.setText("");
            costoPostre.setText("");
            jLabel3.setText("Alta Postre");
            btnEliminar.setVisible(false);
            txtDescripcionPostre.setEnabled(true);
            checkBoxPostre.setSelected(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtDescripcionPostre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        costoPostre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        checkBoxPostre = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Descripción");

        jLabel2.setText("Costo");

        costoPostre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                costoPostreKeyReleased(evt);
            }
        });

        jLabel3.setText("Alta de Postre");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        checkBoxPostre.setText("¿Activo?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkBoxPostre))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(costoPostre)
                                    .addGap(148, 148, 148))
                                .addComponent(txtDescripcionPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(checkBoxPostre))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDescripcionPostre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(costoPostre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnEliminar)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void costoPostreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costoPostreKeyReleased
        // TODO add your handling code here:

        if (!Validator.esFloat(costoPostre.getText())) {
            costoPostre.setText("");
            JOptionPane.showMessageDialog(null, "Costo de Postre Inválido");
        }
    }//GEN-LAST:event_costoPostreKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Postre nuevaPostre = new Postre(Float.parseFloat(costoPostre.getText()), txtDescripcionPostre.getText());

        nuevaPostre.setActivo(checkBoxPostre.isSelected());
        try {
            if (postre == null) {
                restaurant.agregarProducto(nuevaPostre);
                JOptionPane.showMessageDialog(rootPane, "Nuevo Postre agregado con exito! ");
            } else {
                restaurant.modificarProducto(nuevaPostre);
                JOptionPane.showMessageDialog(rootPane, "Postre Modificado con exito ");
            }

            callback.onSuccess(restaurant);

        } catch (ExcepcionLogica ex) {
            Logger.getLogger(AltaBebida.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            restaurant.eliminarProducto(postre);
            JOptionPane.showMessageDialog(rootPane, "Postre Eliminado con exito ");

            callback.onSuccess(restaurant);
        } catch (ExcepcionLogica ex) {
            Logger.getLogger(AltaPostre.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JCheckBox checkBoxPostre;
    private javax.swing.JTextField costoPostre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtDescripcionPostre;
    // End of variables declaration//GEN-END:variables
}
