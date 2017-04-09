import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DancerTest {
	Dancer dancer1, dancer2, dancer3,dancer4;

	@Before
	public void setup() {
		dancer1 = new Dancer(100, 0);
		dancer2 = new Dancer(200, 1);
		dancer3 = new Dancer(300, 2);
		dancer4 = new Dancer(400, 3);
	}
	// TAP, SALSA, HIPHOP, JAZZ
	@Test
	public void dancerTAPTest() {		
		assertEquals("TAP -ID-100 - dancer", dancer1.displayDancer());
	}
	
	@Test
	public void dancerSALSATest() {		
		assertEquals("SALSA -ID-200 - dancer", dancer2.displayDancer());
	}
	@Test
	public void dancerHIPHOPTest() {		
		assertEquals("HIPHOP -ID-300 - dancer", dancer3.displayDancer());
	}
		
	@Test
	public void dancerJAZZTest() {		
		assertEquals("JAZZ -ID-400 - dancer", dancer4.displayDancer());
	}

}
