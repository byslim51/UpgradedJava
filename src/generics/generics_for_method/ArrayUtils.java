package generics.generics_for_method;

import java.lang.reflect.Array;

public class ArrayUtils {
    public static <T> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public <K> K[] swap1(K[] array) {
        return array;
    }
}
