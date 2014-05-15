/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant.model;

import tprestaurant.misc.Carga;
import java.util.ArrayList;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import tprestaurant.model.enums.UnidadesDeMedida;

/**
 *
 * @author Caster
 */
public class CargaTest {
    
    Restaurant rest;
    public CargaTest() {
    }
    
    @Before
    public void setUp() {
        rest = new Restaurant();
    }
    
    @After
    public void tearDown() {
        rest = null;
    }

    /**
     * Test of cargaIngredientes method, of class Carga.
     */
    @Test
    public void testCargaIngredientes() {
        System.out.println("cargaIngredientes");
        try
        {
            rest.setIngredientes(Carga.cargaIngredientes("ingredientesTest.txt"));
        }
        catch(ExcepcionLogica ex)
        {
            
        }
        ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>(rest.getIngredientes());
        assertEquals(rest.getIngredientes().size(), 2);
        assertEquals(ingredientes.get(0).getUnidad(), UnidadesDeMedida.litro);
        assertEquals(ingredientes.get(0).getDescripcion(), "crema");
        assertEquals(ingredientes.get(0).getCostoPorUnidad(), 2.0, 0);
        assertEquals(ingredientes.get(1).getUnidad(), UnidadesDeMedida.kg);
        assertEquals(ingredientes.get(1).getDescripcion(), "lomo");
        assertEquals(ingredientes.get(1).getCostoPorUnidad(), 10.0, 0);
    }
    
}
