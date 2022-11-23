package sid.student_mvc_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sid.student_mvc_app.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
