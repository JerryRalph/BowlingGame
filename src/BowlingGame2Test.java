import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BowlingGame2Test {
	private static int TENFRAMES = 10;

	Frame frame1 = new Frame();
	Frame frame2 = new Frame();
	Frame frame3 = new Frame();
	Frame frame4 = new Frame();
	Frame frame5 = new Frame();
	Frame frame6 = new Frame();
	Frame frame7 = new Frame();
	Frame frame8 = new Frame();
	Frame frame9 = new Frame();
	Frame frame10 = new Frame();

	BowlingGame2 game = new BowlingGame2();

	@Test
	void frameTotalTest() {

		frame1.roll(new Roll(5));
		frame1.roll(new Roll(3));

	}

	@Test
	void gameTotalTest() {

		frame1.roll(new Roll(10));
		frame2.roll(new Roll(10));
		frame3.roll(new Roll(10));
		frame4.roll(new Roll(10));
		frame5.roll(new Roll(10));
		frame6.roll(new Roll(10));
		frame7.roll(new Roll(4));
		frame7.roll(new Roll(6));
		frame8.roll(new Roll(10));
		frame9.roll(new Roll(3));
		frame9.roll(new Roll(7));
		frame10.roll(new Roll(5));
		frame10.roll(new Roll(5));
		frame10.roll(new Roll(10));

		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		assertEquals(239, game.totalScore());

	}

	@Test
	void gameTotalTestWithOutStrikeInTenth() {

		frame1.roll(new Roll(10));
		frame2.roll(new Roll(10));
		frame3.roll(new Roll(10));
		frame4.roll(new Roll(10));
		frame5.roll(new Roll(10));
		frame6.roll(new Roll(10));
		frame7.roll(new Roll(10));
		frame8.roll(new Roll(10));
		frame9.roll(new Roll(3));
		frame9.roll(new Roll(7));
		frame10.roll(new Roll(5));
		frame10.roll(new Roll(4));

		game.addFrame(frame1);
		game.addFrame(frame2);
		game.addFrame(frame3);
		game.addFrame(frame4);
		game.addFrame(frame5);
		game.addFrame(frame6);
		game.addFrame(frame7);
		game.addFrame(frame8);
		game.addFrame(frame9);
		game.addFrame(frame10);
		assertEquals(247, game.totalScore());

	}

	@Test
	void allGutterTest() {
		Frame frame = new Frame();
		for (int i = 0; i < 10; i++) {
			frame.roll(new Roll(0));
			game.addFrame(frame);
		}

		assertEquals(0, game.totalScore());
	}

	@Test
	void allStrikesTest() {
		Frame frame = new Frame();
		for (int i = 0; i < TENFRAMES; i++) {
			frame.roll(new Roll(10));
			game.addFrame(frame);
		}
		assertEquals(300, game.totalScore());

	}

	@Test
	void allSparesTest() {
		Frame frame = new Frame();
		for (int i = 0; i < TENFRAMES; i++) {
			frame.roll(new Roll(5));
			game.addFrame(frame);
		}
		assertEquals(150, game.totalScore());

	}

}
