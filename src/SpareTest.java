import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpareTest {

	private static int SPARE = 5;
	private static int NOTSPARE = 3;
	Frame frame = new Frame();
	Spare roll = new Spare();

	@Test
	void spareTest() {

		frame.roll(new Roll(SPARE));
		frame.roll(new Roll(SPARE));
		assertEquals(true, roll.isSpare(frame));
	}

	@Test
	void notSpareTest() {

		frame.roll(new Roll(NOTSPARE));
		frame.roll(new Roll(NOTSPARE));
		assertEquals(false, roll.isSpare(frame));
	}

}
