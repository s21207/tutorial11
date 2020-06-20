package pgo10;

public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void start();
	public abstract void stop();
	public abstract String getType();
	
	public String getName() {
		return name;
	}
	
}
