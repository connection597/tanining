package tanining;
import java.util.Scanner;
public class Tanining {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("��ȭ���Է��ϼ���(����:��)>>");
		int num =s.nextInt();
		double dollar=num/1100;
		System.out.println(num +"���� $"+dollar+"�Դϴ�");
		s.close();

	}

}
