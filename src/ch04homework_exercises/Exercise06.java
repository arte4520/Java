package ch04homework_exercises;

public class Exercise06 {
// 06. for문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해보세요.
	
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
