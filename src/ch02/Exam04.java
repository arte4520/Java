package ch02;

public class Exam04 {

	public static void main(String[] args) {
	//문자열 => 숫자(정수, 실수)
		
		//문자열은 String 타입변수에 저장
		
		String var1 = "10";
		System.out.println(var1+50);
		
		String var2 = "12";
		System.out.println(var1+var2);
		
		int var3 = 20;
		System.out.println(var1+var3);
		
		int temp = Integer.parseInt(var1);
		System.out.println(var3+temp); 
		
		String var4 = "10.5";
		Double var5 = Double.parseDouble(var4) + 2.3;
		System.out.println(var5);
		
		//숫자 => 문자열
		int var6 = 3;
		System.out.println(Integer.toString(var6) + "0");
		
		String var8 = String.valueOf(3);

	}

}
