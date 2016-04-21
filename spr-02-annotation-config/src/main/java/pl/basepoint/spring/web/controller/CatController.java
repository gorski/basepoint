package pl.basepoint.spring.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.basepoint.spring.web.service.CatService;


@Controller
public class CatController {

    @Autowired
    private CatService catService;

    @RequestMapping("")
    public ModelAndView loadHomePage() {

        final ModelAndView mav = new ModelAndView("/WEB-INF/cat_list.jsp");
        mav.addObject("cats", catService.getCats());

        return mav;
    }
}
