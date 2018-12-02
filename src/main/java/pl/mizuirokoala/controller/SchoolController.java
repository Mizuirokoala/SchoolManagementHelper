package pl.mizuirokoala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mizuirokoala.model.School;

@Controller
@RequestMapping("/school")
public class SchoolController {

    @GetMapping("allSchools")
    public String showAll(Model m) {
        m.addAttribute("school",// );
        return "todo";
        // TODO: 01.12.18 do html to showing all school
    }


    @GetMapping("/schoolCreate")
    public String createNewSchool(Model m){
        m.addAttribute("school",new School());
        return "school/..";
    }


}









