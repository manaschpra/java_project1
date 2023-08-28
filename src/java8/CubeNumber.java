package java8;

import java.util.Arrays;
import java.util.List;

public class CubeNumber {

	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
		li.stream().map(i -> i * i * i)
		.filter(i -> i > 45)
		.forEach(System.out::println);

	}

}
