package pl.mizuirokoala.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mizuirokoala.model.School;
import pl.mizuirokoala.repository.SchoolRepository;

@Controller
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    SchoolRepository schoolRepository;

    @GetMapping("/allSchools")
    public String allSchools(Model model) {
        model.addAttribute("schools", this.schoolRepository.findAll());
        return "school/allSchools";
    }

    @GetMapping("/create")
    public String createSchool(Model model) {
        model.addAttribute("school", new School());
        return "school/createSchool";
    }

}










