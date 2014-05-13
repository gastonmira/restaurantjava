/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Caster
 */
public class CargaTest {
    
    public CargaTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cargaIngredientes method, of class Carga.
     */
    @Test
    public void testCargaIngredientes() {
        System.out.println("cargaIngredientes");
        String ubicacion = "";
        String ingredientes = "";
        Restaurant rest = null;
        Carga instance = new Carga();
        instance.cargaIngredientes(ubicacion, ingredientes, rest);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
