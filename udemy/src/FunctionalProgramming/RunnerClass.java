package FunctionalProgramming;

import java.util.List;

public class RunnerClass {
	public static void main(String[] args) {
		List<String> fruits = List.of("Apple", "Banana", "Grape");
		fruits.stream().forEach(fruit -> System.out.println("Fruit : " + fruit));
	}
}
