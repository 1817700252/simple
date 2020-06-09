package day01_demo05;

import day01_demo05.OperationMul;
import day01_demo05.OperationSub;

public class OperationFactory {
	public static Operation createOperation(String operate) {
	Operation oper = null;
	if ("+".equals(operate)) oper = new OperationAdd();
	else if ("-".equals(operate)) oper = new OperationSub();
	else if ("*".equals(operate)) oper = new OperationMul();
	else if ("/".equals(operate)) oper = new OperationDiv();
	return oper;
	}
}
