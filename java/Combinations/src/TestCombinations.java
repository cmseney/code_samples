import static org.junit.Assert.*;

import org.junit.Test;

public class TestCombinations {
	
	@Test
	public void TestCountCombinations(){
		int value = Combinations.CountCombinations(5, 3);
		assertEquals(10, value);
	}

	@Test
	public void TestCountCombinationsEmpty(){
		int value = Combinations.CountCombinations(0, 3);
		assertEquals(0, value);
	}
	
	@Test
	public void TestCombinationsChooseZero(){
		int value = Combinations.CountCombinations(3, 0);
		assertEquals(1, value);
	}
	
	@Test
	public void TestCombinationsChooseAll(){
		int value = Combinations.CountCombinations(5, 5);
		assertEquals(1, value);
	}
	
	@Test
	public void TestCombinationsChooseTooMany(){
		int value = Combinations.CountCombinations(3, 5);
		assertEquals(0, value);
	}
}
