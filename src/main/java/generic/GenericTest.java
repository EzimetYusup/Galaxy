package generic;

import org.junit.Test;

/**
 * Created by yyakup on 2/7/17.
 */
public class GenericTest {

    @Test
    public void testGeneric() {
           GenericBase<Double, String> genericBase = new GenericBase(new Double("121"), "Yari");
          System.out.println(genericBase.add());
    }

    @Test
    public void testGenericType() {
           Thread t = Thread.currentThread();
           System.out.print("");
//           GenericInImpl genericIn = new GenericInImpl(new Integer("123123123123"));
//           genericIn.t
    }
}
