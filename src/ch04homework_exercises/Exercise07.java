package ch04homework_exercises;

import java.util.Scanner;

public class Exercise07 {
// 07. while���� Scanner�� �̿��ؼ� Ű����κ��� �Էµ� �����ͷ�
// 		����, ���, ��ȸ, ���� ����� �����ϴ� �ڵ带 �ۼ��غ�����.
//		�� ���α׷��� �����Ű�� ������ ���� ���� ����� ���;� �մϴ�.

	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------");
			System.out.print("����> ");

			int chosen;

			chosen = Integer.parseInt(scanner.nextLine());
			if ((chosen >= 1 && chosen <= 4) == false) {
				System.out.println("1~4�� �޴� ���� ���� �޴��� �ٽ� ����ּ���.");
				System.out.print("����> ");
				continue;
			}
			int money;

			switch (chosen) {
			case 1:
				System.out.print("���ݾ�> ");
				money = Integer.parseInt(scanner.nextLine());
				balance = balance + money;
				continue;

			case 2:
				System.out.print("��ݾ�> ");
				money = Integer.parseInt(scanner.nextLine());
				balance = balance - money;
				continue;
			case 3:
				System.out.println("�ܰ�> " + balance);
				continue;
			case 4:
				break;
			}

			System.out.println("���α׷� ����");
			break;
		}
	}

}
