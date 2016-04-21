package pl.basepoint.spring.web.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import pl.basepoint.spring.web.model.Cat;

import java.util.Arrays;
import java.util.List;

/**
 * Repository of {@link Cat} objects.
 *
 * @author Marcin Górski <mg@mgorski.net>
 */
public class CatRepository {

    @Autowired
    @Qualifier("zoe")
    private Cat cat1;

    @Autowired
    @Qualifier("cali")
    private Cat cat2;


    public List<Cat> getCats() {
        return Arrays.asList(cat1, cat2);
    }

}
