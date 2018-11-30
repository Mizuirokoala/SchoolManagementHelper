package pl.mizuirokoala.testing;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/hello")
    @ResponseBody
    public String home() {
        return "helloThymeleaf";
    }

}

