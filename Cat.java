package pgo10;

public class Cat extends Animal {
	
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void start() {
		System.out.println("Cat Starts");
		
	}

	@Override
	public void stop() {
		System.out.println("Cat Stops");
		
	}

	@Override
	public String getType() {
		return "Cat";
	}

}
