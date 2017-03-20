package reflections;

import org.junit.Test;

/**
 * Created by yyakup on 2/22/17.
 */
public class TestClass {

    @Test
    public void testClass() throws ClassNotFoundException {
        ExperiementClass experiementClass = new ExperiementClass();
        // Using .class to get Class.
        Class clazz = ExperiementClass.class;
        // getting class loader
        ClassLoader classLoader = experiementClass.getClass().getClassLoader();
        // class for name
        Class clazz1 = Class.forName("reflections.ExperiementClass");

        //clazz.
    }

}
