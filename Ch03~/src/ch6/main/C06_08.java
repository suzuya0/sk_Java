package ch6.main;

//クラスを指定してインポート
import ch6.logics.C06_06;

//ch06.logicの全てをインポート
//import ch6.logics.*;

public class C06_08 {
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = C06_06.tasu(a, b);
		int delta = C06_06.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
		
	}
	
}
