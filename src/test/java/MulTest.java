import static org.junit.Assert.*;

import org.junit.Test;

public class MulTest {

	@Test
	public void test() {
		int result = Opt.mul(10,5);
		assertEquals(50, result);
	}

}
