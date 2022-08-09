/*
 * 6. interface의 주소는 해당 인터페이스의 재정의된 메소드만 접근가능하다.
 * 7. interface배열에는 해당 인터페이스의 자식 클래스를 넣을 수 있다.
 */
public class InterfaceDemo1 extends Object implements Father, Mother {

	@Override
	public void grandFather() {
		System.out.println("Called by grandFather()");
	}

	@Override
	public void grandMother() {
		System.out.println("Called by grandMother()");
	}

	@Override
	public void mother() {
		System.out.println("Called by mother()");
	}

	@Override
	public void father() {
		System.out.println("Called by father()");
	}
	
	public static void main(String[] args) {
		GrandFather gFather = new InterfaceDemo1();	gFather.grandFather();			//자기자신의 메소드만 쓸 수 있고 그 기능을 받아오는게(Override) 다형성
		Father father = new InterfaceDemo1();		father.grandFather(); father.grandMother(); father.father();
		Mother [] array = new Mother[3];
		array[0] = new InterfaceDemo1();			//부모의 주소는 배열로 생성가능하나 객체선언은 override로 선언된 아들클래스로 선언해야함
		array[0].mother();
		System.out.println("Father's Max = " + Father.Max);			//인터페이스의 상수값은 static이므로 주소.메소드로 그대로 접근 가능
		System.out.println("Mother's Max = " + Mother.Max);
		InterfaceDemo1 de = new InterfaceDemo1();
//		System.out.println("Son's Max = "+ de.Max);					//아들이 어머니 아버지의 MAX값으로 중복이 나게 되면 아들의 주소로는 쓸 수 없음
		
	}
}
