/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant.model.productos;

/**
 *
 * @author Usuario
 */
public class Postre extends Producto{

    public Postre() {
        this.costo = 0;
        setDescripcion("");
        setActivo(true);
    }
    
    public Postre(float costo, String desc) {
        this.costo = costo;
        setDescripcion(desc);
        setActivo(true);
    }
    
    private float costo;
    private static float porcentajeGanancia;

    /**
     * @return the porcentajeGanancia
     */
    @Override
    public float getPorcentajeGanancia() {
        return porcentajeGanancia;
    }

    /**
     * @param aPorcentajeGanancia the porcentajeGanancia to set
     */
    public static void setPorcentajeGanancia(float aPorcentajeGanancia) {
        porcentajeGanancia = aPorcentajeGanancia;
    }
    
    @Override
    public float costo() {
        return costo;
    }

    @Override
    public float precio() {
        return costo*((porcentajeGanancia/100)+1);
    }
    
    @Override
    public boolean equals(Object o) {
        
        if(!(o instanceof Postre))
            return false;
        
        return this.getDescripcion().equals(((Postre)o).getDescripcion());
    }

}
