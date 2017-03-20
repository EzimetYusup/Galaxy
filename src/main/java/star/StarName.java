package star;

/**
 * Created by yyakup on 6/16/16.
 */
public enum StarName {
    EARTH("MOTHER_EARTH"),
    SATURIN("ENIGHBOUR_SATURIN");

    private String value;


     StarName(String n) {
        this.value = n;
    }
    public String value() {

        return value;
    }


}
