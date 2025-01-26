package CharOperation;

public class CharUtil {
	char ch;

	public CharUtil(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

		for (char ch : vowels) {
			if (this.ch == ch) {
				return true;
			}
		}

		return false;
	}

	public boolean isDigit() {
		int digit = (int) this.ch;
		if (0 <= digit && digit <= 9) {
			return true;
		}

		return false;
	}

	public boolean isAlphabet() {
		if ((ch >= 65 && ch <= 91) || (ch >= 97 && ch <= 123)) {
			return true;
		}

		return false;
	}

	public boolean isConsonant() {
		if (isAlphabet() && !isVowel()) {
			return true;
		}

		return false;
	}

	public void printLowerCaseLetter() {
		if (this.ch >= 97 && this.ch <= 122) {
			System.out.println((char) this.ch);
		} else {
			System.out.println((char) (this.ch + 32));
		}
	}

	public void printUpperCaseLetter() {
		if (this.ch >= 65 && this.ch <= 90) {
			System.out.println(this.ch);
		} else {
			System.out.println((char) (this.ch - 32));
		}
	}
}
