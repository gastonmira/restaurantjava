/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant.misc;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class MyJTableModel extends DefaultTableModel {
    
    private boolean editable;  
  
    // copy constructors from DefaultTableModel that only call the super(...) constructor  
  
    public void setEditable(boolean editable) { this.editable = editable; }  
  
    @Override  
    public boolean isCellEditable(int row, int col) { return editable; }  
}  

