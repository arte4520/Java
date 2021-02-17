package ch02;

public class Exam01 {

	public static void main(String[] args) {
		//정수 타입의 변수 선언 값 저장
		byte var1 = 100; //-128~127
		short var2 = 1000; //
		int var3 = 1;
		long var4 = 100000L;
		
		//문자 타입의 변수 선언과 값 저장
		char var9 = 65; //음수 저장 불가
		char var10 = 'A';
		System.out.println(var9);
		System.out.println(var10);
		
		//실수 타입의 변수 선언과 ㄱ밧 저장
		float var5 = 0.12346579f;
		double var6 = 0.12346579;
		
		System.out.println(var5);
		System.out.println(var6);
		
		//논리 타입의 변수 선언과 값 저장
		boolean var7 = true;
		boolean var8 = false;
	}

}
