/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant.model;

import tprestaurant.model.enums.UnidadesDeMedida;

/**
 *
 * @author jmdapice
 */
public class IngredienteDePrincipal extends Ingrediente {
    private int cantidadUtilizada;
    
    public IngredienteDePrincipal(int cantidadUtilizada) {
        this.cantidadUtilizada = cantidadUtilizada;
    }

    public IngredienteDePrincipal(int cantidadUtilizada, float costoPorUnidad, UnidadesDeMedida unidad, String descripcion) {
        super(costoPorUnidad, unidad, descripcion);
        this.cantidadUtilizada = cantidadUtilizada;
    }

    /**
     * @return the cantidadUtilizada
     */
    public int getCantidadUtilizada() {
        return cantidadUtilizada;
    }

    /**
     * @param cantidadUtilizada the cantidadUtilizada to set
     */
    public void setCantidadUtilizada(int cantidadUtilizada) {
        this.cantidadUtilizada = cantidadUtilizada;
    }
    
}
