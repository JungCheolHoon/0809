/*
 * 1.public static final 이 생략된 변수와 public abstract이 생략된 메소드만 가진다.
 */
public interface Datable {
	int SUN = 0, Mon = 1 , TUE = 2 , WED = 3 , THU = 4 , FRI = 5 , SAT = 6;
	int get();
	void set(int date);
}
