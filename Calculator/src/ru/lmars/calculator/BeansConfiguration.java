package ru.lmars.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration
{
	@Bean
	public Calculator calculator()
	{
		return new Calculator(addOperation(), consoleResultWriter());
	}
	
	@Bean
	public Operation addOperation()
	{
		return new AddOperation();
	}
	
	@Bean
	public ResultWriter consoleResultWriter()
	{
		return new ConsoleResultWriter();
	}
}
