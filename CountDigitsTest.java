import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDigitsTest {
  @Test
  public void Test1 (){
    assertEquals(1, CountDigits.Count(9));
  }
  @Test
  public void Test2 (){
    assertEquals(2, CountDigits.Count(99));
  }
  @Test
  public void Test3 (){
    assertEquals(5, CountDigits.Count(90912));
  }
}