package demoCICD;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CaculatorTest {
	@Test
	public void testSum() {
		Caculator cal1 = new Caculator();
		assertEquals(cal1.sum(5, 4), 9);
	}
	
	@Test
	public void testSub() {
		Caculator cal2 = new Caculator();
		assertEquals(cal2.sub(10, 6), 4);
	}
}
