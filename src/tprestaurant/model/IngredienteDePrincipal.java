package tprestaurant.model;

import tprestaurant.model.enums.UnidadesDeMedida;

public class IngredienteDePrincipal extends Ingrediente {

    private float cantidadUtilizada;

    public IngredienteDePrincipal(float cantidadUtilizada) {
        this.cantidadUtilizada = cantidadUtilizada;
    }

    public IngredienteDePrincipal() {

    }

    public IngredienteDePrincipal(float cantidadUtilizada, float costoPorUnidad, UnidadesDeMedida unidad, String descripcion) {
        super(costoPorUnidad, unidad, descripcion);
        this.cantidadUtilizada = cantidadUtilizada;
    }

    /**
     * @return the cantidadUtilizada
     */
    public float getCantidadUtilizada() {
        return cantidadUtilizada;
    }

    /**
     * @param cantidadUtilizada the cantidadUtilizada to set
     */
    public void setCantidadUtilizada(float cantidadUtilizada) {
        this.cantidadUtilizada = cantidadUtilizada;
    }
}
