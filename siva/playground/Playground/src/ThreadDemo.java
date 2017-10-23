import java.util.Random;

public class ThreadDemo {
	public static void main(String[] args) {
		ThreadExample thrd = new ThreadExample();
		ThreadExample1 trd = new ThreadExample1();

		thrd.start();
		trd.start();

		for (int i = 1; i <= 5; i++) {
			System.out.print(" "+i);
		}
	}

}
