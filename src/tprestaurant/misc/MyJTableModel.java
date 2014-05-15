package tprestaurant.misc;

import javax.swing.table.DefaultTableModel;

public class MyJTableModel extends DefaultTableModel {
    private boolean editable;  
    
    public void setEditable(boolean editable) { this.editable = editable; }  
    @Override  
    public boolean isCellEditable(int row, int col) { return editable; }  
}  

