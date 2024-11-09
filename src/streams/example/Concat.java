package streams.example;

import java.util.stream.Stream;

public class Concat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3);
        Stream<Integer> stream2 = Stream.of(10,11,12);

        Stream<Integer> result = Stream.concat(stream1, stream2);
        result.forEach(System.out::println);
    }
}
