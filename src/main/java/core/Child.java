package core;

/**
 * Created by yyakup on 2/6/17.
 */
public class Child extends Base {
    public static int baseNumber = 110000000;
    static {
        baseNumber++;

    }

    public void show() {
        System.out.print("Yes");
    }

}
