package ch04homework_exercises;

public class Exercise05 {
	// ��ø for���� �̿��Ͽ� ������ 4x + 5y = 60 �� ��� �ظ� ���ؼ� (x,y)���·� ����غ�����.
	// ��, x�� y�� 10 ������ �ڿ����Դϴ�.

	public static void main(String[] args) {
		int x, y, result;

		for (x = 1; x <= 10; x++) {
			for (y = 1; y <= 10; y++) {
				result = (4 * x) + (5 * y);
				if (result == 60) {
					System.out.println("(" + x + "," + y + ")");
				} else {
					continue;
				}
			}

		}

	}

}
