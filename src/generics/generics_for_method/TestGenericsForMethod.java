package generics.generics_for_method;

public class TestGenericsForMethod {
    public static void main(String[] args) {
        String[] strArray = {"A", "B", "C"};

        // Меняем местами элементы массива
        ArrayUtils.swap(strArray, 0, 2);
        for (String s : strArray) {
            System.out.print(s + " ");  // Вывод: C B A
        }
    }
}
