package lambda;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student st1 = new Student("Oleg", 2, 20);
        Student st2 = new Student("Anton", 3, 21);
        Student st3 = new Student("Aleksey", 3, 21);

        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);

        StudentTest studentTest = new StudentTest();
        // С лямбдой
        studentTest.testStudents(studentList, (Student s) -> {return s.getAge() < 30;});

        // Без лямбды:
        studentTest.testStudents(studentList, new StudentCheck() {
            @Override
            public boolean studentCheck(Student s) {
                return s.getAge()<30;
            }
        });

    }
}
