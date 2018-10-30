package Shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>();
		ar.add(this);
		ar.add(c1);
		Collections.sort(ar, new Cuboid.SortByArea());
		//return compare(this,ar.get(0));
	}
	public class SortByArea implements Comparator<Cuboid>{
		public int compare(Cuboid x, Cuboid y) {
			return (int) (x.area() -y.area());
		}
	}
	public class SortByVolume implements Comparator<Cuboid>{
		public int compare(Cuboid x, Cuboid y) {
			return (int) (x.volume() - y.volume());
		}
	}

}
