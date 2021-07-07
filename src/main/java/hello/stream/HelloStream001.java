package hello.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class HelloStream001 {

	public static void main(String[] args) {

		final List<String> numTextList = Arrays.asList("0", "1", null);

		System.err.println(numTextList);

		final List<Integer> numList = numTextList.stream() //
				.filter((String numText) -> { //
					return Objects.nonNull(numText); //
				}) //
				.map((String numText) -> { //
					return Integer.parseInt(numText); //
				}) //
				.collect(Collectors.toList()); //

		System.err.println(numList);
	}

}
