package streams.example;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("OK");
        list.add("poka");

        list.stream().forEach(element -> System.out.println(element));

        System.out.println();

        list.stream().forEach(element -> {element = "Привет";
            System.out.println(element);});
    }
}
