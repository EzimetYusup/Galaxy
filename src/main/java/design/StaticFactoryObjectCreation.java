package design;

/**
 * Created by yyakup on 2/9/17.
 */
public class StaticFactoryObjectCreation {
    private String name;

    private StaticFactoryObjectCreation() {
          this.name = "Yari";

    }

    public String getName() {
        return this.name;
    }

    public static StaticFactoryObjectCreation createObject() {
          return new StaticFactoryObjectCreation();
    }
}
