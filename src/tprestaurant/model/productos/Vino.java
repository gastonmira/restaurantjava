package tprestaurant.model.productos;

import tprestaurant.model.enums.Provincias;
import tprestaurant.model.enums.Varietales;

public class Vino extends Bebida {

    private Varietales varietal;
    private Provincias provincia;

    public Vino(Varietales varietal, Provincias provincia) {
        this.varietal = varietal;
        this.provincia = provincia;
    }

    public Vino(Varietales varietal, Provincias provincia, float p, String desc) {
        super(p, desc);
        this.varietal = varietal;
        this.provincia = provincia;
    }

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

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Vino)) {
            return false;
        }

        return this.getDescripcion().equals(((Vino) o).getDescripcion());
    }
}
