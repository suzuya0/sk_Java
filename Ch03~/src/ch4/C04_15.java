package ch4;

public class C04_15 {
	public static void main(String[] args) {
		int[] arrayA = {1, 2, 3};
		int[] arrayB;
		arrayB = arrayA;
		arrayB[0] = 100;
		System.out.println(arrayA[0]);
	}

}
