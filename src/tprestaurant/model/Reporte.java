

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
        for(ItemMenu i: menu1.getProductos()){
            Iterator<ItemMenu> it = menu2.getProductos().iterator();
            while(it.hasNext() && !(i.getProducto().getDescripcion().equals(it.next().getProducto().getDescripcion()) ) && (i.getPrecio() == it.next().getPrecio() ) ){
                
            }
            
            if(it.hasNext()){
                if ((i.getProducto().getDescripcion().equals(it.next().getProducto().getDescripcion()) )&& (i.getPrecio() != it.next().getPrecio() )) {
                    Cambio c = new Cambio();
                    c.setDescripcion(it.next().getProducto().getDescripcion());
                    c.setPrecioNuevo(it.next().getPrecio());
                    c.setPrecioViejo(i.getPrecio());
                    c.setTransicion("Cambio de Precio");
                    lista.add(c);
                }
            }else
            {
                Cambio c = new Cambio();
                c.setDescripcion(it.next().getProducto().getDescripcion());
                c.setPrecioNuevo(it.next().getPrecio());
                c.setPrecioViejo(0);
                c.setTransicion("Producto Eliminado");
                lista.add(c);
            }
        }
        //Busco en el menu 2 recorriendo todos para ver si estan en el menu1.
        for(ItemMenu m2: menu2.getProductos()){
            Iterator<ItemMenu> itm1 = menu1.getProductos().iterator();
            while(itm1.hasNext() && !(m2.getProducto().getDescripcion().equals(itm1.next().getProducto().getDescripcion()))){
            }
            //Si recorri y itm1 no tiene siguiente entonces es un nuevo producto
            if (!(itm1.hasNext())){
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
}
