package streams.example;

import java.util.List;
import java.util.stream.Collectors;

public class Peek {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> doubledNumbers = numbers.stream()
                .peek(num -> System.out.println("До умножения: " + num))  // Выводим начальные значения
                .map(num -> num * 2)  // Удваиваем значение
                .peek(num -> System.out.println("После умножения: " + num))  // Выводим результат после умножения
                .collect(Collectors.toList());  // Собираем результат в список

        System.out.println("Результат: " + doubledNumbers);
    }
}
