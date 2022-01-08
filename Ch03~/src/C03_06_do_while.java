
public class C03_06_do_while {
	public static void main(String[] args) {
		int temp = 25;
		do {
			temp--;
			System.out.println("温度を一度下げました");
		} while (temp > 25);
	}

}

//do_while(最低一回{}の中身を実行する