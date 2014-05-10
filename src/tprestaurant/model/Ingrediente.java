/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant.model;

import tprestaurant.model.enums.UnidadesDeMedida;

/**
 *
 * @author Usuario
 */
public class Ingrediente {

    public Ingrediente() {
        this.costoPorUnidad = 0;
        this.unidad = UnidadesDeMedida.kg;
        this.descripcion = "";
    }
    
    public Ingrediente(float costoPorUnidad, UnidadesDeMedida unidad, String descripcion) {
        this.costoPorUnidad = costoPorUnidad;
        this.unidad = unidad;
        this.descripcion = descripcion;
    }
    
    private float costoPorUnidad;
    private UnidadesDeMedida unidad;
    private String descripcion;
    
    /**
     * @return the costoPorUnidad
     */
    public float getCostoPorUnidad() {
        return costoPorUnidad;
    }

    /**
     * @param costoPorUnidad the costoPorUnidad to set
     */
    public void setCostoPorUnidad(float costoPorUnidad) {
        this.costoPorUnidad = costoPorUnidad;
    }

    /**
     * @return the unidad
     */
    public UnidadesDeMedida getUnidad() {
        return unidad;
    }

    /**
     * @param unidad the unidad to set
     */
    public void setUnidad(UnidadesDeMedida unidad) {
        this.unidad = unidad;
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
    
    
    @Override
    public boolean equals(Object o) {
        
        if(!(o instanceof Ingrediente))
            return false;
        
        return this.descripcion.equals(((Ingrediente)o).getDescripcion());
    }
}
