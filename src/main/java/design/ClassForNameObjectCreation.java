package design;

/**
 * Created by yyakup on 2/9/17.
 */

/**
 * Make usre this class have default constructor for using Class.classforName().newInstance creation.
 * if u have any constructor rather than ClassForNameObjectCreation() it will blow up.
 * it should be public access.
 */
public class ClassForNameObjectCreation implements Cloneable {

    public void print() {
        System.out.println("Yes you being called");
    }

    @Override
    public ClassForNameObjectCreation clone() throws CloneNotSupportedException {
        return (ClassForNameObjectCreation) super.clone();
    }
}
