package Collections;

public class ArrayListDemo {

	public static void main(String[] args) {

		try {
			m();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void m() {
		try {
			String s = null;
			System.out.println(s.toLowerCase());
		} catch (Exception e) {
			throw new NullPointerException("Value cannot be null");
		}
		System.out.println("End of program");

	}

}
