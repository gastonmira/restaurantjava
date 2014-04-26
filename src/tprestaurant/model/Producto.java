/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant.model;

/**
 *
 * @author Usuario
 */
public abstract class Producto {
    
    private String descripcion;
    
    public abstract float costo();
    public abstract float getPorcentajeGanancia();
    
    public float precio()
    {
        return costo()*((getPorcentajeGanancia()/100)+1);
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    

}
