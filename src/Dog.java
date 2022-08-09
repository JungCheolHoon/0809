
public class Dog extends Mammal {

	public Dog(String name, int age) {
		super(name,age);
	}
	@Override
	public void saySomething() {
		System.out.println("멍멍 멍멍");
	}

}
