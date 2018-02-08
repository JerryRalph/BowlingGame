import java.util.ArrayList;
import java.util.List;

public class BowlingGame2 {

	private static int TENPINS = 10;
	private static int TENTHFRAME = 10;
	private static int NINTHFRAME = 9;
	private static int NEXTFRAME = 1;
	private static int TWOFRAMESAHEAD = 2;

	private int frameIndex = 1;
	private List<Frame> game = new ArrayList<>();
	private Strike oneRoll = new Strike();
	private Spare twoRolls = new Spare();

	public BowlingGame2() {

	}

	public void addFrame(Frame frame) {

		game.add(frame);

	}

	public int totalScore() {
		int totalScore = 0;

		for (int currentFrame = 0; currentFrame < game.size(); currentFrame++) {
			Frame inFrame = game.get(currentFrame);
			if (frameIndex == TENTHFRAME) {
				totalScore += tenthFrameScore(currentFrame);
			} else if (oneRoll.isStrike(inFrame)) {

				totalScore += TENPINS + strikeBonus(currentFrame);
				frameIndex++;
			} else if (twoRolls.isSpare(inFrame)) {
				totalScore += TENPINS + spareBonus(currentFrame);
				frameIndex++;
			} else {
				totalScore += frameScore(currentFrame);
				frameIndex++;
			}
		}
		return totalScore;
	}

	private int strikeBonus(int currentFrame) {
		int strikeBonus = 0;
		if (frameIndex == NINTHFRAME) {
			strikeBonus = ninthFrameStrike(currentFrame + NEXTFRAME);
		}

		else if (game.get(currentFrame + NEXTFRAME).firstBall() == TENPINS) {
			strikeBonus = TENPINS + game.get(currentFrame + TWOFRAMESAHEAD).firstBall();
		} else {
			strikeBonus = game.get(currentFrame + NEXTFRAME).firstBall()
					+ game.get(currentFrame + NEXTFRAME).secondBall();
		}
		return strikeBonus;

	}

	private int frameScore(int currentFrame) {

		return game.get(currentFrame).firstBall() + game.get(currentFrame).secondBall();

	}

	private int spareBonus(int currentFrame) {

		return game.get(currentFrame + NEXTFRAME).firstBall();

	}

	private int tenthFrameScore(int currentFrame) {

		if (twoRolls.isSpare(game.get(currentFrame)) || oneRoll.isStrike(game.get(currentFrame))) {
			return game.get(currentFrame).firstBall() + game.get(currentFrame).secondBall()
					+ game.get(currentFrame).thirdBall();
		}

		return game.get(currentFrame).firstBall() + game.get(currentFrame).secondBall();

	}

	private int ninthFrameStrike(int currentFrame) {

		return game.get(currentFrame).firstBall() + game.get(currentFrame).secondBall();

	}

}
