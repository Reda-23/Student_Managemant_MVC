package sid.student_mvc_app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sid.student_mvc_app.entity.Student;
import sid.student_mvc_app.repository.StudentRepository;

@SpringBootApplication
public class StudentMvcAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentMvcAppApplication.class, args);
    }


    @Bean
    CommandLineRunner start(StudentRepository studentRepository){
        return args -> {
                studentRepository.save(new Student(null,"Reda","Hajjaj","readhajjaj@gmail.com"));
                studentRepository.save(new Student(null,"Driss","Ihratten","drissKhanez7.com"));
                studentRepository.save(new Student(null,"Ali","Chkhiro","AliCh88@gmail.com"));
                studentRepository.save(new Student(null,"Youssef","BenElAbbas","youssefben30@gmail.com"));
        };
    }

}
