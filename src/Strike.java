
public class Strike {

	private static int STRIKE = 10;

	public Strike() {

	}

	public boolean isStrike(Frame frame) {

		return frame.firstBall() == STRIKE;

	}
}
