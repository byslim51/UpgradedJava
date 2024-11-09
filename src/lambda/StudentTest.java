package lambda;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    void testStudents (List<Student> al, StudentCheck sc) {
        for (Student s: al) {
            if (sc.studentCheck(s)){
                System.out.println(s.getName());
            }
        }
    }
}
