import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
				int n = sc.nextInt();
				int m = sc.nextInt();
				System.out.print(n + "x" + m + "=" + n*m);
				sc.close();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				
			}
		}
	}

}
