package second.mvn;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AppTest.class, ArithCalcTest.class, CalculatorTest.class, PrimeTestin.class, StudentTest.class,
		Testing.class, TestPrime.class })
public class AllTests {

}
