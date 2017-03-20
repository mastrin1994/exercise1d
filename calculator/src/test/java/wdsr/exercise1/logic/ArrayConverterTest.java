package wdsr.exercise1.logic;

import org.junit.Test;

import wdsr.exercise1.conversions.ArrayConverter;

import org.junit.Before;

public class ArrayConverterTest {
	private ArrayConverter arrayConverter;

	@Before
	public void setup() {
		arrayConverter = new ArrayConverter();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConvertToInts_shouldRaiseAnExceptionForNullArgument() {
		// given
		String[] strings = null;

		// when
		ArrayConverter.convertToInts(strings);

		// then
		// empty
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConvertToInts_shouldRaiseAnExceptionForEmptyArgument() {
		// given
		String[] strings = {};

		// when
		ArrayConverter.convertToInts(strings);

		// then
		// empty
	}
}
