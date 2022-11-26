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

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student) ;
    }

    @Override
    public Student findStudent(Long id) {
        return studentRepository.findStudentById(id);
    }

    @Override
    public Student updateStudent(Student student, Long id) {
        Student student1 = findStudent(id);
        student1.setFirstname(student.getFirstname());
        student1.setLastname(student.getLastname());
        student1.setEmail(student.getEmail());
        return studentRepository.save(student1);
    }

}
