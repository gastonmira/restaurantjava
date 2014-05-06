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
}
