package ru.lmars.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Calculator calculator = applicationContext.getBean(Calculator.class);
		calculator.Run(1, 2);
	}
}
