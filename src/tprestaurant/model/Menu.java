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
    
    private String descripcion;

    public Menu()
    {
        bebidas = new ArrayList<ItemMenu>();
        entradas = new ArrayList<ItemMenu>();
        principales = new ArrayList<ItemMenu>();
        postres = new ArrayList<ItemMenu>();
        vinos = new ArrayList<ItemMenu>();
        fechaVigenciaInicial = new Date();
        fechaVigenciaFinal = null;
        descripcion = "";
    }

    public void agregarVino(Vino v)
    {
        vinos.add(new ItemMenu(v));
    }
    
    public void agregarEntrada(Entrada v)
    {
        entradas.add(new ItemMenu(v));
    }
    
    public void agregarPrincipal(Principal v)
    {
        principales.add(new ItemMenu(v));
    }
    
    public void agregarPostre(Postre v)
    {
        postres.add(new ItemMenu(v));
    }
    
    public void agregarBebida(Bebida v)
    {
        bebidas.add(new ItemMenu(v));
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
     * @return the bebidas
     */
    public ArrayList<ItemMenu> getBebidas() {
        return bebidas;
    }

    /**
     * @param bebidas the bebidas to set
     */
    public void setBebidas(ArrayList<ItemMenu> bebidas) {
        this.bebidas = bebidas;
    }

    /**
     * @return the entradas
     */
    public ArrayList<ItemMenu> getEntradas() {
        return entradas;
    }

    /**
     * @param entradas the entradas to set
     */
    public void setEntradas(ArrayList<ItemMenu> entradas) {
        this.entradas = entradas;
    }

    /**
     * @return the principales
     */
    public ArrayList<ItemMenu> getPrincipales() {
        return principales;
    }

    /**
     * @param principales the principales to set
     */
    public void setPrincipales(ArrayList<ItemMenu> principales) {
        this.principales = principales;
    }

    /**
     * @return the postres
     */
    public ArrayList<ItemMenu> getPostres() {
        return postres;
    }

    /**
     * @param postres the postres to set
     */
    public void setPostres(ArrayList<ItemMenu> postres) {
        this.postres = postres;
    }

    /**
     * @return the vinos
     */
    public ArrayList<ItemMenu> getVinos() {
        return vinos;
    }

    /**
     * @param vinos the vinos to set
     */
    public void setVinos(ArrayList<ItemMenu> vinos) {
        this.vinos = vinos;
    }

}
