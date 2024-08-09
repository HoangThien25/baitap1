package Students;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;
@Repository
public class StudentRepositoryImpl implements StudentRepository{
    private List<Student> students = new ArrayList<>();

    public StudentRepositoryImpl() {
        // Khởi tạo danh sách với ít nhất 2 học sinh ban đầu
        students.add(new Student(1, 30,"Nguyen van a"));
        students.add(new Student(2, 60,"Tran Thi B"));
    }
    @Override
    public List<Student> getAll() {
        return new ArrayList<>(students);
    }

    @Override
    public void xoa(int id) {
        students.removeIf(s -> s.getId() == id);
    }

    @Override
    public void capnhat(Student student) {
        for (Student s : students) {
            if (s.getId() == student.getId()) {
                s.setName(student.getName());
                break;
            }
        }
    }

    @Override
    public void them(Student student) {
        students.add(student);
    }
}
