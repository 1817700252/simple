package day01_demo04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		InputStreamReader stdin = null;
		BufferedReader bufferReader = null;
		stdin = new InputStreamReader(System.in);
		bufferReader = new BufferedReader(stdin);
		try {
			System.out.print("����������A��");
			String numberA = bufferReader.readLine();
			System.out.print("��ѡ�������(+,-,*,/)��");
			String operator = bufferReader.readLine();
			System.out.print("����������B��");
			String numberB = bufferReader.readLine();
			String result = String.valueOf(Operation(Double
					.parseDouble(numberA),Double.parseDouble(numberB),operator));
			System.out.println("����ǣ�"+result);
		}catch(Exception ex) {
			System.out.println("����������"+ex.getMessage());
			ex.printStackTrace();
		}
	}

	private static char[] Operation(double parseDouble, double parseDouble2, String operator) {
		// TODO Auto-generated method stub
		return null;
	}
}
