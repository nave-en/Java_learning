package CollectionPackage;

import java.util.HashMap;

public class DataTypeRunner {

	public static void main(String[] args) {
//		List<Character> chars = List.of('A', 'B', 'A', 'B');
//		Set<Character> res = new HashSet<>(chars);
//		System.out.println(res);
		String sentence = "I am new to Java";
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char ch : sentence.toCharArray()) {
			if (ch != ' ') {
				hm.put(ch, hm.getOrDefault(ch, 0) + 1);
			}
		}

		System.out.println(hm);
	}
}
