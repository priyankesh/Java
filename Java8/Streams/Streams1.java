package Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams1 {
    public static void main(String[] args) {
        String vegetables = Stream.of("Carrot", "Cauliflower", "Beetroot", "Cabbage", "Garlic")
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(vegetables);
    }
}
