package core;


import star.StarName;

/**
 * Created by yyakup on 6/16/16.
 */
public class Test {
    static  boolean check = true;

public static void main(String args[]) {
    Base base = new Child();
    System.out.println(new Child().baseNumber);
    System.out.println("Base: " + new Base().baseNumber);
    //System.out.print(check && false);
}

}
