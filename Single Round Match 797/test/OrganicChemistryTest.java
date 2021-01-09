import org.junit.Test;
import static org.junit.Assert.*;

public class OrganicChemistryTest {
	
	@Test(timeout=2000)
	public void test9() {
		String atoms = "N";
		int[] X = new int[] {};
		int[] Y = new int[] {};
		assertEquals(3, new OrganicChemistry().countHydrogens(atoms, X, Y));
	}
	@Test(timeout=2000)
	public void test0() {
		String atoms = "O";
		int[] X = new int[] {};
		int[] Y = new int[] {};
		assertEquals(2, new OrganicChemistry().countHydrogens(atoms, X, Y));
	}

	@Test(timeout=2000)
	public void test1() {
		String atoms = "C";
		int[] X = new int[] {};
		int[] Y = new int[] {};
		assertEquals(4, new OrganicChemistry().countHydrogens(atoms, X, Y));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String atoms = "CCO";
		int[] X = new int[] {0, 1};
		int[] Y = new int[] {1, 2};
		assertEquals(6, new OrganicChemistry().countHydrogens(atoms, X, Y));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String atoms = "CC";
		int[] X = new int[] {0, 0};
		int[] Y = new int[] {1, 1};
		assertEquals(4, new OrganicChemistry().countHydrogens(atoms, X, Y));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String atoms = "OO";
		int[] X = new int[] {1, 1};
		int[] Y = new int[] {0, 0};
		assertEquals(0, new OrganicChemistry().countHydrogens(atoms, X, Y));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String atoms = "OOO";
		int[] X = new int[] {0, 1, 2};
		int[] Y = new int[] {1, 2, 0};
		assertEquals(0, new OrganicChemistry().countHydrogens(atoms, X, Y));
	}
	
	@Test(timeout=2000)
	public void test6() {
		String atoms = "CCCCCC";
		int[] X = new int[] {0, 1, 2, 3, 5, 4};
		int[] Y = new int[] {1, 2, 3, 4, 0, 5};
		assertEquals(12, new OrganicChemistry().countHydrogens(atoms, X, Y));
	}
	
	@Test(timeout=2000)
	public void test7() {
		String atoms = "CCCCCC";
		int[] X = new int[] {0, 0, 1, 2, 3, 5, 4, 4, 3};
		int[] Y = new int[] {1, 1, 2, 3, 4, 0, 5, 5, 2};
		assertEquals(6, new OrganicChemistry().countHydrogens(atoms, X, Y));
	}
	
	@Test(timeout=2000)
	public void test8() {
		String atoms = "CCN";
		int[] X = new int[] {0, 1};
		int[] Y = new int[] {2, 2};
		assertEquals(7, new OrganicChemistry().countHydrogens(atoms, X, Y));
	}
}
