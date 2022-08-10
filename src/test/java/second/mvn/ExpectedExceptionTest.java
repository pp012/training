package second.mvn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExpectedExceptionTest {

	@Test
	void testWithParent() {
		assertThrows(IllegalArgumentException.class,()->{Integer.parseInt("One");});
	}

}
