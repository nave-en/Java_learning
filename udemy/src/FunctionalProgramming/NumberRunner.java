package FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 45, 7, 9);
		// displayNumbers(numbers);
//		displayOddNumbers(numbers);
//		displayEvenNumbers(numbers);
//		System.out.println("Sum of Numbers : " + sumOfNumbers(numbers));
//		System.out.println("Sum of Numbers Lamda : " + sumOfNumbersLambda(numbers));
		// squareOfNumbers(numbers);
//		List<String> words = List.of("Apple", "Bat", "Cat");
//		squareOf10Numbers();
//		System.out.println();
//		convertToLower(words);
//		System.out.println();
//		lengthOfWord(words);
//		List<Integer> evenNumbers = getEvenNumbers(numbers);
//		System.out.println(evenNumbers.toString());
		List<Integer> squaredNumbers = getSquareNumbers();
		System.out.println(squaredNumbers.toString());
		int maxNo = getMaxNumber(numbers);
		System.out.println("Max Number : " + maxNo);
	}

//	static int getMaxNumber(List<Integer> numbers) {
//		return numbers.stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2));
//	}

	static int getMaxNumber(List<Integer> numbers) {
		return numbers.stream().filter(n -> n % 2 == 0).max((n1, n2) -> Integer.compare(n1, n2)).orElse(0);
		/*
		 * return numbers.stream().filter(n -> n % 2 == 0) // Keep only even numbers
		 * .max(Integer::compare) // Find the maximum value .orElseThrow(() -> new
		 * IllegalArgumentException("No even numbers found")); // Handle empty result
		 */
	}

	static List<Integer> getSquareNumbers() {
		return IntStream.range(1, 11).map(e -> e * e).boxed().collect(Collectors.toList());
	}

	static List<Integer> getEvenNumbers(List<Integer> numbers) {
		return numbers.stream().filter(no -> (no % 2 == 0)).collect(Collectors.toList());
	}

	static void lengthOfWord(List<String> words) {
		words.stream().map(word -> word.length()).forEach(word -> System.out.print(word + " -> "));
	}

	static void convertToLower(List<String> words) {
		words.stream().map(word -> word.toLowerCase()).forEach(word -> System.out.print(word + " -> "));
	}

	static void squareOf10Numbers() {
		IntStream.range(1, 11).map(e -> e * e).forEach(e -> System.out.print(e + " "));
	}

	static void displayNumbers(List<Integer> numbers) {
		numbers.stream().forEach(number -> System.out.println("Number : " + number));
	}

	static void displayOddNumbers(List<Integer> numbers) {
		numbers.stream().filter(element -> element % 2 != 0)
				.forEach(element -> System.out.println("Number : " + element));
	}

	static void displayEvenNumbers(List<Integer> numbers) {
		numbers.stream().filter(element -> element % 2 == 0)
				.forEach(element -> System.out.println("Number : " + element));
	}

	static int sumOfNumbers(List<Integer> numbers) {
		int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);

		return sum;
	}

	static int sumOfNumbersLambda(List<Integer> numbers) {
		// lambda expression with single line
//		return numbers.stream()
//				.reduce(0,
//						(number1, number2) -> number1 + number2
//				);
		// lambda expression with multiple line
		return numbers.stream().reduce(0, (number1, number2) -> {
			System.out.println("number 1 : " + number1);
			System.out.println("number 2 :  " + number2);

			return number1 + number2;
		});
	}

	static void squareOfNumbers(List<Integer> numbers) {
		numbers.stream().distinct().map(e -> e * e).forEach(e -> System.out.println(e));
	}
}
