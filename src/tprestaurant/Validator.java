/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;
import tprestaurant.model.ExcepcionLogica;

/**
 *
 * @author gastonmira
 */
public class Validator {
    
    
    
    public static boolean esFloat(String cadena)  {
         return Pattern.matches("^[0-9]{1,5}(\\.[0-9]{0,2})?$", cadena);   
       
    }
    
    public static boolean isFechaValida(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    
    
}
