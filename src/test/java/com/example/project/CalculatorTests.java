package com.example.project;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Random;

class CalculatorTests {

	private final Calculator calculator = new Calculator();
	private final Random random = new Random();

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Assertions.assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    -1,   -1",
			"1,    2,   6",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int first, int second, int expectedResult) {
		Assertions.assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}

	@Test
	@DisplayName("Test Divide same numbers")
	void testValidInput() {
		double randomValue = 1 + (1000 - 1) * random.nextDouble();

		double result = Calculator.divide(randomValue, randomValue);
		Assertions.assertEquals(1, result);
	}

	@Test
	@DisplayName("Test Divide Method with numerator as zero")
	void testNumeratorZero() {
		double result = Calculator.divide(0.0, 2.0);
		Assertions.assertEquals(0.0, result);
	}

	@Test
	@DisplayName("Test Divide Method with denominator as zero")
	void testDenominatorZero() {
		Assertions.assertThrows(ArithmeticException.class, () -> {
			Calculator.divide(10.0, 0.0);
		});
	}

	@Disabled("Disabled until bug #42 has been resolved")
	@Test
	void testWillBeSkipped() {

	}
}
