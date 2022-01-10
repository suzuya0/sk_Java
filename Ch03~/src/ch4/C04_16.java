package ch4;

public class C04_16 {
	public static void main(String[] args) {
		boolean judge = true;
		if (judge == true) {
			int[] array = {1, 2, 3};
			System.out.println(array[0]);
		}
		//ローカル変数なのでエラーになる
		//System.out.println(array[0]);
	}

}
