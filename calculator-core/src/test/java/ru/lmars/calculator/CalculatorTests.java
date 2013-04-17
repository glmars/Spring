package ru.lmars.calculator;

import org.jmock.integration.junit4.JUnitRuleMockery;
import org.jmock.Expectations;
import org.junit.Rule;
import org.junit.Test;

public class CalculatorTests
{
	@Test
	public void testRun()
	{
		final Operation operationMock = mockCtx.mock(Operation.class);
		final ResultWriter resultWriterMock = mockCtx.mock(ResultWriter.class);
		
		mockCtx.checking(new Expectations()
		{{
			oneOf(operationMock).Run(1, 2); will(returnValue(3));
			oneOf(resultWriterMock).Write(3);
		}});
		
		Calculator calculator = new Calculator(operationMock, resultWriterMock);
		calculator.Run(1, 2);
	}

	@Rule public JUnitRuleMockery mockCtx = new JUnitRuleMockery();
}
