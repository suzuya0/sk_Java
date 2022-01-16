package ch5;

public class P05_04 {
	public static double calcTriangleArea(double bottom, double height) {
		double Area = bottom * height / 2;
		return Area;
	}
	
	public static double calcCircleArea(double radius) {
		double Area = radius * radius * 3.14;
		return Area;
	}
	
	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
		double radius = 5.0;
		System.out.println("三角形の底辺の長さが" + bottom + "cm、高さが" + height + "cmの場合、面積は" + calcTriangleArea(bottom, height) + "cm2");
		System.out.println("円の半径が" + radius + "cmの場合、面積は" + calcCircleArea(radius) + "cm2");
	}
	

}
