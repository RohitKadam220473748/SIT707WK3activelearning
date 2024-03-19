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
}
