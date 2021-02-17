package ch02;

public class Exam03 {

	public static void main(String[] args) {
		//int 타입 이하의 피연산자의 연산은 결과가 int
		
		byte var1 = 10;
		byte var2 = 20;
		int var3 = var1 + var2;
		//byte var3 = var1 + var2;

		int var4 = 10;
		long var5 = 20;
		long var6 = var4 + var5;
		
		System.out.println(var6);
	}

}
