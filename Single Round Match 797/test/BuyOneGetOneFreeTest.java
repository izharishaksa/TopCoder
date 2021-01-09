import org.junit.Test;
import static org.junit.Assert.*;

public class BuyOneGetOneFreeTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] prices = new int[] {47};
		assertEquals(47, new BuyOneGetOneFree().buy(prices));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] prices = new int[] {10, 20};
		assertEquals(20, new BuyOneGetOneFree().buy(prices));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] prices = new int[] {10, 20, 30, 20};
		assertEquals(50, new BuyOneGetOneFree().buy(prices));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] prices = new int[] {5, 7, 13, 2, 9};
		assertEquals(22, new BuyOneGetOneFree().buy(prices));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] prices = new int[] {100, 100, 100, 100, 100, 100};
		assertEquals(300, new BuyOneGetOneFree().buy(prices));
	}
}
