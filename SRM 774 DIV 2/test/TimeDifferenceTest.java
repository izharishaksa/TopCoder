import org.junit.Test;
import static org.junit.Assert.*;

public class TimeDifferenceTest {
	
	@Test(timeout=2000)
	public void test0() {
		String startTime = "00:00";
		String endTime = "13:23";
		assertEquals("13:23", new TimeDifference().calculate(startTime, endTime));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String startTime = "100:15";
		String endTime = "13:23";
		assertEquals("-86:52", new TimeDifference().calculate(startTime, endTime));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String startTime = "001:00";
		String endTime = "8:15";
		assertEquals("7:15", new TimeDifference().calculate(startTime, endTime));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String startTime = "123:45";
		String endTime = "543:21";
		assertEquals("419:36", new TimeDifference().calculate(startTime, endTime));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String startTime = "111:11";
		String endTime = "222:12";
		assertEquals("111:01", new TimeDifference().calculate(startTime, endTime));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String startTime = "10:42";
		String endTime = "10:47";
		assertEquals("0:05", new TimeDifference().calculate(startTime, endTime));
	}
	
	@Test(timeout=2000)
	public void test6() {
		String startTime = "10:47";
		String endTime = "010:47";
		assertEquals("0:00", new TimeDifference().calculate(startTime, endTime));
	}
}
