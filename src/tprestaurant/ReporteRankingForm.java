package tprestaurant;

import java.util.List;
import tprestaurant.misc.MyJTableModel;
import tprestaurant.model.productos.Producto;

public class ReporteRankingForm extends javax.swing.JFrame {

    List<Producto> productos;
    private String[] colName = {"Nombre", "Tipo", "Precio"};

    /**
     * Creates new form ReporteRankingForm
     */
    public ReporteRankingForm(List<Producto> productos) {
        this.productos = productos;
        initComponents();
        setModel(productos);
    }

    private void setModel(List<Producto> productos) {
        MyJTableModel tbModel = new MyJTableModel();
        tbModel.addColumn(colName[0]);
        tbModel.addColumn(colName[1]);
        tbModel.addColumn(colName[2]);
        if (productos != null) {
            for (Producto p : productos) {
                String[] data = new String[3];

                data[0] = p.getDescripcion();
                data[1] = p.getDescripcion();
                data[2] = String.valueOf(p.precio());

                tbModel.addRow(data);
            }
            tablaReporteRanking.setModel(tbModel);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReporteRanking = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaReporteRanking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Tipo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(tablaReporteRanking);

        jLabel1.setText("Ranking de Productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaReporteRanking;
    // End of variables declaration//GEN-END:variables
}
