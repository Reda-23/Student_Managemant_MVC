package sid.student_mvc_app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sid.student_mvc_app.service.StudentServiceImpl;

@Controller
public class StudentController {
    private final StudentServiceImpl studentService;

    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/home")
    public String getStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "home";
    }
}
