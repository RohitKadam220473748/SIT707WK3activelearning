package activelearning;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;

public class FirstClassTest {
  
	FirstClass inst;
	@Before
	public void setup() {
	 inst = new FirstClass();
	 System.out.println("Setup is done");
	}
	
	@Ignore
	public void testAddZeroInputZeroOutput(){
		System.out.println("Input zero Output zero");
		int realoutcome = inst.add(0, 0);
		Assert.assertEquals(realoutcome,0);
	}
	
	@Test
	public void testAddNegativePostiveInputPostiveOut(){
		System.out.println("Negative Postive Input Postive Output");
		int realoutcome = inst.add(-2, 5);
		Assert.assertEquals(realoutcome,3);
	}
	
	@Test
	public void testAddNegativeInputNegativeOutput() {
	    System.out.println("Negative Input Negative Output");
	    int realOutcome = inst.add(-4, -7);
	    Assert.assertEquals(realOutcome, -11);
	}
	
	@Test
	public void testAddPositiveNagativeInputNegativeOutput() {
	    System.out.println("Positive Negative Input Negative Output");
	    int realOutcome = inst.add(1, -9);
	    Assert.assertEquals(realOutcome, -8);
	}
	
	@Test
	public void testAddZeroandNumberInputPositiveOutput() {
	    System.out.println("Zero and Number Input Positive Output");
	    int realOutcome = inst.add(0, 10);
	    Assert.assertEquals(realOutcome, 10);
	}
	
	
	
	@Test
	public void testConcatInputZeroandZeroOutputZero() {
		System.out.println("Concat");
		String realoutcome = inst.concat(null,null);
		Assert.assertEquals(realoutcome,"nullnull");
	}
	
	@Test
	public void testConcatInputZeroandEmptycharOutputZeroandEmptychar() {
		System.out.println("ConcatZeroandEmptychar");
		String realoutcome = inst.concat("0"," ");
		Assert.assertEquals(realoutcome,"0 ");
	}
	
	@Test
	public void testConcatInputNullandZeroOutputNullandZero() {
		System.out.println("ConcatNullandZero");
		String realoutcome = inst.concat("null","0");
		Assert.assertEquals(realoutcome,"null0");	
}
	
	@Test
	public void testConcatInputZeroandNullOutputZeroandNull() {
		System.out.println("Concat Zero AND Null");
		String realoutcome = inst.concat("0","null");
		Assert.assertEquals(realoutcome,"0null");
				
}
	
	@Test
	public void testConcatInputZeroZeroOutputZeroZero() {
		System.out.println("ConcatZeroandZero");
		String realoutcome = inst.concat("0","0");
		Assert.assertEquals(realoutcome,"00");	
				
}
	@Test
	public void testSubtractPostiveInputNegativeOut(){
		System.out.println(" Subtract Postive Input Ngeative Output");
		int realoutcome = inst.subtract(3, 6);
		Assert.assertEquals(realoutcome,-3);
	}
	
	@Test
	public void testSubtractNegativePostiveInputPostiveOut(){
		System.out.println("Subtract Negative Postive Input Postive Output");
		int realoutcome = inst.subtract(2, -5);
		Assert.assertEquals(realoutcome,7);
	}
	
	@Test
	public void testSubtractPositiveInputPositiveOutput() {
	    System.out.println("Positive Input Positive Output");
	    int realOutcome = inst.subtract(10, 3);
	    Assert.assertEquals(realOutcome, 7);
	}
	
	@Test
	public void testSubtractNegativeInputNegativeOutput() {
	    System.out.println("Negative Input Postive Output");
	    int realOutcome = inst.subtract(-5, -10);
	    Assert.assertEquals(realOutcome, 5);
	}
	
	@Test
	public void testSubtractZeroInputPositiveOutput() {
	    System.out.println("Zero Input Positive Output");
	    int realOutcome = inst.subtract(10, 0);
	    Assert.assertEquals(realOutcome, 10);
	}
	
}
