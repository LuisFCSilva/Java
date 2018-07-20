package Static;

public class Counter {

	static {
		value = 1;
	}

	private static int value;

	public static int getValue() {
		return value;
	}

	public static void increment() {
		value++;
	}

}
