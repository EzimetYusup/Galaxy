package generic;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by yyakup on 2/15/17.
 */
public class GenericInImpl<T extends Integer>{
    public   T t;

    public T getT() {
        return t;
    }
        public <V> GenericInImpl(V v) {

        }

    public void sort(ArrayList<? super ClassB> a) {
           //a.get(0)
    }
}
