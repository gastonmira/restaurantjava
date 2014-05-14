package tprestaurant;

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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tprestaurant.model.Restaurant;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmdapice
 */
public class Persister {
 
    public static void guardarRestaurant(String path, Restaurant rest)
    {
        XStream xs = new XStream();
        try {
            FileOutputStream fileOutPut = new FileOutputStream(path);
            xs.toXML(rest, fileOutPut);
            fileOutPut.close();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static Restaurant cargarRestaurant(String path)
    {
        Restaurant rest = null;
        XStream xs = new XStream(new DomDriver());
        try {
            FileInputStream fileInput = new FileInputStream(path);
            rest = (Restaurant)xs.fromXML(fileInput);
            fileInput.close();
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        
        return rest;
    }
    
    public static void generarTxt(List lista, String nombreArchivo){
        String sFichero = nombreArchivo;
        File fichero = new File(sFichero);
        try{
            BufferedWriter buw = new BufferedWriter(new FileWriter(fichero));
            buw.write(lista.toString());
            buw.close();
        }catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}