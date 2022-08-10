/*
 * Abstract Method
 * -메소드의 선언부(header)만 있고, 구현부(body)가 없는 메소드
 * -메소드 리턴타입 앞에 abstract 키워드를 통해 컴파일러에게 바디가 없는 메소드라고 선언
 * -부모 클래스에서 선언된 메소드가 자식 클래스에서 정의할 수 있도록 만든 메소드
 * -Override의 강제화를 위한 메소드
 * -만일 클래스에 한 개 이상의 추상메소드를 가지면 그 클래스는 반드시 추상클래스가 되어야 한다.
 * 
 */
public class AbstractClassDemo {
	public static void main(String[] args) {
		Mammal m = new Dog("개" , 20 );
		m.saySomething();
		System.out.println(m.toString());
	}
}
