package tanining;
import java.util.Scanner;
public class Tanining {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("원화를입력하세요(단위:원)>>");
		int num =s.nextInt();
		double dollar=num/1100;
		System.out.println(num +"원은 $"+dollar+"입니다");
		s.close();

	}

}
