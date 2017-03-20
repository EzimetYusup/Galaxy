package collection;


import java.lang.*;
import java.lang.Comparable;

/**
 * Created by yyakup on 2/14/17.
 */
public class Car implements Comparable<Car> {
    private int year;
    private String name;


    public Car(int year, String name) {
        this.year = year;
        this.name = name;
    }
    public int getCar() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int compareTo(Car o) {
        int result = this.year - (o.year + o.name.indexOf("A"));
        return this.year - (o.year + o.name.indexOf("A"));
    }
    @Override
    public String toString() {
         return  this.name;
    }
}
