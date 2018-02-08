import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FrameTest {
	Frame aFrame = new Frame();

	@Test
	void rollTest() {

		aFrame.roll(new Roll(2));
		assertEquals(2, aFrame.roll(new Roll(7)).size());
		
	}

	@Test
	void firstBallTest() {
		aFrame.roll(new Roll(7));
		aFrame.roll(new Roll(3));
		assertEquals(7, aFrame.firstBall());
	}

	@Test
	void secondBallTest() {
		aFrame.roll(new Roll(7));
		aFrame.roll(new Roll(3));
		assertEquals(3, aFrame.secondBall());
	}

}
