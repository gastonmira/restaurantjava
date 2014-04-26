/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant.model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Principal extends Producto {

    public Principal() {
        this.ingredientes = new ArrayList<IngredienteDePrincipal>();
        this.porcentajeGanancia = 0;
        setDescripcion("");
    }
    
    public Principal(ArrayList<IngredienteDePrincipal> ingredientes, float porcentajeGanancia, String desc) {
        this.ingredientes = new ArrayList<IngredienteDePrincipal>(ingredientes);
        this.porcentajeGanancia = porcentajeGanancia;
        setDescripcion(desc);
    }

    private ArrayList<IngredienteDePrincipal> ingredientes;
    private float porcentajeGanancia;

    @Override
    public float costo() {
        float result = 0;
        for(IngredienteDePrincipal ing: ingredientes)
        {
            result += ing.getCostoPorUnidad()*ing.getCantidadUtilizada();
        }
        return result;
    }

    /**
     * @return the porcentajeGanancia
     */
    @Override
    public float getPorcentajeGanancia() {
        return porcentajeGanancia;
    }

    /**
     * @param porcentajeGanancia the porcentajeGanancia to set
     */
    public void setPorcentajeGanancia(float porcentajeGanancia) {
        this.porcentajeGanancia = porcentajeGanancia;
    }
}
