package ch05;

public class Exam08 {

	public static void main(String[] args) {
		int[][] scores = { 
				{10, 20}, 
				{15, 25, 35}, 
				{45, 55, 65, 75}
		};
		
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		System.out.println(scores[2].length);

		for(int i =0; i<scores.length; i++) {
			int[] ban = scores[i];
			for(int k=0; k<ban.length; k++) {
				System.out.print(ban[k]+",");
			}
			System.out.println();
		}
	}

}