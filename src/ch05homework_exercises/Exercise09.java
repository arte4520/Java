package ch05homework_exercises;

import java.util.Scanner;
//09. ������ Ű����κ��� �л� ���� �� �л����� ������ �Է¹޾Ƽ� 
//�ְ� ���� �� ��� ������ ���ϴ� ���α׷��Դϴ�. 
//���� ����� ���� �˸°� �ۼ��� ������.
//(����� 16���ο��� Scanner�� nextlnt() �޼ҵ�� �ֿܼ� �Էµ� ���ڸ� �а� �����մϴ�.)

public class Exercise09 {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("------------------------------------");
			System.out.print("����> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "]> ");
					int temp = scanner.nextInt();
					scores[i] = temp;

				}

			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}

			} else if (selectNo == 4) {
				int sum = 0;
				int max = 0;
				double avg = 0.0;
				for (int i = 0; i < scores.length; i++) {
					sum = sum + scores[i];
					if (scores[i] > max)
						max = scores[i];

				}
				avg = (double) sum / studentNum;

				System.out.println("�ְ� ����> " + max);
				System.out.println("��� ����> " + avg);

			} else if (selectNo == 5) {

				run = false;
			}

		}
		System.out.println("���α׷� ����");
	}

}
