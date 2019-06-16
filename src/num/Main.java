package num;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main (String args[]){
        Locale locale = new Locale("En", "USA");
    // Formatting numeric values to string
        double dVal = 1_567_123.0;
        //Numberformat helper class is used to format into string

        NumberFormat nF = NumberFormat.getNumberInstance(locale);
        System.out.println("nF is: " + nF.format(dVal));

        //Currency instance
        NumberFormat cF = NumberFormat.getCurrencyInstance();
        System.out.println("CF: " + cF.format(dVal));
        //integer format

        NumberFormat intF = NumberFormat.getIntegerInstance();
        System.out.println("int is :" + intF.format(dVal));
    }
}
