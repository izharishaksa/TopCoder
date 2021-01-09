import org.junit.Test;
import static org.junit.Assert.*;

public class FlightPlanTest {
	
	@Test(timeout=2000)
	public void test0() {
		int R = 1;
		int C = 5;
		int[] H = new int[] {10, 8, 6, 8, 10};
		int cup = 40;
		int cdn = 10;
		int clr = 20;
		assertEquals(80L, new FlightPlan().fly(R, C, H, cup, cdn, clr));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int R = 6;
		int C = 1;
		int[] H = new int[] {10, 8, 16, 18, 8, 12};
		int cup = 40;
		int cdn = 10;
		int clr = 20;
		assertEquals(480L, new FlightPlan().fly(R, C, H, cup, cdn, clr));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int R = 5;
		int C = 5;
		int[] H = new int[] {  100, 1000,  100,  100,  100,
    97, 9999, 9999, 9999,  100,
    93, 9999,    0, 9999,  100,
    99, 9999,   83,   65,  100,
    98,   93,   90, 9999,   95};
		int cup = 1000;
		int cdn = 1000;
		int clr = 1;
		assertEquals(5010L, new FlightPlan().fly(R, C, H, cup, cdn, clr));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int R = 5;
		int C = 5;
		int[] H = new int[] {  100, 1000,  100,  100,  100,
    97, 9999, 9999, 9999,  100,
    93, 9999,    0, 9999,  100,
    99, 9999,   83,   65,  100,
    98,   93,   90, 9999,   95};
		int cup = 1;
		int cdn = 1;
		int clr = 1000;
		assertEquals(9805L, new FlightPlan().fly(R, C, H, cup, cdn, clr));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int R = 1;
		int C = 1;
		int[] H = new int[] {47};
		int cup = 123;
		int cdn = 234;
		int clr = 345;
		assertEquals(0L, new FlightPlan().fly(R, C, H, cup, cdn, clr));
	}
}
