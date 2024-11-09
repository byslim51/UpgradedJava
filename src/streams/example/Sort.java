package streams.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(4);
        list.add(7);
        list.add(5);
        list.add(10);
        list.add(9);
        list.add(1);

        System.out.println(list);
        list = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list);
    }
}
