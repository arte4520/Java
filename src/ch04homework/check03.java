package ch04homework;

public class check03 {
	// 03. for���� �̿��ؼ� 1���� 100������ ���� �߿��� 3�ǹ���� ���������ϴ� �ڵ带 �ۼ��غ�����.
	public static void main(String[] args) {

		int sum = 0;
		int i;

		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("1~100 ���� �� 3�� ��� ���� : " + sum);
	}

}
