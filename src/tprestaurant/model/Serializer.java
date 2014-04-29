package tprestaurant.model;

import com.thoughtworks.xstream.*;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class Serializer {
    public static void guardarArchivo(String path,Restaurant ob) throws ExcepcionLogica{ 
        XStream xs = new XStream();
		
		try{
			FileOutputStream fs = new FileOutputStream(path);
			xs.toXML(ob,fs);
			
		}catch (FileNotFoundException e){
			throw new ExcepcionLogica("No se encontro: "+ path);
		}
    }
  
    public static Restaurant cargarArchivo(String path) throws ExcepcionLogica{
	
	XStream xs = new XStream(new DomDriver());
		
		try{
			FileInputStream fi = new FileInputStream(path);
			Restaurant a = new Restaurant();
			xs.fromXML(fi,a);
			return a;
			
		}catch (FileNotFoundException e){
			throw new ExcepcionLogica("No se encontro: "+ path);
		}
	}
}
