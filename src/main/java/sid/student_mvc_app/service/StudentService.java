package sid.student_mvc_app.service;

import sid.student_mvc_app.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);

    Student findStudent(Long id);
    Student updateStudent(Student student, Long id);

    void deleteStudent(Long id);
}
