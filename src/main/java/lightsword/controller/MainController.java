package lightsword.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by michael on 8/2/17.
 */
@RestController
public class MainController {

    @RequestMapping("/hello")
    public ModelAndView hello(Model model) {
        ModelAndView modelAndView = new ModelAndView("index");
        String hello = "Hello World";
        model.addAttribute("hello", hello);
        return modelAndView;
    }
}
