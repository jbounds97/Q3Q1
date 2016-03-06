package tests;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import shapes.Triangle;

public class triangleTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {		
	}
	static Triangle object1 = new Triangle();
	static Triangle object2 = new Triangle(2,3,4);
	static Triangle object3 = new Triangle(43.4,55.5,30.6);
	
	@Test
	public void testGetArea1(){
		System.out.println("Test getArea()");
		double bExpectedResult = 0.4330127018922193;
		double bActualResult = object1.getArea();
		assertEquals("test getArea() failed", bExpectedResult, bActualResult, .001);
	}
	@Test
	public void testGetArea2(){
		System.out.println("Test getArea()");
		double bExpectedResult = 2.9047375096555625;
		double bActualResult = object2.getArea();
		assertEquals("test getArea() failed", bExpectedResult, bActualResult, .001);
	}
	@Test
	public void testGetArea3(){
		System.out.println("Test getArea()");
		double bExpectedResult = 660.8228420641572;
		double bActualResult = object3.getArea();
		assertEquals("test getArea() failed", bExpectedResult, bActualResult, .001);
	}
	@Test
	public void testGetPerimeter1(){
		System.out.println("Test getPerimeter()");
		double bExpectedResult = 3.0;
		double bActualResult = object1.getPerimeter();
		assertEquals("test getPerimeter() failed", bExpectedResult, bActualResult, .1);
	}
	@Test
	public void testGetPerimeter2(){
		System.out.println("Test getPerimeter()");
		double bExpectedResult = 9.0;
		double bActualResult = object2.getPerimeter();
		assertEquals("test getPerimeter() failed", bExpectedResult, bActualResult, .1);
	}
	@Test
	public void testGetPerimeter3(){
		System.out.println("Test getPerimeter()");
		double bExpectedResult = 129.5;
		double bActualResult = object3.getPerimeter();
		assertEquals("test getPerimeter() failed", bExpectedResult, bActualResult, .1);
	}
}
