package ch4;

public class P04_04 {
	public static void main(String[] args) {
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int n: numbers) {
			if(n == input) {
				System.out.println("アタリ！");
			} else {
				System.out.println("ハズレ");
			}
		}
		//普通のfor
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == input) {
				System.out.println("アタリ!");
			} else {
				System.out.println("ハズレ");
			}
		}
	}
}
