package ru.lmars.calculator;

import org.springframework.stereotype.Service;

@Service
public class ConsoleLogger implements Logger
{
	@Override
	public void LogMessage(String message)
	{
		System.out.print(message);
	}
}
