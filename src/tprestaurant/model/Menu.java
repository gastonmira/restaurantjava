/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class Menu {

    //Coleccion de items (productos)
    private ArrayList<ItemMenu> bebidas;
    private ArrayList<ItemMenu> entradas;
    private ArrayList<ItemMenu> principales;
    private ArrayList<ItemMenu> postres;
    private ArrayList<ItemMenu> vinos;

    private Date fechaVigenciaInicial;
    private Date fechaVigenciaFinal;

    public Menu()
    {
        bebidas = new ArrayList<ItemMenu>();
        entradas = new ArrayList<ItemMenu>();
        principales = new ArrayList<ItemMenu>();
        postres = new ArrayList<ItemMenu>();
        vinos = new ArrayList<ItemMenu>();
        fechaVigenciaInicial = new Date();
    }

    public void Metodo()
    {
        ItemMenu bebida = null;
        Iterator<ItemMenu> itbebida = bebidas.iterator();
        while(itbebida.hasNext())
        {
            bebida = itbebida.next();
            //do something
        }
    }

}
