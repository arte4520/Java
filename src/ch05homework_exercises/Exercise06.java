package ch05homework_exercises;

//06. 배열의 길이에 대한 문제입니다. array.length의 값과 array[2].length의 값은 얼마입니까?
public class Exercise06 {

	public static void main(String[] args) {
		int[][] array={
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
				};
		
		System.out.println(array.length); //3
		System.out.println(array[2].length); //5
	}

}
