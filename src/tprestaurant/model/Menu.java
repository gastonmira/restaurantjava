/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class Menu {

    //Coleccion de items (productos)
    private ArrayList<ItemMenu> productos;

    private Date fechaVigenciaInicial;
    private Date fechaVigenciaFinal;
    
    private String descripcion;

    public Menu()
    {
        productos = new ArrayList<ItemMenu>();
        
        fechaVigenciaInicial = new Date();
        fechaVigenciaFinal = null;
        descripcion = "";
    }

    public void agregarProducto(Producto p)
    {
        productos.add(new ItemMenu(p));
    }
    
    /**
     * @return the fechaVigenciaInicial
     */
    public Date getFechaVigenciaInicial() {
        return fechaVigenciaInicial;
    }

    /**
     * @param fechaVigenciaInicial the fechaVigenciaInicial to set
     */
    public void setFechaVigenciaInicial(Date fechaVigenciaInicial) {
        this.fechaVigenciaInicial = fechaVigenciaInicial;
    }

    /**
     * @return the fechaVigenciaFinal
     */
    public Date getFechaVigenciaFinal() {
        return fechaVigenciaFinal;
    }

    /**
     * @param fechaVigenciaFinal the fechaVigenciaFinal to set
     */
    public void setFechaVigenciaFinal(Date fechaVigenciaFinal) {
        this.fechaVigenciaFinal = fechaVigenciaFinal;
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
     * @return the productos
     */
    public ArrayList<ItemMenu> getProductos() {
        return productos;
    }

    /**
     * @param productos the bebidas to set
     */
    public void setBebidas(ArrayList<ItemMenu> productos) {
        this.productos = productos;
    }
}
