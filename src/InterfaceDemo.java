/*
 * 3. interface는 instacne화 할 수 없다
 */
public interface InterfaceDemo {		//abstract class = interface
//	int age = 20 ; 				//public static final 생략 (기본값)
//	String name = "박쥐";		//public static final 생략 (기본값)
	public static void main(String[] args) {
//		Datable d = new Datable();
		Datable d = new Dated();
		d.set(Datable.TUE);
		System.out.println(d.get());
	}

}
