package day01_demo04;

public class OperationAdd extends Operation{
	public double getResult() {
		double result = 0;
		result = getNumberA() + getNumberB();
		return result;
	}
}
