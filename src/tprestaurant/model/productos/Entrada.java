/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant.model.productos;

/**
 *
 * @author Usuario
 */
public class Entrada extends Producto {

    public Entrada() {
        this.costo = 0;
        this.porcentajeGanancia = 0;
        setDescripcion("");
        setActivo(true);
    }
    public Entrada(float costo, float porcentajeGanancia, String desc) {
        this.costo = costo;
        this.porcentajeGanancia = porcentajeGanancia;
        setDescripcion(desc);
        setActivo(true);
    }
    
    private float costo;
    private float porcentajeGanancia;

    @Override
    public float costo() {
        
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(float costo) {
        this.costo = costo;
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
        
        if(!(o instanceof Entrada))
            return false;
        
        return this.getDescripcion().equals(((Entrada)o).getDescripcion());
    }
}
