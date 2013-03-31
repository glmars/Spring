package ru.lmars.calculator;

import org.springframework.stereotype.Service;

@Service
public class ConsoleResultWriter implements ResultWriter
{
	@Override
	public void Write(int result)
	{
		System.out.print(result);
	}
}
