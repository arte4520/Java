package ch03;

public class Exam01 {

	public static void main(String[] args) {
		int var1 = 1;
		
		var1 = var1 + 1;
		var1 += 1;
		
		var1++;
		
		// �ڹٴ� ���� / (������)�� ����� �����Դϴ�.
		
		int var4 = 11;
		
		int var5 = 4;
		
		double var6 = (float)var4/var5;
		
		System.out.println(var6);
		System.out.println(var4/var5);
		
		//������ ���ϱ�
		
		int var8 = var4 % var5;
		
		System.out.println(var8);
		
	}

}
