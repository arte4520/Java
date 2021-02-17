package ch04homework_exercises;

import java.util.Scanner;

public class Exercise07 {
// 07. while문과 Scanner를 이용해서 키보드로부터 입력된 데이터로
// 		예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요.
//		이 프로그램을 실행시키면 다음과 같은 실행 결과가 나와야 합니다.

	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");

			int chosen;

			chosen = Integer.parseInt(scanner.nextLine());
			if ((chosen >= 1 && chosen <= 4) == false) {
				System.out.println("1~4번 메뉴 범위 내의 메뉴로 다시 골라주세요.");
				System.out.print("선택> ");
				continue;
			}
			int money;

			switch (chosen) {
			case 1:
				System.out.print("예금액> ");
				money = Integer.parseInt(scanner.nextLine());
				balance = balance + money;
				continue;

			case 2:
				System.out.print("출금액> ");
				money = Integer.parseInt(scanner.nextLine());
				balance = balance - money;
				continue;
			case 3:
				System.out.println("잔고> " + balance);
				continue;
			case 4:
				break;
			}

			System.out.println("프로그램 종료");
			break;
		}
	}

}
