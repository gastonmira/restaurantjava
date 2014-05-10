/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant.model.productos;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Bebida extends Producto implements Serializable {

    private float precioVenta;
    
    public Bebida()
    {
        precioVenta = 0;
        setDescripcion("");
    }
    
    public Bebida(float p, String desc)
    {
        precioVenta = p;
        setDescripcion(desc);
    }
    
    @Override
    public float precio()
    {
        return getPrecioVenta();
    }
    
    @Override
    public float costo() {
        return 0;
    }

    @Override
    public float getPorcentajeGanancia() {
        return 0;
    }

    /**
     * @return the precioVenta
     */
    public float getPrecioVenta() {
        return precioVenta;
    }

    /**
     * @param precioVenta the precioVenta to set
     */
    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

}
