package star;


import lombok.Data;

/**
 * Created by yyakup on 8/19/16.
 */

public class Star {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private String name;
    public String info;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Star)) return false;

        Star star = (Star) o;

        if (age != star.age) return false;
        return name != null ? name.equals(star.name) : star.name == null;

    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public Star(int age1, String name1) {
       this.age = age1;
       this.name = name1;
    }

//    public Star() {
//        super();
//    }
}
