/*
 * 4. interface 끼리의 상속은 extends를 사용한다. 그리고 다중 상속이 가능하다. class는 오직 하나
 */
public interface Father extends GrandFather, GrandMother {
	int Max = 100;
	void father();
	
}
