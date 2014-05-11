

package tprestaurant.model;


public class Cambio {
    private float precioViejo;
    private float precioNuevo;
    private String descripcion;
    private String transicion;

    /**
     * @return the precioViejo
     */
    public float getPrecioViejo() {
        return precioViejo;
    }

    /**
     * @param precioViejo the precioViejo to set
     */
    public void setPrecioViejo(float precioViejo) {
        this.precioViejo = precioViejo;
    }

    /**
     * @return the precioNuevo
     */
    public float getPrecioNuevo() {
        return precioNuevo;
    }

    /**
     * @param precioNuevo the precioNuevo to set
     */
    public void setPrecioNuevo(float precioNuevo) {
        this.precioNuevo = precioNuevo;
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

    /**
     * @return the transicion
     */
    public String getTransicion() {
        return transicion;
    }

    /**
     * @param transicion the transicion to set
     */
    public void setTransicion(String transicion) {
        this.transicion = transicion;
    }
    
}
