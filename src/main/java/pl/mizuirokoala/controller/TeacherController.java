package pl.mizuirokoala.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mizuirokoala.model.Teacher;

@Controller
@RequestMapping("/teacher")
public class TeacherController {


    @GetMapping("/allTeachers")
    public String all(Model model){
        return "teacher/allTeacher";
    }

    @GetMapping("/createTeacher")
    public String create(Model model){
        model.addAttribute("teacher",new Teacher());
        return "teacher/create";
    }


}