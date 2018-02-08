import java.util.ArrayList;
import java.util.List;

public class Frame {

	private static int NUMBALLSROLLED = 3;
	private static int FIRSTROLL = 0;
	private static int SECONDROLL = 1;
	private static int THIRDROLL = 2;
	private List<Integer> frame = new ArrayList<>();

	public List<Integer> roll(Roll pinsKnockedDown) {

		if (frame.size() < NUMBALLSROLLED) {
			frame.add(pinsKnockedDown.getPinsKnockedDown());
		}
		return frame;
	}

	public int firstBall() {
		return frame.get(FIRSTROLL);

	}

	public int secondBall() {
		return frame.get(SECONDROLL);
	}

	public int thirdBall() {
		return frame.get(THIRDROLL);
	}

}
