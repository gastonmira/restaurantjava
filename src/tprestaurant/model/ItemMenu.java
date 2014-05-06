/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant.model;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class ItemMenu implements Serializable {
    private Producto producto;
    private float precio;
    
    public ItemMenu(Producto producto) {
        this.producto = producto;
        this.precio = producto.precio();
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
