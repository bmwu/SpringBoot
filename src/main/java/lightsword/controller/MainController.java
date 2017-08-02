package lightsword.controller;

import lightsword.dao.UserDao;
import lightsword.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by michael on 8/2/17.
 */
@RestController
public class MainController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/hello")
    public ModelAndView hello(Model model) {
        ModelAndView modelAndView = new ModelAndView("index");
        String hello = "Hello World";
        model.addAttribute("hello", hello);

        List<User> userList = userDao.findAll();
        model.addAttribute("userList", userList);
        return modelAndView;
    }

    @RequestMapping(value = "/testGet", method = RequestMethod.GET)
    @ResponseBody
    public String testGet() {
        return "this is a get request data";
    }

    @RequestMapping(value = "/testPost", method = RequestMethod.POST)
    @ResponseBody
    public String testPost(@RequestParam String username) {
        String result = "hello " + username;
        return result;
    }
}
