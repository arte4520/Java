package ch04homework_exercises;

public class Exercise05 {
	// 중첩 for문을 이용하여 방정식 4x + 5y = 60 의 모든 해를 구해서 (x,y)형태로 출력해보세요.
	// 단, x와 y는 10 이하의 자연수입니다.

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
