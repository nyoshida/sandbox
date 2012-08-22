package bridge;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CountDisplay d1 = new CountDisplay(new StringDisplayImpl("file.txt"));
		d1.randomDisplay(1);
		

	}

}
