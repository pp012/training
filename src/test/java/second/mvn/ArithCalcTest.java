package second.mvn;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ArithCalcTest {

	@Test//(expected=ArithmeticException.class)
	public void test() {
		ArithmeticCalculation a=new ArithmeticCalculation();
		assertEquals("ArithmeticException.class",a.calc(2, 2));
	}

}
