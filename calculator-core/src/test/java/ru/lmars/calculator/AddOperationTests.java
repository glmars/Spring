package ru.lmars.calculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class AddOperationTests
{
	@Test
	public void sumWithZero()
	{
		assertEquals(1, new AddOperation().Run(0, 1));
	}

	@Test
	public void sumWithNegative()
	{
		assertEquals(-3, new AddOperation().Run(0, -3));
	}
}
