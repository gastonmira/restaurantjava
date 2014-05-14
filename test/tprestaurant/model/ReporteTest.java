/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import tprestaurant.model.enums.Provincias;
import tprestaurant.model.enums.Varietales;
import tprestaurant.model.productos.*;

/**
 *
 * @author jmdapice
 */
public class ReporteTest {
    
    public Restaurant rest;
    public Menu menu;
    public ReporteTest() {
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
    }

    /**
     * Test of menuModificacion method, of class Reporte.
     */
    @Test
    public void testMenuModificacion() {
        Menu menu2 = new Menu();
        Producto p1 = new Entrada(10, 15,"vitel thone");
        menu2.agregarProducto(menu.getProductos().get(0).getProducto());
        menu2.agregarProducto(menu.getProductos().get(1).getProducto());
        menu2.agregarProducto(p1); //Producto Nuevo
        menu2.getProductos().get(0).setPrecio(2000); //Producto Modificado
        
        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(menu);
        menus.add(menu2);
        rest.setMenus(menus);
        
        Reporte instance = new Reporte();
        List<Cambio> cambios = instance.menuModificacion(menu, menu2);
        
        assertEquals(cambios.get(0).getDescripcion(),"jamon con rusa");
        assertEquals(cambios.get(0).getTransicion(),"Cambio de Precio");
        assertEquals(cambios.get(0).getPrecioNuevo(),2000,0);
        assertEquals(cambios.get(1).getTransicion(),"Producto Eliminado");
        assertEquals(cambios.get(2).getTransicion(),"Producto Eliminado");
        assertEquals(cambios.get(3).getTransicion(),"Nuevo Producto");
    }

    /**
     * Test of rankingPrecios method, of class Reporte.
     */
    @Test
    public void testRankingPrecios() {
        System.out.println("rankingPrecios");
        List<String> grupos = new ArrayList<String>();
        grupos.add("Entrada");
        grupos.add("Vino");
        grupos.add("Postre");
        
        Reporte instance = new Reporte();
        
        ArrayList<Producto> result = (ArrayList<Producto>)instance.rankingPrecios(grupos, rest);
        assertEquals("valmont", result.get(0).getDescripcion());
        assertEquals("flan", result.get(1).getDescripcion());
        assertEquals("jamon crudo con rusa", result.get(2).getDescripcion());
        assertEquals("jamon con rusa", result.get(3).getDescripcion());
    }
}
