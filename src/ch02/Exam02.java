package ch02;

public class Exam02 {

	public static void main(String[] args) {
		// �ڵ� Ÿ�� ��ȯ
				byte var1 = 10;
				int var2 = var1;
				
				
				// ���� Ÿ�� ��ȯ
				int var3 = 1000;
				byte var4 = (byte)var3;
				
//				System.out.println(var2);
//				System.out.println(var4);
//				
				//------------------------------------
				
				//�ڵ� Ÿ�� ��ȯ (������ �Ǽ����� �׻� ���� ����)
				long var5 = 10;
				float var6 = var5;
				
				//���� Ÿ�� ��ȯ (�Ǽ��� �������� �׻� ū ����)
				float var7 = 10.5f; 
				long var8 = (long) var7;
//				System.out.println(var8);
				
				
				//--------------------------------
				
				double var9 = 3.14;
				int var10 = (int)var9;
				System.out.println(var10);		
	}

}
