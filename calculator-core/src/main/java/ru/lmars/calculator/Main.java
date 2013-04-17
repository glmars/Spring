package ru.lmars.calculator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		try
		{
			Calculator calculator = applicationContext.getBean(Calculator.class);
			calculator.Run(1, 2);
		}
		finally
		{
			applicationContext.close();
		}
	}
}
