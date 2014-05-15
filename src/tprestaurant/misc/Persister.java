package tprestaurant.misc;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import tprestaurant.model.ExcepcionLogica;
import tprestaurant.model.Restaurant;

public class Persister {

    public static void guardarRestaurant(String path, Restaurant rest) throws ExcepcionLogica {
        XStream xs = new XStream();
        try {
            FileOutputStream fileOutPut = new FileOutputStream(path);
            xs.toXML(rest, fileOutPut);
            fileOutPut.close();
        } catch (FileNotFoundException e1) {
            throw new ExcepcionLogica(e1.getMessage());
        } catch (IOException ex) {
            throw new ExcepcionLogica(ex.getMessage());
        }
    }

    public static Restaurant cargarRestaurant(String path) throws ExcepcionLogica {
        Restaurant rest = null;
        XStream xs = new XStream(new DomDriver());
        try {
            FileInputStream fileInput = new FileInputStream(path);
            rest = (Restaurant) xs.fromXML(fileInput);
            fileInput.close();
        } catch (FileNotFoundException ex) {
            throw new ExcepcionLogica(ex.getMessage());
        } catch (IOException ex) {
            throw new ExcepcionLogica(ex.getMessage());
        }

        return rest;
    }

    public static void generarTxt(List lista, String nombreArchivo) throws ExcepcionLogica {
        try {
            Persister.generarTxt(lista.toString(), nombreArchivo);
        } catch (ExcepcionLogica ex) {
            throw ex;
        }
    }

    public static void generarTxt(String texto, String nombreArchivo) throws ExcepcionLogica {
        String sFichero = nombreArchivo;
        File fichero = new File(sFichero);
        try {
            BufferedWriter buw = new BufferedWriter(new FileWriter(fichero));
            buw.write(texto);
            buw.close();
        } catch (IOException ioe) {
            throw new ExcepcionLogica(ioe.getMessage());
        }
    }
}
