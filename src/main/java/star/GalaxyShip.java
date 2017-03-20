package star;


import java.io.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.*;

/**
 * Created by yyakup on 6/7/16.
 *
 */
public class GalaxyShip {


    public static void main(String[] args) {
    //   testDate();
     //   testNumber();
     //   GenericStar<Star> g = new GenericStar<Star>();
        testProperties();
    }


    public static void testDate() {
        Locale locIt = new Locale("it");
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.HOUR0_FIELD, locIt);
        DateFormat dfUS = DateFormat.getDateInstance();
        System.out.println("Italy: " + df.format(new Date()));
        System.out.println("US: "  + dfUS.format(new Date()));

    }
    public static void testNumber() {
        Locale locIt = new Locale("fr");
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(10000));
    }
    public static void testProperties() {
          Properties pr = new Properties();
        try {
            BufferedInputStream io = new BufferedInputStream(new FileInputStream(new File("/Users/yyakup/Documents/dev/Galaxy/src/main/resources/app.properites")));
            pr.load(io);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        System.out.print(pr.getProperty("app.name"));
        Set<Map.Entry<Object, Object>> sets = System.getProperties().entrySet();
        Iterator<Map.Entry<Object, Object>> it = sets.iterator();
        System.out.println("The size :" + sets.size());

        while(it.hasNext())
        {
            Map.Entry<Object, Object>  entry = it.next();
            System.out.println("The key: " + entry.getKey());
            System.out.println("The value: " + entry.getValue());

        }

    }
}
