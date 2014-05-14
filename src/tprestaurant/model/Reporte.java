

package tprestaurant.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import tprestaurant.Persister;
import tprestaurant.model.productos.*;


public class Reporte {
    
    public List<Cambio> menuModificacion(Menu menu1, Menu menu2){
        List<Cambio> lista = new ArrayList<Cambio>();
        ItemMenu aux = null;
        for(ItemMenu i: menu1.getProductos()){
            aux = buscarPorDescripcionDeProducto(menu2.getProductos(), i.getProducto().getDescripcion());
            if(aux == null)
            {
                Cambio c = new Cambio();
                c.setDescripcion(i.getProducto().getDescripcion());
                c.setPrecioNuevo(0);
                c.setPrecioViejo(i.getPrecio());
                c.setTransicion("Producto Eliminado");
                lista.add(c);
            }
            else
            {
                if(aux.getPrecio() != i.getPrecio())
                {
                    Cambio c = new Cambio();
                    c.setDescripcion(i.getProducto().getDescripcion());
                    c.setPrecioNuevo(aux.getPrecio());
                    c.setPrecioViejo(i.getPrecio());
                    c.setTransicion("Cambio de Precio");
                    lista.add(c);
                }
            }
        }
        //Busco en el menu 2 recorriendo todos para ver si estan en el menu1.
        for(ItemMenu m2: menu2.getProductos()){
            aux = buscarPorDescripcionDeProducto(menu1.getProductos(), m2.getProducto().getDescripcion());
            if (aux == null){
               Cambio c = new Cambio();
               c.setDescripcion(m2.getProducto().getDescripcion());
               c.setPrecioNuevo(m2.getPrecio());
               c.setPrecioViejo(0);
               c.setTransicion("Nuevo Producto");
               lista.add(c);
            }
        }
        
        Persister.generarTxt(lista, "Reporte_Modificacion_Menu.txt");
        return lista;
    }
    
    public List<Producto> rankingPrecios(List<String> grupos, Restaurant rest)
    {
        ArrayList<Producto> result = new ArrayList<Producto>();

        if(grupos!=null && rest!=null)
        {
            Collections.sort(grupos);
            for(String grupo: grupos)
            {
                for(Producto p: rest.getProductosByType(grupo))
                {
                    if(p.isActivo())
                    {
                        result.add(p);
                    }
                }
            }
        
            Collections.sort(result, new Comparator<Producto>() {
                public int compare(Producto c1, Producto c2) {
                    return (int)(c2.precio() - c1.precio());
                }
            });
        }
       Persister.generarTxt(result, "Reporte_Ranking.txt");
       return result;
    }
    
    private ItemMenu buscarPorDescripcionDeProducto(ArrayList<ItemMenu> productos, String desc)
    {
        for(ItemMenu i : productos)
        {
            if(i.getProducto().getDescripcion().equals(desc))
            {
                return i;
            }
        }
        
        return null;
    }
}
