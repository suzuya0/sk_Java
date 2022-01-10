package ch4;

public class C04_17 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		//参照型にnullを代入することで、参照先をなくす
		//どこからも参照されない、できない{1,2,3}はガベージコレクションの対象になる
		array = null;
		//参照先がないので代入できない
		//array[0] = 10;
	}

}
