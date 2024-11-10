package generics.generics_for_field;

public class TestGenericsForField {
    public static void main(String[] args) {
        Wrapper integerWrapper = new Wrapper(42);
        Wrapper stringWrapper = new Wrapper("Hello");

        System.out.println("Integer Wrapper: " + integerWrapper.getValue());  // Вывод: 42
        System.out.println("String Wrapper: " + stringWrapper.getValue());    // Вывод: Hello
    }
}
