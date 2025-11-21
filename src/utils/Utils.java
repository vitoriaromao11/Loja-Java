package utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

public class Utils {

    static NumberFormat numberFormat =
            new DecimalFormat("R$ #, ##0.00", new DecimalFormatSymbols());

    public static String doubleToString(Double value) {
        return numberFormat.format(value);
    }

}