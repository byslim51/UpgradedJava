package generics.generics_for_field;

public class Wrapper {
    private Object value;  // Поле value, используем Object для хранения любого типа

    public <T> Wrapper(T value) {  // Конструктор с Generics только для поля
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
