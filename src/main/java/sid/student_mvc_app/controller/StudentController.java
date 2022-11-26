package sid.student_mvc_app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sid.student_mvc_app.entity.Student;
import sid.student_mvc_app.service.StudentServiceImpl;

@Controller
public class StudentController {
    private final StudentServiceImpl studentService;

    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String getStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "home";
    }


    @GetMapping("/students/new")
    public String createStudent(Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return "create";
    }

    @PostMapping("/students")
    public String saveStudent( @ModelAttribute("student") Student student){
       studentService.saveStudent(student);
        return"redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String find(@PathVariable Long id,Model model){
        model.addAttribute("student",studentService.findStudent(id));
        return "edit";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,Model model , @ModelAttribute("student") Student student){
        model.addAttribute("student",studentService.updateStudent(student,id));
            return "redirect:/students";
    }
}
