import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StrikeTest {
	private static int STRIKE = 10;
	private static int NOTSTRIKE = 7;
	Frame frame = new Frame();
	Strike roll = new Strike();

	@Test
	void strikeTest() {

		frame.roll(new Roll(STRIKE));

		assertEquals(true, roll.isStrike(frame));
	}

	@Test
	void notStrikeTest() {

		frame.roll(new Roll(NOTSTRIKE));

		assertEquals(false, roll.isStrike(frame));
	}

}
