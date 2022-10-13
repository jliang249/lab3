import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedInPlace3{
	  int[] input3 = {7,6,3};
	  ArrayExamples.reverseInPlace(input3);
	  assertArrayEquals(new int[]{7, 6, 3}, ArrayExamples.reverseInPlace, input3);
}

  @Test
  public void testReversed3{
	  int[] input3 = {7,6,3};
	  assertArrayEquals(new int[]{7, 6, 3}, ArrayExamples.reversed(input3));
}

  @Test
  public void averageWithoutLowest5(){
    double [] input1 =(6,5,3,2,2);
    ArrayExamples.averageWithoutLowest(input1);
    assertEquals(expected:4.0, input 1);
  }


}
