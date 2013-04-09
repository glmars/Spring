package ru.lmars.calculator;

public class Calculator
{
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
