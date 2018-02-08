
public class Spare {

	private static int SPARE = 10;

	public Spare() {

	}

	public boolean isSpare(Frame frame) {
		return frame.firstBall() + frame.secondBall() == SPARE;

	}

}
