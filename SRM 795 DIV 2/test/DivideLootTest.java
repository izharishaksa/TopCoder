import org.junit.Test;
import static org.junit.Assert.*;

public class DivideLootTest {
	
	@Test(timeout=2000)
	public void test0() {
		int N = 1;
		int[] loot = new int[] {47};
		assertEquals("possible", new DivideLoot().verify(N, loot));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int N = 3;
		int[] loot = new int[] {10, 8, 10, 1, 1};
		assertEquals("impossible", new DivideLoot().verify(N, loot));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int N = 3;
		int[] loot = new int[] {3, 9, 10, 7, 1};
		assertEquals("possible", new DivideLoot().verify(N, loot));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int N = 6;
		int[] loot = new int[] {1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1};
		assertEquals("possible", new DivideLoot().verify(N, loot));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int N = 2;
		int[] loot = new int[] {40, 1, 42};
		assertEquals("impossible", new DivideLoot().verify(N, loot));
	}
}
