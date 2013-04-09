package ru.lmars.calculator;

import org.jmock.integration.junit3.MockObjectTestCase;
import org.jmock.Expectations;

public class CalculatorTests extends MockObjectTestCase
{
	public void testRun()
	{
		final Operation operationMock = mock(Operation.class);
		final ResultWriter resultWriterMock = mock(ResultWriter.class);
		final Logger loggerMock = mock(Logger.class);
		
		checking(new Expectations()
		{{
			oneOf(operationMock).Run(1, 2); will(returnValue(3));
			oneOf(resultWriterMock).Write(3);
		}});
		
		Calculator calculator = new Calculator(operationMock, resultWriterMock, loggerMock);
		calculator.Run(1, 2);
	}

}
