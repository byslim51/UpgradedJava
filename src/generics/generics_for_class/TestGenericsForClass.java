package generics.generics_for_class;

public class TestGenericsForClass {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>("Hello");
        System.out.println("String Container: " + stringContainer.getItem());

        Container<Integer> integerContainer = new Container<>(123);
        System.out.println("Integer Container: " + integerContainer.getItem());
    }
}
