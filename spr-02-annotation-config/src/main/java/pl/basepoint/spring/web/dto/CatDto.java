package pl.basepoint.spring.web.dto;

/**
 * @author Marcin Górski <mg@mgorski.net>
 */
public class CatDto {

    private String name;

    public CatDto() {
    }

    public CatDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CatDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
