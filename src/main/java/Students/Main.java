package Students;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Load cấu hình từ file XML
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


        StudentService studentService = context.getBean(StudentService.class);


        System.out.println("Danh sách học sinh ban đầu:");
        List<Student> students = studentService.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }


        studentService.addStudent(new Student(3,50, "Le Van C"));
        System.out.println("Sau khi thêm học sinh:");
        students = studentService.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }


        studentService.updateStudent(new Student(2, 99,"Tran Thi B Updated"));
        System.out.println(" Sau khi cập nhật học sinh:");
        students = studentService.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }

        // Xoá một học sinh
        studentService.deleteStudent(1);
        System.out.println("Sau khi xoá học sinh:");
        students = studentService.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
