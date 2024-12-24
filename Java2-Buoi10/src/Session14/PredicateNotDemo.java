package Session14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotDemo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Predicate<Integer> isEven = n -> n % 2 == 0;

        List<Integer> oddNumbers = numbers.stream()
                                          .filter(Predicate.not(isEven))
                                          .collect(Collectors.toList());

        System.out.println("Odd numbers: " + oddNumbers);
	}
}
