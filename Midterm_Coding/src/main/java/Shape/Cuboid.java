package Shape;

public class Cuboid extends Rectangle implements Comparable{
	int iDepth;
	public Cuboid(int x, int y, int z) {
		super(x,y);
		iDepth = z;
	}
	@Override
	public double area() {
		return ((2*iWidth *iLength) +(2*iWidth *iDepth) + (2*iDepth *iLength));
	}
	@Override
	public double perimeter() throws UnsupportedOperationException{
		throw new UnsupportedOperationException("Cannot perform perimeter on Cuboid");
	}
	public int getiDepth() {
		return iDepth;
	}
	
	public void setiDepth(int x) {
		iDepth = x;
	}
	public double volume() {
		return iWidth*iLength*iDepth;
	}
	@Override 
	public int compareTo(Object o) {
		Cuboid c1 = (Cuboid) o;
		return (Double.compare(this.area(),c1.area()));
	}
	public class SortByArea{
		public int compare(Cuboid x, Cuboid y) {
			return (Double.compare(x.area(),y.area()));
		}
	}
	public class SortByVolume{
		public int compare(Cuboid x, Cuboid y) {
			return (Double.compare(x.volume(),y.volume()));
		}
	}

}
