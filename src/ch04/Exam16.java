package ch04;

import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		// Ű����� �Է��� ������ �ޱ� ���� Scanner ����
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("����1 : ");
			double num1 = Double.parseDouble(scanner.nextLine());

			System.out.print("����2 : ");
			double num2 = Double.parseDouble(scanner.nextLine());

			double result = num1 + num2;
			System.out.println("��� : "+result+"\n"					+ "");
		}

	}
}
