import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RollTest {

	Roll aRoll = new Roll(5);

	@Test
	void testRoll() {
		assertEquals(5, aRoll.getPinsKnockedDown());
	}

}
