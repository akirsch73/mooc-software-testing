package alextest.romanNumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import alex.romanNumbers.LeapYear;

public class testLeapYear {
	private LeapYear leapYear;

	@BeforeEach
	public void initialize() {
		this.leapYear = new LeapYear();
	}

	@Test
	public void testZero() {
//		LeapYear leapYear = new LeapYear();
		boolean result = leapYear.leapYearBy4Not100(0);
		System.out.println(result);
		assertTrue(result);
	}

	@Test
	public void test1900() {
		assertFalse(leapYear.leapYearBy4Not100(1900));
	}

	@Test
	public void test2000() {
		assertTrue(leapYear.leapYearBy4Not100(2000));
	}

	@Test
	public void test2021() {
		assertFalse(leapYear.leapYearBy4Not100(2021));
	}
	
	@Test
	public void test2020() {
		assertTrue(leapYear.leapYearBy4Not100(2020));
	}
	@Test
	public void testminus4() {
		assertTrue(leapYear.leapYearBy4Not100(-4));
	}
}
