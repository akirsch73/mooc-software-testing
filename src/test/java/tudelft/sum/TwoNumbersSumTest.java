package tudelft.sum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class TwoNumbersSumTest {

	@Test
	public void testSum() {
		TwoNumbersSum sum = new TwoNumbersSum();
		int[] number1 = {1, 2};
		int[] number2 = {99, 1};
		int[] result3 = {100, 3};

		for (int counter = 0; counter < number1.length; counter++) {
			ArrayList<Integer> result = sum.addTwoNumbers(intToList(number1[counter]), intToList(number2[counter]));
			String strResult = "";

			for (Integer c : result) {
				strResult = strResult + String.valueOf(c);
			}
			int intResult = Integer.parseInt(strResult);
			Assert.assertEquals(counter, intResult, result3[counter] );// counter, intResult, result3[counter]
			System.out.println(counter +" "+intResult+" "+result3[counter]);
		}
	}

	public ArrayList<Integer> intToList(int number) {
		String numberStr = String.valueOf(number);
		ArrayList<Integer> intList = new ArrayList<Integer>();
		for (char c : numberStr.toCharArray()) {
			int cifer = Integer.parseInt(String.valueOf(c));
			intList.add(cifer);
		}
		return intList;
	}

}
