package Streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaysOfCreatingStream {
    public static void main(String[] args) {

        // 1 - String
        Stream<String> fruits = Stream.of("Apple", "Banana", "Papaya", "Kiwi");
        fruits.forEach(System.out::println);

        // 2 - Array
        String[] vegetables = {"Potato", "Tomato", "Onion"};
        Arrays.stream(vegetables).forEach(System.out::println);

        // 3 - Big Decimal
        Stream.iterate(BigDecimal.ONE, n -> n.add(BigDecimal.ONE))
                .limit(20)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // 4 - Date
        Stream.iterate(LocalDate.now(), localDate -> localDate.plusDays(1L))
                .limit(20)
                .forEach(System.out::println);

    }
}

