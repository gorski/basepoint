package pl.basepoint.spring.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import pl.basepoint.spring.web.controller.CatController;
import pl.basepoint.spring.web.model.Cat;
import pl.basepoint.spring.web.repository.CatRepository;
import pl.basepoint.spring.web.service.CatService;

/**
 * @author Marcin Górski <mg@mgorski.net>
 */
@Configuration
@EnableWebMvc
public class WebConfig {

    @Bean
    public ViewResolver viewResolver() {
        return new InternalResourceViewResolver();
    }

    @Bean
    public Cat zoe() {
        return new Cat("Zoe");
    }

    @Bean
    public Cat cali() {
        return new Cat("Cali");
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
