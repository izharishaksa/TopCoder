import org.junit.Test;
import static org.junit.Assert.*;

public class BagsOfMarblesTest {
	
	@Test(timeout=2000)
	public void test0() {
		int desired = 5;
		int bagSize = 10;
		int noWhiteBags = 0;
		int noBlackBags = 1;
		int someWhiteBags = 0;
		int someBlackBags = 0;
		assertEquals(5, new BagsOfMarbles().removeFewest(desired, bagSize, noWhiteBags, noBlackBags, someWhiteBags, someBlackBags));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int desired = 2;
		int bagSize = 10;
		int noWhiteBags = 2;
		int noBlackBags = 0;
		int someWhiteBags = 1;
		int someBlackBags = 0;
		assertEquals(-1, new BagsOfMarbles().removeFewest(desired, bagSize, noWhiteBags, noBlackBags, someWhiteBags, someBlackBags));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int desired = 51;
		int bagSize = 7;
		int noWhiteBags = 7;
		int noBlackBags = 7;
		int someWhiteBags = 7;
		int someBlackBags = 7;
		assertEquals(63, new BagsOfMarbles().removeFewest(desired, bagSize, noWhiteBags, noBlackBags, someWhiteBags, someBlackBags));
	}
}
