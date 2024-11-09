package streams.example;

import java.util.ArrayList;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
//       Позволяет сократить или "сжать" поток данных к одному значению, применяя функцию, которая последовательно обрабатывает элементы.
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();
        System.out.println(result);
    }
}
