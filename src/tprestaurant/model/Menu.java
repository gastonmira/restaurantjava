/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tprestaurant.model;

import tprestaurant.model.productos.Producto;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Menu implements Serializable {

    //Coleccion de items (productos)
    private ArrayList<ItemMenu> productos;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");

    private Date fechaVigenciaInicial;
    private Date fechaVigenciaFinal;

    private String descripcion;

    public Menu() {
        productos = new ArrayList<ItemMenu>();

        fechaVigenciaInicial = new Date();
        fechaVigenciaFinal = null;
        descripcion = "";
    }

    public void agregarProducto(Producto p) {
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
        return new ArrayList<ItemMenu>(productos);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String fechaFinal = "Menu Vigente";
        if (fechaVigenciaFinal != null) {
            fechaFinal = sdf.format(fechaVigenciaFinal);
        }

        return descripcion + " " + sdf.format(fechaVigenciaInicial) + "-" + fechaFinal;
    }

    public String toStringParaArchivo() {
        String fechaFinal = "Menu Vigente";
        if (fechaVigenciaFinal != null) {
            fechaFinal = sdf.format(fechaVigenciaFinal);
        }
        String header = "Descripcion: " + descripcion + "\n"
                + "Fecha Inicio: " + sdf.format(fechaVigenciaInicial) + "\n"
                + "Fecha Fin: " + fechaFinal + "\n"
                + "-------------------------------------------\n\n"
                + "Ingredientes: \n";
        String productosString = "";
        for (ItemMenu i : productos) {
            productosString += i.getProducto().getDescripcion() + " $" + Float.toString(i.getPrecio()) + "\n";
        }

        return header + productosString;
    }
}
