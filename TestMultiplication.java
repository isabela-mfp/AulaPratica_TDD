import static org.junit.Assert.assertEquals;
import org.junit.Test;

class TestMultiplication {
  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    five.times(2);
    assertEquals(10, five.amount);
  }
}