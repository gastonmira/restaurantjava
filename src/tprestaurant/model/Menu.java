/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant.model;

import tprestaurant.model.productos.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Menu implements Serializable {

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
     * @param productos the productos to set
     */
    public void setProductos(ArrayList<ItemMenu> productos) {
        this.productos = productos;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
        String header =  "Descripcion: "+descripcion+"\n"+
                         "Fecha Inicio: "+fechaVigenciaInicial.toString()+"\n"+
                         "Fecha Fin: "+fechaVigenciaFinal != null ? fechaVigenciaFinal.toString() : "menu vigente"+"\n"+
                         "-------------------------------------------\n\n"+
                         "Ingredientes: \n";
        String productosString = "";
        for(ItemMenu i : productos)
        {
            productosString+=i.getProducto().getDescripcion()+" $"+Float.toString(i.getPrecio())+"\n";
        }
        
        return header+productosString;
    }
}
