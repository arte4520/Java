package ch04homework_examples;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
			//0.1은 float 타입으로 정확하게 표현 불가
			//실제 더해지는 값은 0.1보다 약간 크므로
			//루프는 9번만 실행
		}
	}

}
