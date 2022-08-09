
public abstract class Mammal {
	private String name;
	private int age;
	public Mammal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public abstract void saySomething() ;
	@Override
	public String toString() {
		return String.format("Mammal [name=%s, age=%s]", name, age);
	}
}
