package pl.basepoint.spring.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.basepoint.spring.web.dto.CatDto;
import pl.basepoint.spring.web.model.Cat;
import pl.basepoint.spring.web.repository.CatRepository;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Marcin Górski <mg@mgorski.net>
 */
public class CatService {

    @Autowired
    private CatRepository catRepository;

    public List<CatDto> getCats() {
        List<Cat> cats = catRepository.getCats();
        List<CatDto> mapped = new LinkedList<CatDto>();
        for (Cat cat : cats) {
            mapped.add(new CatDto(cat.getName()));
        }
        return mapped;
    }
}
