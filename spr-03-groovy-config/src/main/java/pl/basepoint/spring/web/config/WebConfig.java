package pl.basepoint.spring.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import pl.basepoint.spring.web.controller.CatController;
import pl.basepoint.spring.web.model.Cat;
import pl.basepoint.spring.web.repository.CatRepository;
import pl.basepoint.spring.web.service.CatService;

/**
 * @author Marcin Górski <mg@mgorski.net>
 */
@Configuration
public class WebConfig {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/iris/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Bean
    public Cat tiger() {
        return new Cat("Tiger");
    }

    @Bean
    public Cat shadow() {
        return new Cat("Shadow");
    }

    @Bean
    public CatRepository catRepository() {
        return new CatRepository();
    }

    @Bean
    public CatService catService() {
        return new CatService();
    }

    @Bean
    public CatController catController() {
        return new CatController();
    }
}
