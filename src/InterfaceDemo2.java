import java.util.Arrays;

public class InterfaceDemo2 {
	public static void main(String[] args) {
		Student[] array = { new Student("한지민", 56), new Student("박지민", 100), new Student("홍지민", 77) };
//		for (int i = 0; i < array.length - 1; i++) {
//			for (int j = 0; j < array.length - 1 - i; j++) {
				Arrays.sort(array);
				System.out.println(Arrays.toString(array));		//왜 재정의를 안했을때 값이 안나왔지
//			}
//		}
	}
}
