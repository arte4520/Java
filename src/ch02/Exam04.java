package ch02;

public class Exam04 {

	public static void main(String[] args) {
	//���ڿ� => ����(����, �Ǽ�)
		
		//���ڿ��� String Ÿ�Ժ����� ����
		
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
		
		//���� => ���ڿ�
		int var6 = 3;
		System.out.println(Integer.toString(var6) + "0");
		
		String var8 = String.valueOf(3);

	}

}
