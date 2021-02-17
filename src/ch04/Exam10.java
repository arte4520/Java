package ch04;

public class Exam10 {

	public static void main(String[] args) {
		boolean stop = false;
		int count = 0;
		
		while(!stop) {
			System.out.println("Hello");
			count++;
			if(count>=10) {
				stop = true;
			}
		}
		
		count = 0;
		while(count <= 10) {
			System.out.println("Hello");
			count++;
		}
		
		count = 0;
		do {
			System.out.println("Hello");
			count++;
		}while(count <= 10);
			
		
		
		
		
		
	}

}
