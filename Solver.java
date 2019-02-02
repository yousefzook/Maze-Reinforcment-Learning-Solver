import java.awt.Point;
import java.util.Random;

public class Solver {

	State grid[][];
	float gamma;
	int reward;
	Point src;
	Point dest;

	private Solver() {
	}

	public Solver(int N, float gamma, Point src, Point dest) {
		this.grid = new State[N][N];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++) {
				// if src or dest, it's not a barrier
				if ((src.getX() == i && src.getY() == j)
						|| (dest.getX() == i && dest.getY() == j))
					grid[i][j] = new State(false);
				else {
					// probability of .25 to be a barrier
					boolean b = new Random().nextInt(4) == 0;
					grid[i][j] = new State(b);
				}
			}
		this.gamma = gamma;
		this.src = src;
		this.dest = dest;
		reward = -1;
	}

	
	public Results solvePolicy() {
		return null;

	}

	public Results solveValue() {
		return null;

	}
}
