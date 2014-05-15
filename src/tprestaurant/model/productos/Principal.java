package tprestaurant.model.productos;

import java.util.ArrayList;
import tprestaurant.model.IngredienteDePrincipal;

public class Principal extends Producto {

    public Principal() {
        this.ingredientes = new ArrayList<IngredienteDePrincipal>();
        this.porcentajeGanancia = 0;
        setDescripcion("");
        setActivo(true);
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
        for(IngredienteDePrincipal ing: getIngredientes())
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
    
    
    
    @Override
    public boolean equals(Object o) {
        
        if(!(o instanceof Principal))
            return false;
        
        return this.getDescripcion().equals(((Principal)o).getDescripcion());
    }

    /**
     * @return the ingredientes
     */
    public ArrayList<IngredienteDePrincipal> getIngredientes() {
        return new ArrayList<IngredienteDePrincipal>(ingredientes);
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(ArrayList<IngredienteDePrincipal> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public IngredienteDePrincipal getIngredienteDePrincipalbyDesc(String key)
    {
        for (IngredienteDePrincipal i:ingredientes) 
        {
            if(i.getDescripcion().equalsIgnoreCase(key))
            {
                return i;
            } 
        }
        
        return null;
    }
}
