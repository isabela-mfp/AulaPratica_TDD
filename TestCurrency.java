import static org.junit.Assert.assertEquals;
import org.junit.Test;

class TestCurrency{
  @Test
  public void testCurrency() {
    assertEquals("USD", Money.dollar(1).currency());
    assertEquals("CHF", Money.franc(1).currency());
  }
}