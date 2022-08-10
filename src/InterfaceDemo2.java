import java.util.Arrays;

public class InterfaceDemo2 {
	public static void main(String[] args) {
		Student[] array = { new Student("한지민", 56), new Student("박지민", 100), new Student("홍지민", 77) };
//		for (int i = 0; i < array.length - 1; i++) {
//			for (int j = 0; j < array.length - 1 - i; j++) {
				Arrays.sort(array);
				System.out.println(Arrays.toString(array));		//Student toString 재정의 안하면 출력안나옴. 그 이유는 array배열이 Student클래스
																			//이기때문. toString재정의해주면 array0번째부터 순서대로 student선택하면 
																			//to스트링 형태(format)으로 변환된 배열이 출력됌  
//			}
//		}
	}
}
