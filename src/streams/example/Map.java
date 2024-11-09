package streams.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("OK");
        list.add("poka");

//       Без стрима:
        for (int i = 0; i < list.size(); i++) {
            list.set(i, String.valueOf(list.get(i).length()));
        }

//       Со стримом:
        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());

        System.out.println(list2);
    }

}
