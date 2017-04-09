import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PerformerTest {
	Performer performer;

	@Before
	public void setUp() throws Exception {
	performer = new Performer(300);
	}

	@Test
	public void performerTest() {
		assertEquals("ID-300",performer.getunionID());
	}

}
