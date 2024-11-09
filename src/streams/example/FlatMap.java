package streams.example;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> studentsCourses = List.of(
//               List.of - Создание неизменяемого списка
                List.of("Математика", "Физика"),
                List.of("История", "Литература"),
                List.of("Биология", "Химия", "Физика")
        );

        List<String> allCourses = studentsCourses.stream()
                .flatMap(List::stream)  // Разворачиваем каждый внутренний список в поток элементов
                .distinct()  // Убираем дубликаты
                .collect(Collectors.toList());  // Собираем результат в один список

        System.out.println("Все уникальные курсы: " + allCourses);
    }
}
