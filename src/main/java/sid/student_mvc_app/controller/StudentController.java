package sid.student_mvc_app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import sid.student_mvc_app.service.StudentServiceImpl;

@Controller
public class StudentController {
    private final StudentServiceImpl studentService;

    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    public String getStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "home";
    }
}
