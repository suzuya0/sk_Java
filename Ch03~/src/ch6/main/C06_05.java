package ch6.main;

public class C06_05 {
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = ch6.logics.C06_06.tasu(a, b);
		int delta = ch6.logics.C06_06.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}

}
