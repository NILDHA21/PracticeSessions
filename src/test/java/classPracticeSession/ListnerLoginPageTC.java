package classPracticeSession;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListnerLoginPageTC {

	@Test
	void testcase1() {
		Assert.assertEquals(2, 4);
	}
	
	@Test
	void testcase2() {
		Assert.assertEquals(2, 3);
	}
	
	@Test
	void testcase3() {
		Assert.assertEquals(2, 2);
	}
	
	@Test
	void testcase4() {
		Assert.assertEquals(4, 4);
	}
	
	@Test
	void testcase5() {
		throw new SkipException(" ");
	}
}
