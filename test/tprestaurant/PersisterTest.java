/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant;

import java.io.File;
import java.util.ArrayList;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import tprestaurant.model.ExcepcionLogica;
import tprestaurant.model.Menu;
import tprestaurant.model.Restaurant;
import tprestaurant.model.enums.Provincias;
import tprestaurant.model.enums.Varietales;
import tprestaurant.model.productos.Bebida;
import tprestaurant.model.productos.Entrada;
import tprestaurant.model.productos.Postre;
import tprestaurant.model.productos.Producto;
import tprestaurant.model.productos.Vino;

/**
 *
 * @author jmdapice
 */
public class PersisterTest {
    
    Restaurant rest;
    Menu menu;
    private static final String filePath = "file.xml";
    
    public PersisterTest() {
    }
            
    @Before
    public void setUp() {
        rest = new Restaurant();
        menu = new Menu();
        Producto p1 = new Entrada(10, 15,"jamon con rusa");
        Producto p2 = new Entrada(20, 15,"jamon crudo con rusa");
        Producto p3 = new Vino(Varietales.Cabernet,Provincias.Buenos_Aires);
        p3.setDescripcion("valmont");
        ((Bebida)p3).setPrecioVenta(100);
        Producto p4 = new Postre(23, "flan");
        Postre.setPorcentajeGanancia(100);
        
        File file = new File(filePath);
        file.delete();
        
        try
        {
            rest.agregarProducto(p1);
            rest.agregarProducto(p2);
            rest.agregarProducto(p3);
            rest.agregarProducto(p4);
            menu.agregarProducto(p1);
            menu.agregarProducto(p2);
            menu.agregarProducto(p3);
            menu.agregarProducto(p4);
            ArrayList<Menu> menus = new ArrayList<Menu>();
            menus.add(menu);
            rest.setMenus(menus);
        }
        catch(ExcepcionLogica ex)
        {
                
        }
    }
    
    @After
    public void tearDown() {
        rest = null;
        File file = new File(filePath);
        file.delete();
    }

    @Test
    public void testGuardarCargarRestaurant() {
        System.out.println("cargarRestaurant");
        Persister.guardarRestaurant(filePath, rest);
        rest = null;
        rest = Persister.cargarRestaurant(filePath);
        assertEquals(rest.getProductos().size(),4);
        assertEquals("jamon con rusa", ((Producto)rest.getProductos().toArray()[0]).getDescripcion());
        assertEquals("jamon crudo con rusa", ((Producto)rest.getProductos().toArray()[1]).getDescripcion());
        assertEquals("flan", ((Producto)rest.getProductos().toArray()[2]).getDescripcion());
        assertEquals("valmont", ((Producto)rest.getProductos().toArray()[3]).getDescripcion());
    }
}
