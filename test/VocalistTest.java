import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VocalistTest {
	Vocalist v1, v2, v3, v4;

	@Before
	public void setUp() throws Exception {
		v1 = new Vocalist(100, 0, 5);
		v2 = new Vocalist(100, 1, 4);
		v3 = new Vocalist(100, 2, 3);
		v4 = new Vocalist(100, 3, 2);
	}

	@Test
	public void Gtest() {
		assertEquals("I sing in the key of - G -  at the volume  5 ID-100", v1.displayVocalist());
	}

	@Test
	public void Htest() {
		assertEquals("I sing in the key of - H -  at the volume  4 ID-100", v2.displayVocalist());
	}
	@Test
	public void Itest() {
		assertEquals("I sing in the key of - I -  at the volume  3 ID-100", v3.displayVocalist());
	}
	@Test
	public void Jtest() {
		assertEquals("I sing in the key of - J -  at the volume  2 ID-100", v4.displayVocalist());
	}
}
