package cisc.edu.Midterm_Coding;

import org.junit.Test;

import Shape.Rectangle;
import Shape.Cuboid;
import junit.framework.TestCase;
public class ShapeTest extends TestCase {

	@Test
    public void testRectangle() {
    	Rectangle r1 = new Rectangle(4,5);
    	assert(r1 instanceof Rectangle);
 	    assertEquals((double) r1.area() == 20, true);
 	    assertEquals((double) r1.getiWidth() == 4, true); 
 	    assertEquals((double) r1.getiLength() == 5, true); 
 	    r1.setiLength(2);
 	    r1.setiWidth(3);
 	    assertEquals((double) r1.getiWidth() == 3, true); 
	    assertEquals((double) r1.getiLength() == 2, true);
	    Rectangle r2 = new Rectangle(1,1);
	    assertEquals((int) r1.compareTo(r2) == 1, true);
    }
	
	@Test
    public void testCuboid() {
    	Cuboid c1 = new Cuboid(4,5,1);
    	assert(c1 instanceof Cuboid);
 	    assertEquals((double) c1.area() == 58, true);
 	    assertEquals((double) c1.volume() == 20, true);
 	    assertEquals((double) c1.getiDepth() == 1, true); 
	    c1.setiDepth(3);
	    assertEquals((double) c1.getiDepth() == 3, true); 
	    Cuboid c2 = new Cuboid(1,1,1);
	    //assertEquals((int) SortByArea.compare(c1,c2) == 52, true);
	    //assertEquals((int) SortByVolume.compare(c1,c2) == 20, true);
	    assertEquals(c1.compareTo(c2) == 1, true);
    	
	}
	
	@Test
	public void testCuboidPerimeter() {
	Cuboid c2 = new Cuboid(4,5,1);
	boolean thrown = false;
	  try {
	    c2.perimeter();
	  } catch (UnsupportedOperationException e) {
	    thrown = true;
	  }
	  assertTrue(thrown);
	}
}
