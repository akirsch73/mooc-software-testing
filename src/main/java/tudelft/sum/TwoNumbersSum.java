package tudelft.sum;

import java.util.ArrayList;
import java.util.Collections;

// Source: https://leetcode.com/problems/add-two-numbers/description/
class TwoNumbersSum {

	public ArrayList<Integer> addTwoNumbers(ArrayList<Integer> first, ArrayList<Integer> second) {
		Collections.reverse(first);
		Collections.reverse(second);

		int complement = 0;
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < Math.max(first.size(), second.size())+1; i++) {
			int firstVal = i < first.size() ? first.get(i) : 0;
			int secondVal = i < second.size() ? second.get(i) : 0;
			int total = firstVal + secondVal + complement;
//			complement = 0;
			if (total >= 10) {
				complement = 1;
				total -= 10;
			}
			result.add(i, total);
		}

		Collections.reverse(result);
		return result;
	}

	public static void main(String[] args) {
		TwoNumbersSum sum = new TwoNumbersSum();
		ArrayList<Integer> value1 = new ArrayList<Integer>();
		value1.add(9);
		value1.add(9);

		ArrayList<Integer> value2 = new ArrayList<Integer>();

		value2.add(1);
		System.out.println(sum.addTwoNumbers(value1, value2));

	}

}
