package ch04homework_exercises;

public class Exercise04 {
//	 04. while���� Math.random() �޼ҵ带 �̿��ؼ� 
//		�� ���� �ֻ����� ������ �� ������ ����(��1, ��2) ���·� ����ϰ�, 
//		���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ���� ���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ��غ�����. 
//		���� ���� 5�� �Ǵ� ������ (1,4), (4,1), (2,3), (3,2) �Դϴ�.
	
	
	public static void main(String[] args) {

		int n1, n2, result;
		
		while(true) {
			n1 = (int)(Math.random()*6+1);
			n2 = (int)(Math.random()*6+1);
			result = n1+n2;
			
			System.out.println(n1+"+"+n2+"="+result);
			
			if(result != 5) {
				continue;
			} else {
				System.out.println("���� 5�� �Ǿ����ϴ�. ���α׷��� �����մϴ�.");
				break;
			}

		}
		
	}
}
