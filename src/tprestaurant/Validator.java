/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tprestaurant;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.regex.Pattern;
import tprestaurant.model.ExcepcionLogica;

/**
 *
 * @author gastonmira
 */
public class Validator {
    
    
    
    public static boolean esFloat(String cadena)  {
            return Pattern.matches("^[0-9]{1.5}(&#092;&#046;[0-9]{0.2})?$", cadena);
    }
    
    

    
    
}
