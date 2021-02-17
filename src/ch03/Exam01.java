package ch03;

public class Exam01 {

	public static void main(String[] args) {
		int var1 = 1;
		
		var1 = var1 + 1;
		var1 += 1;
		
		var1++;
		
		// 자바는 정수 / (나눗셈)의 결과는 정수입니다.
		
		int var4 = 11;
		
		int var5 = 4;
		
		double var6 = (float)var4/var5;
		
		System.out.println(var6);
		System.out.println(var4/var5);
		
		//나머지 구하기
		
		int var8 = var4 % var5;
		
		System.out.println(var8);
		
	}

}
