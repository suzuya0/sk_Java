package ch4;

public class C04_12 {
	public static void main(String[] args) {
		int[] seq = new int[10];
		
		//各要素に0〜4をランダムに代入
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		
		//各要素に代入された要素により、表示をかえる
		
		//方法その1
		for (int i = 0; i < seq.length; i++) {
			switch(seq[i]){
			case 0:
				System.out.print("A ");
				break;
			case 1:
				System.out.print("T ");
				break;
			case 2:
				System.out.print("G ");
				break;
			case 3:
				System.out.print("C ");
				break;
			}
		}
		
		System.out.println("");
		
		//方法その2
		char[] base = {'A', 'T', 'G', 'C'};
		for (int i = 0; i < seq.length; i++) {
			System.out.print(base[seq[i]] + " ");
		}
	}
}
