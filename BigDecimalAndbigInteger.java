
import java.math.BigDecimal;

public class BigDecimalAndbigInteger {
  public static void main(String[] args) {
    BigDecimal a = new BigDecimal("1234567890123456789.98273459823746");
    BigDecimal b = new BigDecimal("1233454565678.378456837456");
    BigDecimal c = a.multiply(b);
    System.out.println(c);
  }
}
