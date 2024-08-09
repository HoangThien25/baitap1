package Students;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private  StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAll();
    }

    public void addStudent(Student student) {
        studentRepository.them(student);
    }

    public void updateStudent(Student student) {
        studentRepository.capnhat(student);
    }

    public void deleteStudent(int id) {
        studentRepository.xoa(id);
    }
}
