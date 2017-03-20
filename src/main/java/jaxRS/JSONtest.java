package jaxRS;

import org.junit.Test;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by yyakup on 2/17/17.
 */
public class JSONtest {

    @Test
    public void testCreateJson() throws IOException {
        URL url = new URL("https://jsonplaceholder.typicode.com/posts");
        InputStream io = url.openStream();
        JsonReader jsonReader = Json.createReader(io);
        JsonArray jsonArray = jsonReader.readArray();
        JsonWriter jsonWriter = Json.createWriter(new FileOutputStream(new File("TestJson.json")));
        jsonWriter.writeArray(jsonArray);
//        File file = new File("TestJson.json");
//        OutputStream outputStream = new FileOutputStream(file);
//        JsonWriter jsonWriter = Json.createWriter(outputStream);
//        JsonArrayBuilder jsonValues = Json.createArrayBuilder();
//        JsonObject jsonObject = Json.createObjectBuilder()
//                .add("Yari", "Yakup")
//                .add("phoneNumbers", Json.createArrayBuilder()
//                                .add(Json.createObjectBuilder()
//                                        .add("type", "mobile")
//                                        .add("number", "111-111-1111"))
//                                .add(Json.createObjectBuilder()
//                                .add("type", "home")
//                                .add("number", "222-222-2222")))
//                .add("Flag", true)
//                .add("Number", 12312313)
//                .build();
//        jsonWriter.writeObject(jsonObject);
    }
}
