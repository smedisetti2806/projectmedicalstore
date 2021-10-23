package store;

import static org.junit.Assert.*;

import org.junit.Test;

public class BillUnitTesting {

	@Test
	public void test() {
		Medicines_Builder med = new Medicines_Builder();
		double medi =  med.calculateBill(10,5);
		assertEquals(50,medi);
	}

}
