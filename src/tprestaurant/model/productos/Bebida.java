package tprestaurant.model.productos;

import java.io.Serializable;

public class Bebida extends Producto implements Serializable {

    private float precioVenta;
    
    public Bebida()
    {
        precioVenta = 0;
        setDescripcion("");
        setActivo(true);
    }
    
    public Bebida(float p, String desc)
    {
        precioVenta = p;
        setDescripcion(desc);
        setActivo(true);
    }
    
    @Override
    public float precio()
    {
        return getPrecioVenta();
    }
    
    @Override
    public float costo() {
        return 0;
    }

    @Override
    public float getPorcentajeGanancia() {
        return 0;
    }

    /**
     * @return the precioVenta
     */
    public float getPrecioVenta() {
        return precioVenta;
    }

    /**
     * @param precioVenta the precioVenta to set
     */
    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    @Override
    public boolean equals(Object o) {
        
        if(!(o instanceof Bebida))
            return false;
        
        return this.getDescripcion().equals(((Bebida)o).getDescripcion());
    }
}
