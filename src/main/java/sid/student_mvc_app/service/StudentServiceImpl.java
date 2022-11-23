package sid.student_mvc_app.service;

import sid.student_mvc_app.entity.Student;
import sid.student_mvc_app.repository.StudentRepository;

import java.util.List;

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
