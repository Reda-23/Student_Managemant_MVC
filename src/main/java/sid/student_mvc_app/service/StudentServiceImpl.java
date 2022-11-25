package sid.student_mvc_app.service;

import org.springframework.stereotype.Service;
import sid.student_mvc_app.entity.Student;
import sid.student_mvc_app.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
