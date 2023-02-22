package winter_hw;


import java.util.Scanner;

class circle{

	double area(double PI, double radius) {
		double area;
		area = PI * Math.pow(radius, 2) * 0.25;
		return area;
	}
	
	double circum(double PI, double radius) {
		double circum;
		circum = PI*2*radius*0.25 + (radius*2);
		return circum;
	}
}

public class SectorForm {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		final double PI = 3.14;
		System.out.print("반지름 입력 : ");
		double radius = scan.nextDouble();
		circle c1 = new circle();
		double area = c1.area(PI, radius);
		double circum = c1.circum(PI, radius);
		System.out.println("반지름 "+ radius+"인 부채꼴의 면적 : "+ area +" , 둘레 : "+ circum);
	}
}

