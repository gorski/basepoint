package pl.basepoint.spring.web.model;

/**
 * @author Marcin Górski <mg@mgorski.net>
 */
public class Cat implements Animal {

    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
