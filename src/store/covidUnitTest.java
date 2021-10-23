package store;

import static org.junit.Assert.*;

import org.junit.Test;

public class covidUnitTest {

	@Test
	public void test() {
		Covid_Patients covid = new Covid_Patients();
		double medi =  covid.displayPrice(100);
		assertEquals(100,medi);
	}

}
