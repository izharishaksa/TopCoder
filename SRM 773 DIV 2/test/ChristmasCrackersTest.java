import org.junit.Test;
import static org.junit.Assert.*;

public class ChristmasCrackersTest {
	
	@Test(timeout=2000)
	public void test0() {
		int N = 2;
		int K = 3;
		assertArrayEquals(new int[] {0, 1, 0, 1, 0, 1 }, new ChristmasCrackers().crack(N, K));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int N = 5;
		int K = 1;
		assertArrayEquals(new int[] {0, 3, 1, 2, 1, 4 }, new ChristmasCrackers().crack(N, K));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int N = 3;
		int K = 4;
		assertArrayEquals(new int[] {0, 1, 0, 1, 0, 2, 0, 2, 1, 2, 2, 1 }, new ChristmasCrackers().crack(N, K));
	}
}
