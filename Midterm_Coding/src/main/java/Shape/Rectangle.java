package Shape;

public class Rectangle extends Shape implements Comparable{
	int iWidth;
	int iLength;
	public Rectangle(int x, int y) {
		iWidth = x;
		iLength = y;	
	}
	public double area() {
		return iWidth *iLength;
	}
	public double perimeter() {
		return 2*iWidth + 2*iLength;
	}
	public int getiWidth() {
		return iWidth;
	}
	public int getiLength() {
		return iLength;
	}
	public void setiLength(int x) {
		iLength = x;
	}
	public void setiWidth(int x) {
		iWidth = x;
	}
	public int compareTo(Object o) {
		Rectangle r1 = (Rectangle) o;
		return (Double.compare(this.area(),r1.area()));
	}
}
