package ru.lmars.calculator;

public class AddOperation implements Operation
{
	@Override
	public int Run(int left, int right)
	{
		return left + right;
	}
}
