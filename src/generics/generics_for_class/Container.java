package generics.generics_for_class;

// Класс Container с Generics
public class Container<T> {
    private T item;  // Поле item типа T

    // Конструктор для инициализации item
    public Container(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
