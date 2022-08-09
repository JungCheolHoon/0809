/*
 * 이종상속(자식은 class, 부모는 interface)의 경우에는 implements를 사용한다.
 */
public class Dated implements Datable {
	private int date;
	
	@Override
	public int get() {
		return date;
	}

	@Override
	public void set(int date) {
		this.date =date;
	}
	
}
