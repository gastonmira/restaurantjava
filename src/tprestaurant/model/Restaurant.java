package tprestaurant.model;

import tprestaurant.model.productos.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author jmdapice
 */
public class Restaurant implements Serializable {
    
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
     * @return productos por tipo
     * @param type recibe nombre de la clase a filtrar
     */
    public TreeSet<Producto> getProductosByType(String type) {
        TreeSet<Producto> result = new TreeSet<Producto>();
        for (Iterator<Producto> it = productos.iterator(); it.hasNext();) 
        {
            Producto p = it.next();
            if(p.getClass().getSimpleName().equals(type))
            {
                result.add(p);
            } 
        }
        
        return result;
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
    
    public void agregarProducto(Producto p) throws ExcepcionLogica
    {
        if(productos.contains(p))
        {
            throw new ExcepcionLogica("El producto ya existe");
        }
        productos.add(p);
    }
    
    public void modificarProducto(Producto p) throws ExcepcionLogica
    {
        if(!productos.contains(p))
        {
            throw new ExcepcionLogica("El producto no existe");
        }
        //como es un treeset reemplaza el objeto
        productos.add(p);
    }
    
    public void eliminarProducto(Producto p) throws ExcepcionLogica
    {
        if(!productos.contains(p))
        {
            throw new ExcepcionLogica("El producto no existe");
        }
        
        if(productoActivoEnMenu(p))
        {
            throw new ExcepcionLogica("No se pudo eliminar el producto. Forma parte de un menu");
        }
        
        //como es un treeset reemplaza el objeto
        productos.remove(p);
    }
    
    /**
     * 
     * @param key cadena parcial a buscar en descripcion
     * @return 
     */
    public TreeSet<Producto> buscarProducto(String key)
    {
        TreeSet<Producto> result = new TreeSet<Producto>();
        for (Iterator<Producto> it = productos.iterator(); it.hasNext();) 
        {
            Producto p = it.next();
            if(p.getDescripcion().toLowerCase().startsWith(key.toLowerCase()))
            {
                result.add(p);
            } 
        }
        
        return result;
    }
    /**
     * 
     * @param type tipo del objeto a buscar
     * @param key cadena parcial a buscar en descripcion
     * @return 
     */
    public TreeSet<Producto> buscarProductoPorTipo(String type, String key)
    {
        TreeSet<Producto> result = new TreeSet<Producto>();
        for (Iterator<Producto> it = productos.iterator(); it.hasNext();) 
        {
            Producto p = it.next();
            if(p.getClass().getSimpleName().equals(type) 
                    && p.getDescripcion().toLowerCase().startsWith(key.toLowerCase()))
            {
                result.add(p);
            } 
        }
        
        return result;
    }
    
    public Menu getMenuVigente()
    {
        for(Menu m : menus)
        {
            if(m.getFechaVigenciaFinal() == null)
            {
                return m;
            }
        }
        
        return null;
    }
    
    public void generarNuevoMenu(Date fechaInicio, String desc)
    {
        ajustarFechaFinalVigente(fechaInicio);
        
        Menu m = new Menu();
        m.setFechaVigenciaInicial(fechaInicio);
        m.setDescripcion(desc);
        
        for(Producto p : productos)
        {
            if(p.isActivo())
            {
                m.agregarProducto(p);
            }
        }
        
        menus.add(m);
    }

    private void ajustarFechaFinalVigente(Date fechaInicio) {
        Menu menuAnterior = getMenuVigente();
        if(menuAnterior != null)
        {
            Calendar cal = Calendar.getInstance();
            cal.setTime(fechaInicio);
            cal.add(Calendar.DATE,1);
        
            menuAnterior.setFechaVigenciaFinal(cal.getTime());
        }
    }

    private boolean productoActivoEnMenu(Producto p) 
    {
        for(Menu m: menus)
        {
            for(ItemMenu i : m.getProductos())
            {
                if(i.getProducto().equals(p))
                {
                    return true;
                }
            }
        }
        
        return false;
    }
}
