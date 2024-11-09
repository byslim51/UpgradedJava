package streams.example;

import java.util.stream.Stream;

public class Count {
    public static void main(String[] args) {
        Stream<Integer> stream2 = Stream.of(10, 11, 12, 11);
        System.out.println(stream2.count());
    }
}
