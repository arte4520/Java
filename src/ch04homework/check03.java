package ch04homework;

public class check03 {
	// 03. for문을 이용해서 1부터 100까지의 정수 중에서 3의배수의 총합을구하는 코드를 작성해보세요.
	public static void main(String[] args) {

		int sum = 0;
		int i;

		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("1~100 범위 내 3의 배수 총합 : " + sum);
	}

}
