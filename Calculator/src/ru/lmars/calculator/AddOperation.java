package ru.lmars.calculator;

import org.springframework.stereotype.Service;

@Service
public class AddOperation implements Operation
{
	@Override
	public int Run(int left, int right)
	{
		return left + right;
	}
}
