import java.util.Scanner;
import static java.lang.System.out;		//쓸때는 import static 부를때는 static import
import static java.lang.Math.*;	//static 메소드까지 내려와서 import static라 붙여준다

public class StaticImportDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//in 은 삐뚤어진게 static
		int rand = (int)(random()*6+1);
		out.println("rand = " + rand);		//import static를사용하여 static로 선언된 메소드까지 Import하여 static생략가능
		out.println("PI = " + PI);		//out PI 는 삐뚤어진게 static이라 import안해도댐
	}
}
