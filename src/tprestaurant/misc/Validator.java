package tprestaurant.misc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;

public class Validator {

    public static boolean esFloat(String cadena) {
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
