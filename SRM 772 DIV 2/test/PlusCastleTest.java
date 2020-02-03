import org.junit.Test;
import static org.junit.Assert.*;

public class PlusCastleTest {
	
	@Test(timeout=2000)
	public void test0() {
		int k = 9;
		assertEquals(4, new PlusCastle().maximiseClosedFigures(k));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int k = 6;
		assertEquals(2, new PlusCastle().maximiseClosedFigures(k));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int k = 898680485;
		assertEquals(898620529, new PlusCastle().maximiseClosedFigures(k));
	}
}
