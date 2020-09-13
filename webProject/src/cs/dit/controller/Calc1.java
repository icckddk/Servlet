package cs.dit.controller;

public class Calc1 {
	int result = 0;
	
	public Calc1(int num1, int num2, String op) {
		if(op.equals("+")) {
			result = num1 + num2;
		}
		else if(op.equals("-")) {
			result = num1 - num2;
		}
		else if (op.equals("*")) {
			result = num1 * num2;
		}
		else if (op.contentEquals("/")) {
			result = num1 / num2;
		}
	}

	public int getResult() {
		// TODO Auto-generated method stub
		return result;
	}

}
