package Students;

import java.util.List;

public interface StudentRepository {
    List<Student> getAll();
    void xoa(int id);
    void capnhat(Student student);
    void them(Student student);
}
