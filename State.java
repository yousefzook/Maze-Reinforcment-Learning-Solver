
public class State {

	int value;
	// array of booleans to represent each possible action
	// North - East - South - West
	boolean policy[];
	boolean barrier;
	
	private State() {}
	
	public State(boolean barrier) {
		this.barrier = barrier;
		if(barrier)
			return;
		value = 0;
		policy = new boolean[4];
		for (int i = 0; i < policy.length; i++)
			policy[i] = true;
	}
}
