package jaxb;

import design.Person;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by yyakup on 2/17/17.
 */
public class XMLbinding {


    public static void main(String[] args) throws IOException {

        URL url = new URL("https://jsonplaceholder.typicode.com/posts");
        InputStream io = url.openStream();
       // JAXBContext jaxbContext = new
//        Person person = new Person.PersonBuilder("yari", "yakup", "yes")
//                .createPerson();
//        try {
//            JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
//            Marshaller marshaller = jaxbContext.createMarshaller();
//            marshaller.marshal(person, new File("person.xml"));
//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//            marshaller.marshal(person, System.out);
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }
    }
}
