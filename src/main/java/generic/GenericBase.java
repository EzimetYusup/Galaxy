package generic;

/**
 * Created by yyakup on 2/7/17.
 */
public class GenericBase<T extends Number, Y extends String> {
    public T tt;
    public Y yy;
    public int add() {
       return tt.intValue() + yy.hashCode();
    }
    public GenericBase(T tt, Y yy) {
             this.tt = tt;
             this.yy = yy;
    }
}
