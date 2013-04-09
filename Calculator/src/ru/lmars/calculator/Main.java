package ru.lmars.calculator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(BeansConfiguration.class);
		try
		{
			Calculator calculator = appContext.getBean(Calculator.class);
			calculator.Run(1, 2);
		}
		finally
		{
			appContext.close();
		}
	}
}
