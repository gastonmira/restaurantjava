/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tprestaurant.model;

/**
 *
 * @author Usuario
 */
public class Vino extends Bebida {
    private Varietales varietal;
    private Provincias provincia;

    /**
     * @return the varietal
     */
    public Varietales getVarietal() {
        return varietal;
    }

    /**
     * @param varietal the varietal to set
     */
    public void setVarietal(Varietales varietal) {
        this.varietal = varietal;
    }

    /**
     * @return the provincia
     */
    public Provincias getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(Provincias provincia) {
        this.provincia = provincia;
    }
}
