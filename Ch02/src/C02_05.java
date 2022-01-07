
public class C02_05 {
	public static void main(String[] args) {
		//小さい型から大きな型への代入は型の自動変換が行われる
		float f = 3;
		double d = f;
		System.out.println(f);
		System.out.println(d);
		//大きい型から小さな型への代入はコンパイルエラー
		//int i = 3.2;
	}

}
