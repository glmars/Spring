package ru.lmars.calculator;

public class ConsoleResultWriter implements ResultWriter
{
	@Override
	public void Write(int result)
	{
		System.out.print(result);
	}
}
