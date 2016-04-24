package pl.basepoint.spring.web.config;

import org.springframework.web.context.support.GroovyWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Example MVC web.xml-less configuration.
 *
 * @author Marcin Górski <mg@mgorski.net>
 */
public class MvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        GroovyWebApplicationContext appContext = new GroovyWebApplicationContext();
        appContext.setConfigLocation("classpath:/applicationContext.groovy");

        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(appContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");

        servletContext.addFilter("encodingFilter", createEncodingFilter());

    }

    private Filter createEncodingFilter() {
        return new org.springframework.web.filter.CharacterEncodingFilter("UTF-8", true);
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


}
