package streams.example.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilter {
    public static void main(String[] args) {

    Student s1 = new Student("Ivan", 2, 22);
    Student s2 = new Student("Oleg", 3, 21);
    Student s3 = new Student("Elena", 4, 23);
    Student s4 = new Student("Petr", 4, 30);
    Student s5 = new Student("Mariya", 3, 28);

    List<Student> sl = new ArrayList<>();

    sl.add(s1);
    sl.add(s2);
    sl.add(s3);
    sl.add(s4);
    sl.add(s5);

    sl = sl.stream().filter(element -> element.getAge() > 22 && element.getCourse()>2).collect(Collectors.toList());
        System.out.println(sl);
    }

}
