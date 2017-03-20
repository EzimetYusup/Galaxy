import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by yyakup on 2/7/17.
 */
public class RestCall {


    @Test
    public void testGETCall () {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            BufferedReader bo = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));

            while (bo.readLine() != null) {
               if (bo.readLine().equalsIgnoreCase("id")) {
                   System.out.print(bo.readLine());

               };
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
