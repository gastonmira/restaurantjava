package tprestaurant.model;

import java.util.ArrayList;

/**
 *
 * @author jmdapice
 */
public class Restaurant {
    
    private ArrayList<Menu> menus;
    private ArrayList<Producto> productos;
    private ArrayList<Ingrediente> ingredientes;
    
    public Restaurant()
    {
        menus = new ArrayList<Menu>();
        productos = new ArrayList<Producto>();
        ingredientes = new ArrayList<Ingrediente>();
    }
}
