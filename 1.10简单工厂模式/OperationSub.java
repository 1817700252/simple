package day01_demo05;

public class OperationSub extends Operation{
	public double getResult() {
		double result = 0;
		result = getNumberA() - getNumberB();
		return result;
	}
}
