import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BowlingGameTest {

	BowlingGame game = new BowlingGame();

	@Test
	void testScoreOneRoll() {
		game.roll(4);

		assertEquals(4, game.score());
	}

	@Test
	void testScoreTwoRoll() {
		game.roll(4);
		game.roll(5);
		assertEquals(9, game.score());
	}

	@Test
	void testSpareRoll() {
		game.roll(7);
		game.roll(3);
		game.roll(5);
		assertEquals(20, game.score());
	}

	@Test
	void testStrikeRoll() {
		game.roll(10);
		game.roll(3);
		game.roll(5);
		assertEquals(26, game.score());
	}

	@Test
	void testGame() {
		game.roll(10);
		game.roll(10);
		game.roll(10);
		game.roll(10);
		game.roll(10);
		game.roll(10);
		game.roll(10);
		game.roll(10);
		game.roll(10);
		game.roll(10);
		game.roll(10);
		game.roll(10);
		game.roll(10);
		game.roll(10);
		assertEquals(300, game.score());
	}
	
	@Test
	void testAllSpares() {
		rollMany(21,5);
		assertEquals(150, game.score());
		
		
	}
	@Test
	void testAllGutters() {
		rollMany(20,0);
		assertEquals(0, game.score());
		
		
	}
	
	
	private void rollMany(int rolls, int pins) {
		for (int i = 0; i < rolls; i++) {
			game.roll(pins);
		}
		
	}

}
