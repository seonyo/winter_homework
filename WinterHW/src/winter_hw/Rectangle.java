package winter_hw;

class rec{
	int x1, y1, x2, y2;
	rec(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2=x2;
		this.y2=y2;
	}
	
	void showRectangle() {
		System.out.println("사각형의 좌표는 왼쪽 위 (" + x1 + ", "+y1+")");
		System.out.println("사각형의 좌표는 오른쪽 아래 (" + x2 + ", "+y2+")");
	}
	int getRound() {
		int round = ((x2-x1) + (y2-y1))*2;
		return round;
	}
	int getArea() {
		int area = (x2-x1) * (y2-y1);
		return area;
	}
}
public class Rectangle {
	public static void main(String[] args) {
		rec t1 = new rec (1,1,3,3);
		t1.showRectangle();
		System.out.println("사각형의 둘레: " + t1.getRound());
		System.out.println("사각형의 둘레: " + t1.getArea());

	}

}
