package alex.romanNumbers;

public class RomanNumbers {

	public int convert(String input) {
		int result = 0;
		char[] romanInput = input.toCharArray();
		int[] arabicOutput = new int[romanInput.length];
		for (int x = 0; x < romanInput.length; x++) {

			arabicOutput[x] = checkValue(romanInput[x]);

		}
		for (int i = 0; i < arabicOutput.length - 1; i++) {

			if (arabicOutput[i] < arabicOutput[i + 1]) {
				arabicOutput[i] = arabicOutput[i] * (-1);

			}

		}
		for (int i : arabicOutput) {
			result = result + i;
		}
		return result;
	}

	public int checkValue(char c) {
		int value = 0;

		if (c == 'I') {
			value = 1;
		}
		if (c == 'V') {
			value = 5;
		}
		if (c == 'X') {
			value = 10;
		}
		if (c == 'L') {
			value = 50;
		}
		if (c == 'C') {
			value = 100;
		}
		if (c == 'D') {
			value = 500;
		}
		if (c == 'M') {
			value = 1000;
		}
		return value;
	}

}
