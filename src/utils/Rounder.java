package utils;

import java.text.DecimalFormat;

public class Rounder {
    //статический метод округления значений.
    public static String rounderNum(double num) {
        DecimalFormat decimalFormat = new DecimalFormat( "#.##" );
        return decimalFormat.format(num);
    }
}
