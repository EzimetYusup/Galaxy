package design;

import org.junit.Test;

import java.util.Objects;

/**
 * Created by yyakup on 2/9/17.
 */
public class TestPattern {

    @Test
    public void testDesign() {
        Person person = new Person.PersonBuilder("","", "").
                firstName("Yari")
                .lastName("Yakup").createPerson();
        System.out.println();
    }
    @Test
    public void testObjectCreate() throws CloneNotSupportedException {
        try {
            ClassForNameObjectCreation obj = (ClassForNameObjectCreation) Class.forName("design.ClassForNameObjectCreation").newInstance();
            obj.print();


            ClassForNameObjectCreation obj1 = (ClassForNameObjectCreation) obj.clone();
            obj1.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
    }
    @Test
    public void testStaticObjectCreate() {
      System.out.print(StaticFactoryObjectCreation.createObject().getName());
    }

}
