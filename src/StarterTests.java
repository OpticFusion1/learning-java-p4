import static org.junit.Assert.*;

import org.junit.Test;


public class StarterTests {
	
	//Tests the constructors of 'Fraction'.
	@Test
	public void testConstructors(){
		assertTrue("Didn't intialize correctly", new Fraction().toString().equals("1/1"));
		assertTrue("Didn't intialize correctly",new Fraction(4,3).toString().equals("4/3"));
		assertFalse("Didn't intialize correctly",new Fraction(0,0).toString().equals("0/0"));
	}
	
	//Tests the "addTo" method in 'Fraction'.
	@Test
	public void testAddTo() {
		
		Fraction testFrac1 = new Fraction(5,15);
		
		testFrac1.addTo(new Fraction(20,15));
		
		assertTrue("Didn't add the fractions correctly",testFrac1.toString().equals("25/15"));
		
		testFrac1.addTo(new Fraction());
		
		assertTrue("Didn't add the fractions correctly",testFrac1.toString().equals("40/15"));
		
		
	}
	
	//Tests the "add" method in 'Fraction'.
	@Test
	public void testAdd(){
		
		Fraction testFrac1 = new Fraction();
		
		assertTrue("Didn't add correctly",testFrac1.add(new Fraction(25,15)).toString().equals(new Fraction(40,15).toString()));
	}

}
