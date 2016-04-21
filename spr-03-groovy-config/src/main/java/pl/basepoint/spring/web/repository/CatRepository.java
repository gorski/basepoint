package pl.basepoint.spring.web.repository;

import org.springframework.stereotype.Repository;
import pl.basepoint.spring.web.model.Cat;

import java.util.List;

/**
 * Repository of {@link Cat} objects.
 *
 * @author Marcin Górski <mg@mgorski.net>
 */
@Repository
public class CatRepository {

    private List<Cat> cats;

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }
}
