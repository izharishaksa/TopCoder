import org.junit.Test;
import static org.junit.Assert.*;

public class VertexMoveTest {
	
	@Test(timeout=2000)
	public void test0() {
		int a = 3;
		int b = 4;
		int c = 5;
		assertEquals(8.5, new VertexMove().largestTriangleArea(a, b, c), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test1() {
		int a = 10;
		int b = 10;
		int c = 10;
		assertEquals(48.30127018922193, new VertexMove().largestTriangleArea(a, b, c), 1e-9);
	}
	
	@Test(timeout=2000)
	public void test2() {
		int a = 12;
		int b = 13;
		int c = 16;
		assertEquals(84.68727078205352, new VertexMove().largestTriangleArea(a, b, c), 1e-9);
	}
}
