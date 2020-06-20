package pgo10;

public class Task2 {
	public static void main(String[] args) {
		Cat mruczek = new Cat("Mruczek");
		mruczek.start();
		System.out.println(mruczek.getType());
		mruczek.stop();
	}
}
