import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheatingAfterTestsTest {

    @Test(timeout = 2000)
    public void test0() {
        int[] report = new int[]{51, 47, 93};
        assertEquals(241, new CheatingAfterTests().cheat(report));
    }

    @Test(timeout = 2000)
    public void test1() {
        int[] report = new int[]{99, 99};
        assertEquals(198, new CheatingAfterTests().cheat(report));
    }

    @Test(timeout = 2000)
    public void test2() {
        int[] report = new int[]{4, 5, 7, 2};
        assertEquals(25, new CheatingAfterTests().cheat(report));
    }

    @Test(timeout = 2000)
    public void test3() {
        int[] report = new int[]{93, 97, 92, 99, 92, 93};
        assertEquals(573, new CheatingAfterTests().cheat(report));
    }

    @Test(timeout = 2000)
    public void test4() {
        int[] report = new int[]{94, 6, 1, 4};
        assertEquals(113, new CheatingAfterTests().cheat(report));
    }

    @Test(timeout = 2000)
    public void test5() {
        int[] report = new int[]{0, 0, 0};
        assertEquals(9, new CheatingAfterTests().cheat(report));
    }

}
