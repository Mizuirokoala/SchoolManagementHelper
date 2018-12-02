package pl.mizuirokoala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //there will be UserService and Validation @Autowired
    @GetMapping("/")
    public String home() {

        return "home";
    }

    @GetMapping("/hello")
    public String hello(Model m) {
        return "home/hello";
    }

    @GetMapping("/login")
    public String login() {
        return "home/login";
    }


}
