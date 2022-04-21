package util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ConvertNumeric {
    private static final Locale LOCAL_PT_BR = new Locale("pt", "BR");
    private static final String PATTERN_TWO_DECIMAL = "#0.00";
    private static final String PATTERN_THREE_DECIMAL = "#0.000";

    public static Double stringToDouble(String value) throws ParseException {
        NumberFormat format = NumberFormat.getInstance(LOCAL_PT_BR);
        Number number = format.parse(value);
        return number.doubleValue();
    }

    public static String doubleToStringMoney(Double value) {
        NumberFormat format = new DecimalFormat(PATTERN_TWO_DECIMAL, getDecimalFormatSymbols(','));
        return format.format(value);
    }

    public static String doubleToStringScale(Double value) {
        NumberFormat format = new DecimalFormat(PATTERN_THREE_DECIMAL, getDecimalFormatSymbols('.'));
        return format.format(value);
    }

    private static DecimalFormatSymbols getDecimalFormatSymbols(char decimalSeparator){
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(LOCAL_PT_BR);
        symbols.setDecimalSeparator(decimalSeparator);
        return symbols;
    }

}
