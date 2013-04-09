package ru.lmars.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator
{
	@Autowired
	public Calculator(Operation operation, ResultWriter resultWriter, Logger logger)
	{
		this.operation = operation;
		this.resultWriter = resultWriter;
		this.logger = logger;
	}
	
	public void Run(int left, int right)
	{
		logger.LogMessage("Start calculation");
		resultWriter.Write(operation.Run(left, right));
	}
	
	private Operation operation;
	private ResultWriter resultWriter;
	private Logger logger;
}
