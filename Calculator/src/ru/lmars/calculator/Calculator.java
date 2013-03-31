package ru.lmars.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator
{
	@Autowired
	public Calculator(Operation operation, ResultWriter resultWriter)
	{
		this.operation = operation;
		this.resultWriter = resultWriter;
	}
	
	public void Run(int left, int right)
	{
		resultWriter.Write(operation.Run(left, right));
	}
	
	private Operation operation;
	private ResultWriter resultWriter;
}
