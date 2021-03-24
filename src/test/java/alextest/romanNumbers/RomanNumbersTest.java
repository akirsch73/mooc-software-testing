package alextest.romanNumbers;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import alex.romanNumbers.RomanNumbers;

@DisplayName("ClassName by @DisplayName annotation")
@Tag("Classgenerall")
public class RomanNumbersTest {
	int x =0;

	@Test
	@DisplayName("MethodName by @DisplayName annotation")
	@Tag("Methodspecial")
	public void testRomanConvert() {
		RomanNumbers testCase = new RomanNumbers();
		String[] value = { "CM", "XVX", "XC", "MMXXI", "MCMLXXXIV" };
		int[] numbers = { 900, 15, 90, 2021, 1984 };
		for (x = 0; x < value.length; x++) {
			int result = testCase.convert(value[x]);
			System.out.println("Der Wert ist: " + result);
			assertAll("by default, something went wrong", 
					() -> assertEquals(result, numbers[x])
					);
		}

	}
}
