package ru.lmars.calculator;

public class ConsoleLogger implements Logger
{
	@Override
	public void LogMessage(String message)
	{
		System.out.print(message);
	}
}
