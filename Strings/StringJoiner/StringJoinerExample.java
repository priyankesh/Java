package StringJoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(":", "{", "}"); // delimiter, prefix, suffix
		sj.add("Ram").add("Shyam").add("Govind");
		System.out.println(sj.toString());

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		String commaSeparatedNumbers = numbers.stream().map(i -> i.toString()).collect(Collectors.joining(", "));
		System.out.println(commaSeparatedNumbers);
	}
}