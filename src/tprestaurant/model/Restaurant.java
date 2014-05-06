package tprestaurant.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author jmdapice
 */
public class Restaurant implements Serializable{
    
    private ArrayList<Menu> menus;
    private TreeSet<Producto> productos;
    private TreeSet<Ingrediente> ingredientes;
    
    public Restaurant()
    {
        menus = new ArrayList<Menu>();
        productos = new TreeSet<Producto>();
        ingredientes = new TreeSet<Ingrediente>();
    }

    public Restaurant(ArrayList<Menu> menus, TreeSet<Producto> productos, TreeSet<Ingrediente> ingredientes) {
        this.menus = menus;
        this.productos = productos;
        this.ingredientes = ingredientes;
    }

    /**
     * @return the menus
     */
    public ArrayList<Menu> getMenus() {
        return menus;
    }

    /**
     * @param menus the menus to set
     */
    public void setMenus(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    /**
     * @return the productos
     */
    public TreeSet<Producto> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(TreeSet<Producto> productos) {
        this.productos = productos;
    }

    /**
     * @return the ingredientes
     */
    public TreeSet<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(TreeSet<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
