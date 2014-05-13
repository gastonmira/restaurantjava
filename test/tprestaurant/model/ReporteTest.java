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
    
    public ReporteTest() {
    }
    
    @Before
    public void setUp() {
        rest = new Restaurant();
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
//    @Test
//    public void testMenuModificacion() {
//      
//    }

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
