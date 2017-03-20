package star;

/**
 * Created by yyakup on 8/22/16.
 */
public class GenericStar<T extends Star> {
    T t;
    public GenericStar( ){
    }

    public String getInfo() {
     return   t.getInfo();
    }
}
